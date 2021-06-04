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
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Id</th>
				<th>Age</th>
				<th>Weight</th>
				<th>Application date</th>
				<th>Problem</th>
				<th>Contact</th>
			</tr>
		</thead>
		<c:forEach items="${allpatient}" var="patient">
			<tr>
				<td><c:out value="${patient.name}" /></td>
				<td><c:out value="${patient.patient_id}" /></td>
				<td><c:out value="${patient.age}" /></td>
				<td><c:out value="${patient.weight}" /></td>
				<td><c:out value="${patient.app_date}" /></td>
				<td><c:out value="${patient.contact}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>