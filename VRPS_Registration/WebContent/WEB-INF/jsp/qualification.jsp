<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 3 MVC Series-Address</title>
</head>
<body>
<h2>Qualification</h2>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- <h1>Job Seeker Id</h1> ${jobSeekerId} -->

<form:form action="addToQualificationDatabase.do" commandName="qualification">
<table>

<tr><td>Job Seeker Id:</td><td><form:input path="jobSeekerId" readonly="true"></form:input></td></tr>
<tr><td>Enter degreeName </td><td><form:input path="degreeName"></form:input></td><td>
<tr><td>Enter  collegeName </td><td><form:input path="collegeName"></form:input></td><td></td></tr>
<tr><td>Enter fromDate </td><td><form:input path="fromDate"></form:input>
<tr><td>Enter toDate </td><td><form:input path="toDate"></form:input>
<tr><td>Enter aggregate </td><td><form:input path="aggregate"></form:input>
</table>
<input type="submit" value="NEXT"/>
</form:form>



</body>
</html>