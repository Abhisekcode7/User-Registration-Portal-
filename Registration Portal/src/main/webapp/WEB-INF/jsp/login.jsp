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
<div style="margin:150px auto">
<form:form action ="Login-panel" modelAttribute="objuser">
     
     <h1 align="center">Login Here...</h1>
     <div id="box" >
     
     <form:input path="userName" class="form-control"/><br/>
     <form:password path ="userPasswd"  class="form-control"/><br/>
     <input type ="submit" value="Login" name ="action" class ="btn btn-info Login"/>
<input type ="submit" value="Register Now"  name="action" class ="btn btn-info Login"/>
     
     </div>
     </form:form>
     <h1>${msg}</h1>
     </div>
</body>
</html>
