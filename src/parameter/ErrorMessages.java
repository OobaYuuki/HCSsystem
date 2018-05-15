/**
 * ErrorMessages.java  エラーメッセージの定義クラス
 */
package parameter;

public class ErrorMessages {
	private ErrorMessages() {
	}

	public static final String SESSION_TIMEOUT = "ログイン情報の取得に失敗しました。<br />もう一度ログインしてください。";
	public static final String ACCESS_ERROR = "アクセスエラーです。<br />使用を許可された社員でログインし直してください。";
	public static final String SYAINNO_REQUIRED = "社員番号を入力してください。";
	public static final String SYAINNO_DIGIT = "社員番号は半角英数字5桁で入力してください。";
	public static final String SYAINNO_ISENTRYED = "この社員番号は登録済みです。もう一度入力し直してください。";
	public static final String NOTEXISTS_SYAIN = "存在しない社員、または退社した社員の情報は変更できません。";
	public static final String SYAINNAME_REQUIRED = "社員名を入力してください。";
	public static final String SYAINNAME_DIGIT = "社員名は全角25桁以内で入力してください。";
	public static final String PASSWORD_REQUIRED = "パスワードを入力してください。";
	public static final String PASSWORD_DIGIT = "パスワードは半角英数字4～10桁以内で入力してください。";
	public static final String STATUS_REQUIRED = "在籍状況を選択してください。";
	public static final String LOGIN_PARAM_MISTAKE = "社員番号、またはパスワードに誤りがあります。";

}
