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
		<form action="/CRUDpatient/insert" method="post">
			<table>
				<tr>
					<td><h1>Enter Patient Details</h1></td>
				</tr>
				<tr>
					<td>Enter Patient Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Enter Patient Id</td>
					<td><input type="text" name = "id"></td>
				</tr>
				<tr>
					<td>Enter Patient Age</td>
					<td><input type="text" name = "age"></td>
				</tr>
				<tr>
					<td>Enter Patient Weight</td>
					<td><input type="text" name = "weight"></td>
				</tr>
				<tr>
					<td>Enter Patient Problem</td>
					<td><input type="text" name = "problem"></td>
				</tr>
				<tr>
					<td>Enter Patient Application Date</td>
					<td><input type="text" name = "app"></td>
				</tr>
				<tr>
					<td>Enter Patient Contact</td>
					<td><input type="text" name = "contact"></td>
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