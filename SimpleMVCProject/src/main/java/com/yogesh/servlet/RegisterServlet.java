package com.yogesh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yogesh.entity.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String mobile = request.getParameter("txtMobile");
		String gender = request.getParameter("rdGender");
		String description = request.getParameter("txtDescription");
		String password = request.getParameter("txtPassword");
		
		System.out.println(name + " " + email + " " + mobile + " " + gender +  " " + description + password);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		User user = new User();
		
		user.setName(name);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setGender(gender);
		user.setDiscriptionString(description);
		user.setPassword(password);
		
		System.out.println("Data :" + user.toString());
		
		session.save(user);
		
		session.close();
		
		
		
	}

}
