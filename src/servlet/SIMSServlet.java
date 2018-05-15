package servlet;

import static parameter.AccessControlMap.ACCESS_CONTROL_MAP;
import static parameter.ContentPaths.ERROR_JSP;
import static parameter.ContentPaths.LOGIN_JSP;
import static parameter.ErrorMessages.ACCESS_ERROR;
import static parameter.ErrorMessages.SESSION_TIMEOUT;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginSession;

public class SIMSServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * SIMSServletを継承したサーブレットは、リクエストの都度、serviceメソッドが実行される。 ここでログインセッションの有無を確認する。
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String role;
		// セッションタイムアウト発生時、またはログイン前にログイン後機能へのURL直打ちに対応
		if (session == null) {
			request.setAttribute("errMsg", SESSION_TIMEOUT);
			getServletContext().getRequestDispatcher(LOGIN_JSP).forward(request, response);
			return;
		} else {
			// セッションにログインセッションが無かった場合もセッションタイムアウト
			LoginSession loginSession = (LoginSession) session.getAttribute("loginSession");
			if (loginSession == null) {
				request.setAttribute("errMsg", SESSION_TIMEOUT);
				getServletContext().getRequestDispatcher(LOGIN_JSP).forward(request, response);
				return;
			} else {
				role = loginSession.getRole();
				// ロールをリクエストに設定
				request.setAttribute("role", role);
			}
		}

		// URL直打ち対応（サーブレットパスとロールからアクセス可否を判定する）
		if (!ACCESS_CONTROL_MAP.get(request.getServletPath()).get(role)) {
			request.setAttribute("errMsg", ACCESS_ERROR);
			getServletContext().getRequestDispatcher(ERROR_JSP).forward(request, response);
			return;
		}

		// スーパークラスのserviceメソッドを呼び出す
		super.service(request, response);
	}

}
