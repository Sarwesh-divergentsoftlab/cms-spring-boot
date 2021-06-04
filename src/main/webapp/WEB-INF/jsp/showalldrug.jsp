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
	<table border="15">
		<thead>
			<tr>
				<th>Name</th>
				<th>Id</th>
				<th>Price</th>
			</tr>
		</thead>
		<c:forEach items="${alldrug}" var="drug">
			<tr>
				<td><c:out value="${drug.name}" /></td>
				<td><c:out value="${drug.drug_id}" /></td>
				<td><c:out value="${drug.drug_price}" /></td>
			</tr>
		</c:forEach>
	</table>
			
</body>
</html>