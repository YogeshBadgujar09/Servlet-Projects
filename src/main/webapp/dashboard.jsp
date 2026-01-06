<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.yogesh.entity.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>									
		<h1>Welcome ${sessionScope.user.name}</h1>
		
		<table border=1>
				<thead>
						<tr> 
								<td> User Id  </td>
								<td> ${sessionScope.user.userId} </td>
						</tr>
						
						<tr> 
								<td> Name  </td>
								<td> ${sessionScope.user.name} </td>
						</tr>
						
						
						<tr> 
								<td> Email </td>
								<td> ${sessionScope.user.email}</td>
						</tr>
						
						<tr>
								<td> Mobile </td>
								<td> ${sessionScope.user.mobile} </td>
						</tr>
						
						
						<tr> 
								<td> Password </td>
								<td> ${sessionScope.user.password}</td>
						</tr>
						
						
						<tr> 
								<td> Gender </td>
								<td>${sessionScope.user.gender} </td>
						</tr>
						
						
						<tr> 
								<td> Description </td>
								<td> ${sessionScope.user.discription}</td>
						</tr>
						
				</thead>
		</table>
		
		
	
</body>
</html>