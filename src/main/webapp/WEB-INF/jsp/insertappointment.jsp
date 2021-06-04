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
		<form action="/appointmentOP/insert" method="post">
			<table>
				<tr>
					<td><h1>Make Appointment</h1></td>
				</tr>
				<tr>
					<td>Enter Appointment Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Enter Patient Id</td>
					<td><input type="text" name="pid"></td>
				</tr>
				<tr>
					<td>Enter Doctor Id</td>
					<td><input type="text" name = "did"></td>
				</tr>
				<tr>
					<td>Enter Problem</td>
					<td><input type="text" name = "problem"></td>
				</tr>
				<tr>
					<td>Enter Appointment date</td>
					<td><input type="text" name = "app"></td>
				</tr>
				<tr>
					<td>Enter time</td>
					<td><input type="text" name = "time"></td>
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