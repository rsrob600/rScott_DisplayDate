<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Time Page</title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
    <script><%@include file="/WEB-INF/js/app.js"%></script>
</head>
<body id="time" onload="time()">
	
	<div class="time">
		<h1><c:out value="${timeValue}"/></h1>
	</div>

</body>
</html>