<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<link href='<spring:url value="/resources/css/bootstrap.min.css"/>'rel="stylesheet" />
</head>
<body>
<div class="row">
<div class="col-sm-4"></div>
<div class="col-sm-4">
<form:form action ="ProcessRegistration" modelAttribute="objReg">
<h2 align="center">User Registration Form</h2>
     <div class="form-group">
     <form:label path="userName">Name</form:label>
     <form:input path="userName" class="form-control"/>
     </div>
     
     <div class="form-group">
     <form:label path="userEmail">Email</form:label>
     <form:input path="userEmail" class="form-control"/>
     </div>
     
     <div class="form-group">
     <form:label path="password">Password</form:label>
     <form:input path="password" class="form-control"/>
     </div>
     
     <div class="form-group">
     <form:label path="country">Region</form:label>
     <form:select path="country" class="form-control">
     <form:option value="" label="--Select--"/>
     <form:options items="${countryList}"/>
     
     </form:select>
     </div>
     
     
     <div class="form-group">
     <form:label path="gender">Gender</form:label>
     <form:radiobutton path="gender" value ="M" label = "Male"/>
     <form:radiobutton path="gender" value="F" label = "Female"/>
     <form:radiobutton path="gender" value="O" label = "Others"/>
    
     </div>
     
      <div class="form-group">
     <input type="submit" value= "Register Now"  class="form-control btn btn-info"/>
     </div>
    
     </form:form>
     <h2>${objReg.msg}</h2>
     </div>
     <div class="col-sm-4"></div>
     </div>
</body>
</html>
