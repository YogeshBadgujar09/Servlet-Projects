package com.yogesh.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yogesh.dao.UserDAOimplement;
import com.yogesh.entity.User;
import com.yogesh.model.UserModel;
import com.yogesh.services.UserServices;
import com.yogesh.services.UserServicesImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private UserServices userServices ;
    private HttpSession httpSession  ;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		userServices = new UserServicesImp();
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		System.out.println("\n Login Data \n\nEmail : " + email + " Password :" + password );
		
		User user = userServices.loginService(email, password);
		
		if(user != null){
			
			httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			
			response.sendRedirect("dashboard.jsp");
			
			System.out.println("Get Seesion Id " + httpSession);
			
		}else {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		
	}

}
