<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 3 MVC Series-Address</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- <h1>Job Seeker Id</h1> ${jobSeekerId} -->
<h1>AddressDetails</h1>
<form:form action="addToAddressDatabase.do" commandName="address">
<table>

<tr><td>Job Seeker Id:</td><td><form:input path="jobSeekerId" readonly="true"></form:input></td></tr>
<tr><td>Enter DoorNo</td><td><form:input path="doorNumber"></form:input></td><td><form:errors path="doorNumber"/></td></tr>
<tr><td>Enter State</td><td><form:input path="state"></form:input></td><td><form:errors path="state"/></td></tr>
<tr><td>Enter City</td><td><form:input path="city"></form:input></td><td><form:errors path="city"/></td></tr>
<tr><td>Enter Street</td><td><form:input path="street"></form:input></td><td><form:errors path="street"/></td></tr>
<tr><td>Enter Zipcode</td><td><form:input path="zipcode"></form:input></td><td><form:errors path="zipcode"/></td></tr>


</table>



<input type="submit" value="NEXT"/>
</form:form>



</body>
</html>