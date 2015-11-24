<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 3 MVC Series-Address</title>
</head>
<body>
<h2>Skills</h2>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- <h1>Job Seeker Id</h1> ${jobSeekerId} -->

<form:form action="addToSkillDatabase.do" commandName="skill">
<table>

<tr><td>Job Seeker Id:</td><td><form:input path="jobSeekerId" readonly="true"></form:input></td></tr>
<tr><td>Enter skillName</td><td><form:input path="skillName"></form:input></td><td><form:errors path="skillName"/></td></tr>
<tr><td>Enter version</td><td><form:input path="version"></form:input></td><td><form:errors path="version"/></td></tr>
<tr><td>Enter experience</td><td><form:input path="experience"></form:input></td><td><form:errors path="experience"/></td></tr>


</table>



<input type="submit" value="NEXT"/>
</form:form>



</body>
</html>