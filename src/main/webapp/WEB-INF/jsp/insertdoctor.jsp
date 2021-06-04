<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="/CRUDdoctor/insert" method="post">
			<table>
				<tr>
					<td><h1>Enter Doctor Details</h1></td>
				</tr>
				<tr>
					<td>Enter Doctor Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Enter Doctor Id</td>
					<td><input type="text" name = "id"></td>
				</tr>
				<tr>
					<td>Enter Doctor Fees</td>
					<td><input type="text" name = "fees"></td>
				</tr>
				<tr>
					<td>Enter Doctor Degree</td>
					<td><input type="text" name = "degree"></td>
				</tr>
				<tr>
					<td>Enter Doctor Specialization</td>
					<td><input type="text" name = "specialization"></td>
				</tr>
				<tr>
					<td>Enter Doctor Prescription</td>
					<td><input type="text" name = "prescription"></td>
				</tr>
				<tr>
					<td></td>
					<td><button type="submit">add</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>