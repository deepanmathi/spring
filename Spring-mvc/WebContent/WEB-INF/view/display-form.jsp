<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
<img src="${pageContext.request.contextPath}/resources/images/sample.jpeg" />
Student name : ${param.studentName}
<br>
Message is : ${message}
</body>
</html>