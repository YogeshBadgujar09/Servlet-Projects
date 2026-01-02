package com.yogesh.filters;

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

@WebFilter(urlPatterns = {"/dashboard.jsp"})
public class AuthenticationFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
			HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;

	        // 🔐 Disable cache (prevents back button issue)
	        httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	        httpResponse.setHeader("Pragma", "no-cache");
	        httpResponse.setDateHeader("Expires", 0);

	        HttpSession session = httpRequest.getSession(false);

	        if (session == null || session.getAttribute("user") == null) {
	            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
	            return;
	        }

	        chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
