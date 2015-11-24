<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<form:form action="addJobSeeker.do" commandName="jobSeeker" enctype="multipart/form-data" method="post">
<table>
<tr><td>Enter first Name</td><td><form:input path="firstName"></form:input></td><td><form:errors path="firstName"/></td></tr>

<tr><td>Enter Last Name</td><td><form:input path="lastName"></form:input></td><td><form:errors path="lastName"/></td></tr>
<tr><td>Enter EmailId</td><td><form:input path="emailId"></form:input></td><td><form:errors path="emailId"/></td></tr>

<tr><td>Enter Date of birth:</td><td> <form:input  path="dateOfBirth" id="datepicker" ></form:input></td><td><form:errors path="dateOfBirth"/></td></tr>


<tr><td>Enter Contact Number</td><td><form:input path="contactNumber"></form:input></td><td><form:errors path="contactNumber"/></td></tr>
<tr><td>Enter Salary</td><td><form:input path="salary"></form:input></td><td><form:errors path="salary"/></td></tr>
<tr>
		
		<td>Select question:</td><td><form:select path="securityQuestion"><form:errors path="securityQuestion"/>
			<form:option value="What is your first pet's name?">What is your first pet's name?</form:option>
			<form:option value="What is your first teacher's name?">What is your first teacher's name?</form:option>
			<form:option value="What is your first friend's name?">What is your first friend's name?</form:option>
					
		</form:select>
		</td>
	</tr>
	
	<tr>
	
		<td>Enter answer:</td><td><form:input path="securityQuestionAnswer" /></td><td><form:errors path="securityQuestionAnswer"/></td>
	</tr>
	
	<tr>
		<td><form:label path="bloodGroup">BloodGroup</form:label></td>
		<td><form:select path="bloodGroup">
			<form:option value="A+ve">A+ve</form:option>
			<form:option value="A-ve">A-ve</form:option>
			<form:option value="B+ve">B+ve</form:option>
			<form:option value="B-ve">B-ve</form:option>
			<form:option value="AB+ve">AB+ve</form:option>
			<form:option value="AB-ve">AB-ve</form:option>
			<form:option value="O+ve">O+ve</form:option>
			<form:option value="O-ve">O-ve</form:option>
			
		</form:select>
		</td>
	</tr>
	<tr><td>Enter username</td><td><form:input path="userName"></form:input></td><td><form:errors path="userName"/></td></tr>
	
<tr><td>Enter Password</td><td><form:password path="password"></form:password></td><td><form:errors path="password"/></td></tr>
<tr><td>Upload Image</td><td><form:input path="imageContent" type="file"></form:input></td><td><form:errors path="imageContent"/></td></tr>

<tr><td>Upload Resume</td><td><form:input path="resumeContent" type="file"></form:input></td><td><form:errors path="resumeContent"/></td></tr>

</table>

<input type="submit" value="NEXT"/>
</form:form>

</body>
</html>