package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class SIMSFilter
 */
@WebFilter("/*")
public class SIMSFilter implements Filter {

	private String encoding = "UTF-8";

	/**
	 * Default constructor.
	 */
	public SIMSFilter() {

	}

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// place your code here
		request.setCharacterEncoding(encoding);
		response.setContentType("text/html; charset=" + encoding);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
