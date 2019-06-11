<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form:form  action="processForm" modelAttribute="student">
     First Name: <form:input path="firstName"/>
     <br/> <br/>
     Last Name: <form:input path="lastName"/>
    <br/> <br/>
     <%-- country: <form:select path="country">
                 <form:option value="BRZ" label="Brazil"></form:option>
                 <form:option value="IND" label="India"></form:option>
                 <form:option value="USA" label="America"></form:option>
               </form:select> --%>
         <!-- dropdown from map in student.java     -->
       <%-- country: <form:select path="country">
                 <form:options items="${student.countryOptions}"/>
               </form:select>     --%>    
     
     <!-- dropdown from property file -->
      country: <form:select path="country">
                 <form:options items="${theCountryOptions}"/>
               </form:select>     
     <br/> <br/>
     
     Programming language: 
         <form:radiobutton path="programLanguage" value="java"/>Java
         <form:radiobutton path="programLanguage" value="ng"/>Angular
         <form:radiobutton path="programLanguage" value="spring"/>Spring
     
     <br/> <br/>
     Operating systems:
        <form:checkbox path="operatingSystems" value="windows"/> Windows
        <form:checkbox path="operatingSystems" value="Linux"/> Linux
        <form:checkbox path="operatingSystems" value="MAC"/> Mac
     
     
     <br/> <br/>
    <input type="submit" name="register"/>
  </form:form>
</body>
</html>