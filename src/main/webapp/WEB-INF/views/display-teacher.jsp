<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
	<tr>
	<th>Teacher Id</th>
	<th>Teacher Name</th>
	<th>Teacher Subject</th>
	<th>Date and Time</th>
	<th>Delete</th>
	<th>Update</th>
	</tr>
	
	<c:forEach var="teacher" items="${teacherData}">
	
	<tr>
	<td>${teacher.getTeacherId()}</td>
	<td>${teacher.getTeacherName()}</td>
	<td>${teacher.getTeacherSubject()}</td>
	<td>${teacher.getLocalDateTime()}</td>
	<td><a  href="deleteTeacher?teacherId=${teacher.getTeacherId()}"><button>Delete</button></a></td>
	<td><a  href="updateTeacher?teacherId=${teacher.getTeacherId()}"><button>Update</button></a></td>
	</tr>
	
	</c:forEach>
	
	</table>
</body>
</html>