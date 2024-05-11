<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Login1 page</h3>
<p>${error }</p>
	<form:form action="login1" method="post" modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="username">Username:</form:label>  </td>
				<td><form:input path="username"  /></td> <!-- <input type="text" name="username" id="usernmae" /> -->
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password"  /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Login</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>