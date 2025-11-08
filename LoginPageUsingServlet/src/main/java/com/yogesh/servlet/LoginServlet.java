package com.yogesh.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 String email =	request.getParameter("email");
	 String password = request.getParameter("password");
	 
	 System.out.println("Email:" + email + "\nPassword :" + password);
	 
	 if(email.equals("yogesh@gmail.com") && password.equals("Test@123")) {
		 
		 PrintWriter printWriter = response.getWriter();
		 printWriter.print("<h2> Welcome Back " + email + ".... !!!" );
		 
	 }else {
		 PrintWriter printWriter = response.getWriter();
		 printWriter.print("Ohh Sorry ... Your Credential not Match .... !!!");
	 }
		
	}

}
