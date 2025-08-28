package com.yogesh.login;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
		PrintWriter out;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			
			if(username.equals("admin") && password.equals("test123")) {
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcome");
				requestDispatcher.forward(request, response);
				
				request.setAttribute("username", username);
				request.setAttribute("password", password);
				
				
			}else {
				out = response.getWriter();
				out.println("Credentials Not Match .... !!!");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
