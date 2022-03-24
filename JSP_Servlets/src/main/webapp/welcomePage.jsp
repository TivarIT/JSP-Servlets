<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Logged In</title>
</head>
<body>
	<%
		if(session.getAttribute("login") == null && session.getAttribute("password") == null){
			response.sendRedirect("./loginForm.jsp");
		}
	%>
	<table style="with: 50%">
	<tr><td>
	<br>Login: ${username}
	<br>Password: ${password}
	<br>CurrentDate: ${currentDate}
	<br>
	<br>-----Operators count-----
	<br>
	<br>!=: ${sravCount}
	<br>&&: ${logiCount}
	<br>=: ${prisCount}
	<br>
</td></tr>
<tr></tr><tr><td></td><td></td><td><a href="./loginForm.jsp"><b>Logout</b></a></td></tr>
</table>
</body>
</html>

