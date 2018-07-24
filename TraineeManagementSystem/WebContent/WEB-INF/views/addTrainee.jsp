<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adde</title>
</head>
<body>
<style >
.error{

color:red;
font_weight:bold;
}
</style>
</head>
<body>
<div align="center">
<h2>Create Account</h2>


<form:form action="add" method="post" modelAttribute="trainee">
<table align="center">
<tr>
<td>Trainee Id:</td>
<td><form:input path="traineeId" size="30"/></td>
<td><form:errors path="traineeId" cssClass="error"/></td>
</tr>

<tr>
<td>Trainee Name:</td>
<td><form:input path="traineeName" size="30"/></td>
<td><form:errors path="traineeName" cssClass="error"/></td>
</tr>

<tr>
<td>Trainee Location:</td>
<td><form:radiobutton path="traineeLocation" value="Chennai" />Chennai <form:radiobutton path="traineeLocation" value="Bangalore" />Bangalore <form:radiobutton path="traineeLocation" value="Pune" />Pune<form:radiobutton  path="traineeLocation" value="Mumbai" />Mumbai </td>
<td><form:errors path="traineeLocation" cssClass="error"/></td>
</tr>
<tr><td>Trainee Domain:</td>
<td><form:select path="traineeDomain"><form:option value="Java">Java</form:option><form:option value="JavaScript">JavaScript</form:option></form:select></td>
</tr>
<%-- <tr>
        <td>Apple </td>
        <td><form:checkbox path="favoriteFruit" value="apple" /></td>
    </tr>
    <tr>
        <td>Orange </td>
        <td><form:checkbox path="favoriteFruit" value="orange" /></td>
    </tr>
    <tr>
        <td>Banana </td>
        <td><form:checkbox path="favoriteFruit" value="banana" /></td>
    </tr>
    <tr> --%>
<tr>
<td><input type="submit" value="add Trainee"/></td>
</tr>
</table>
</form:form>
</div>
</body>
</html>