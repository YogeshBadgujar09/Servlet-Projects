<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="css/loginPage.css">
</head>
<body>
	<div class="login-box">
		<h2>Login</h2>
		
		<form action="LoginServlet" method="post">
			
			<input type="email" name="txtEmail" placeholder="Email" required>
			<input type="password" name="txtPassword" placeholder="Password" required>
			
			<button type="submit">Login</button>
			
			<p>Don't have an account? <a href="registrationPage.jsp">Register</a></p>
		</form>
		
	</div>
</body>
</html>