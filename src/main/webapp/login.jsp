<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
		
		<link rel="stylesheet" href="css/style.css">
		
</head>
<body>
		
		<%
			int flag = -1 ;
		
			if(flag == 1){
				System.out.println("Dashboard Page Open please");
			}else{
				System.out.println("Login Page Open Please ");
			}
		
		%>
		

		  <div class="login-container">
        <h2>Login</h2>

        <form action="LoginServlet" method="post">
        	<input type="hidden" name="txtHidden" value="${sessionScope.flag}">
        
            <input type="email" name="txtEmail" placeholder="Email" required>
            <input type="password" name="txtPassword" placeholder="Password" required>

            <button type="submit">Login</button>
        </form>

        <div class="links">
            <a href="#">Forgot Password?</a>
            <a href="register.html">Register</a>
        </div>
    </div>
</body>

</html>