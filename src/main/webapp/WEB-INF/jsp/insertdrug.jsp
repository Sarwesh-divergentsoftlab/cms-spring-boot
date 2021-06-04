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
	<form action="/CRUDdrug/insert" method="post">
			<table>
				<tr>
					<td><h1>Enter Drug Details</h1></td>
				</tr>
				<tr>
					<td>Enter Drug Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Enter Drug Id</td>
					<td><input type="text" name = "id"></td>
				</tr>
				<tr>
					<td>Enter Drug Price</td>
					<td><input type="text" name = "price"></td>
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