<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>${error }</p>
	<form action="login" method="post">
		<table>
			<tr>
				<td><label for="username">Username</label></td>
				<td><input type="text" name="username" id="username"></td>
			</tr>
			<tr>
				<td><label for="password">password</label></td>
				<td><input type="text" name="password" id="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Login</button></td>
			</tr>
		</table>
	</form>
</body>
</html>