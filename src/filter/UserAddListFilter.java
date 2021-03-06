package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.User;

/**
 * Servlet Filter implementation class UserAddFilter
 */
@WebFilter(description = "sprecava dodavanje korisnika, ako korisnik nije ulogovan", urlPatterns = { "/application/*" })
public class UserAddListFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserAddListFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String uri = req.getRequestURI();
		
		HttpSession session = req.getSession(false);
		
		if(session == null && (uri.endsWith("/user/add") || uri.endsWith("/user/list"))){
			String loggedMessage = "Morate biti ulogovani, kako bi mogli da pristupate svim resursima!";
			req.setAttribute("loggedMessage", loggedMessage);
			res.sendRedirect("/pages/Home.jsp");
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
		
//		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
