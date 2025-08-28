package com.yogesh.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessfulLoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			PrintWriter out = response.getWriter();
			out.println("<h1>  Welcome Back " + username + "Your Password is :" + password + "</h1>");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
