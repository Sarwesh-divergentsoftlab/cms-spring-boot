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

	<table id="example" class="table table-striped table-bordered" border="15">
		<thead>
			<tr>
				<th>Name</th>
				<th>Id</th>
				<th>Fees</th>
				<th>Degree</th>
				<th>Specialization</th>
				<th>Prescription</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alldoctor}" var="doctor">
				<tr>
					<td><c:out value="${doctor.name}" /></td>
					<td><c:out value="${doctor.doctor_id}" /></td>
					<td><c:out value="${doctor.fees}" /></td>
					<td><c:out value="${doctor.degree}" /></td>
					<td><c:out value="${doctor.specializatio}" /></td>
					<td><c:out value="${doctor.prescription}" /></td>					



				</tr>
			</c:forEach>
		</tbody>
	</table>
			
</body>
</html>