<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Display Home Page</title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>

	<!-- <h3><c:out value="${currentTime}"/></h3>  -->
	
	<div class='container'>
		<ul class="navbar">
			<li><a href="/date">Date Template</a></li>
			<li><a href="/time">Time Template</a></li>
		</ul>
	</div>



</body>
</html>