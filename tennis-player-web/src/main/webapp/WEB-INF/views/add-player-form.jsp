<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Player</title>
</head>
<body>
	<h2>Player Form</h2>
	<hr>
	<form:form action = "processPlayerForm" modelAttribute="athlete">
		<br><br>
		Name: <form:input path = "lastName"/>

		<br><br>
	    Country: <form:select path="country">
  	        <form:option value="AUT" label="Austria"/>
	        <form:option value="FRA" label="France"/>
	        <form:option value="SRB" label="Serbia"/>
	        <form:option value="SUI" label="Switzerland"/>
	        <form:option value="USA" label="United States of America"/>
	    </form:select>

	    <br><br>
		Handedness: &emsp;
			Left-Handed <form:radiobutton path="handedness" value="Left-Handed"/> &emsp;
			Right-Handed <form:radiobutton path="handedness" value="Right-Handed"/> &emsp;
			Ambidextrous <form:radiobutton path="handedness" value="Ambidextrous"/>

		<br><br>
		Grand Slam Titles Won: &emsp;
			Australian Open <form:checkbox path="grandSlams" value="Australian Open"/> &emsp;
			French Open <form:checkbox path="grandSlams" value="French Open"/> &emsp;
			Wimbledon <form:checkbox path="grandSlams" value="Wimbledon"/> &emsp;
			US Open <form:checkbox path="grandSlams" value="US Open"/>

	    <br><br>
		<input type ="submit" value = "Add Player"/>

	</form:form>

</body>
</html>