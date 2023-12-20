<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Fetch data from database in Spring MVC</h2>


	<table border="1">

		<th>UserID</th>
		<th>UserName</th>
		<th>UserEmail</th>
		<th>UserPassword</th>
		<th>Country</th>
		<th>Gender</th>
		
		

		<c:forEach var="user" items="${listUser}" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${emp.name}</td>
				<td>${emp.designation}</td>
				<td>${emp.dept}</td>
				<td>${emp.salary}</td>
				<td>${emp.location}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>