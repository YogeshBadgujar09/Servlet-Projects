package com.yogesh.addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c ;
		
		c = a + b ;
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Result :" +  c);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
