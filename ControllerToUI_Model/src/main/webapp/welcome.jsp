<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelcomePage</title>
</head>
<body>
<c:forEach items="${data}" var="u">
<h2><marquee direction="right">Welcome!!! ${u.username}  </marquee></h2>
<h3>Password:- ${u.password}</h3>
</c:forEach>
</body>
</html>