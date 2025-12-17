<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="css/registrationPage.css">
<script type="text/javascript" src="js/passwordMatch.js"></script>
</head>
<body>
			
		<div class="register-box">
		
				<h2>Registration</h2>
			<form onSubmit="return confirmPasswordMatch()" action="RegistrationServlet" method="post">
				
				<input type="text" name="txtName" placeholder="Full Name"  required>
				
				<input type="tel" name="txtMobileNo"  placeholder="Mobile Number" required>
				
				<input type="email" name="txtEmail" placeholder="Email" required>
				
				<input type="password" name="txtPassword" placeholder="Password" required>
				
				<input type="password" name="txtConfirmPassword" placeholder="Confirm Password" required>
				
				<button type="submit">Submit</button>
				
				<p>Already registered? <a href="loginPage.jsp">Login</a></p>
			</form>
		</div>
				
</body>
</html>