<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>

  	<div><form action="loginadmin" method="post">
                    <table align="center">
                    <tr><td><h1>Admin Login</h1></td></tr>
                        <tr><td>user id</td><td><input type="text" name="userId" placeholder="your id" style="border-radius:30px"></td></tr>
                        <tr><td>password</td><td><input type="password" name="password" style="border-radius:30px" placeholder="password"></td></tr>
                        <tr><td></td><td><button name="login" style="border-radius:30px">login</button><a href="">forget password</a></td></tr>
                    </table>
                    </form>
		
	</div>

</body>
</html>