<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset= "ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:form action="saveTeacher" modelAttribute="teacher">
	
	<c:label path="teacherId">Teacher Id</c:label>
	<c:input path="teacherId" placeholder="enter teacher id" />
	
	<c:label path="teacherName">Teacher Name</c:label>
	<c:input path="teacherName" placeholder="enter tecaher name" />
	
	<c:label path="teacherSubject">Teacher Subject</c:label>
	<c:input path="teacherSubject" placeholder="enter teacher subject" />
	
	<c:button type="submit"> Save </c:button>
	
	</c:form>
</body>
</html>