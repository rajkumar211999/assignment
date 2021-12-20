<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<form action="checkingEntry" method="post">
  		<label for="em">Email ID:</label><br>
  		<input type="text" id="em" name="emailId"><br>
  		<label for="na">User Name:</label><br>
  		<input type="text" id="na" name="userName"><br>
  		<label for="pw">Password:</label><br>
  		<input type="text" id="pw" name="password"><br>
  		<input type="submit">
	</form>
</body>
</html>