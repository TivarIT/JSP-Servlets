<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Login form</title>
</head>
<body>
<form action="./LoginServlet">
		<table style="with: 50%"> 
			<tr>
				<td>Login</td>
				<td><input type="text" name="login"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pass"></td>
			</tr>
		</table>
		<input type="submit" value="Login"></form>
</body>
</html>
