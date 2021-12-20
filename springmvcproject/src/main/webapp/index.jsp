<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
 <h1>This Is HomePage</h1>
<h1>Called By Home COntroller</h1>
 <h1>url /home</h1>
 <h1>name is shuaib</h1>
 
<a class="opcion" href="<%= request.getContextPath()%>/helloworld">Open Program</a>
</body>
</html>