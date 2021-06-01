<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	doctor login success
	<form action="doctor">
		<button type="submit" formaction="doctorOp">Show All Patient</button>
		<button type="submit" formaction="loginadmin">Add prescription</button>
		<button type="submit" formaction="loginadmin">See booked appointments</button>
		<button type="submit" formaction="loginadmin">Check patient history</button>
		<button type="submit" formaction="loginadmin">Create Invoice</button>
		<button type="submit" formaction="loginadmin">Logout</button>
	</form>
</body>
</html>