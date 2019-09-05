<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Korera App</title>
</head>
<body>
	<h2>Welcome to Korera</h2>
		
	<form action='<spring:url value="/logout"/>' method="post">
		<input value="Logout" type="submit">
	</form>

</body>
</html>
