<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   ${student.lastName}, ${student.firstName} registered successfully !!!
   <br/> <br/>
   ${student.firstName} ${student.lastName} is from ${student.country} 
    <br/> <br/>
    Favorite language :  ${student.programLanguage} 
    <br/> <br/>
    Operating systems
     <c:forEach var="temp" items="${student.operatingSystems}">
       <ul>
         <li>${temp}</li>
       </ul>
      
     </c:forEach>
</body>
</html>