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
	<form action="/CRUDdrug/update" method="post">
		<table>
			<h1>Update Drug</h1>
			<tr>
				<td><select name="option">
						<option>update option
						<option>update name
						<option>update price
				</select></td>
			</tr>
			<tr>
				<td>enter id</td>
				<td><input type="text" name="id" placeholder="Id"></td>
			</tr>
			<tr>
				<td>enter updated info</td>
				<td><input type="text" name="info" placeholder="information"></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">update</button></td>
			</tr>
		</table>
	</form>

</body>
</html>