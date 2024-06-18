<%@page import="java.time.LocalDate"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>

<%
LocalDate currentDate = LocalDate.now();
%>

<p><i>Current Date: <%= currentDate %> </i></p>
<p><i>Today is <%= currentDate.getDayOfWeek() %> </i></p>

<h2>Welcome to the tennis player database!</h2>

<form action="/player.do" method="POST">
<b>Player name: <input type="text" name="name"/></b>
                <input type="submit" value="Enter"/>
</form>

</body>
</html>