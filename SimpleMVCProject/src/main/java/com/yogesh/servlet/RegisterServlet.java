package com.yogesh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yogesh.dao.UserDAOimplement;
import com.yogesh.model.UserModel;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserModel userModel = new UserModel();
		
		userModel.setName(request.getParameter("txtName"));
		userModel.setEmail(request.getParameter("txtEmail"));
		userModel.setMobile(request.getParameter("txtMobile"));
		userModel.setGender(request.getParameter("rdGender"));
		userModel.setDiscription(request.getParameter("txtDescription"));
		userModel.setPassword(request.getParameter("txtPassword"));
		
		System.out.println("Data :" + userModel.toString());
		
		new UserDAOimplement().setUser(userModel);
		
	}

}
