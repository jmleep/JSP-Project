<%@page import="business.Teacher"%>
<%@page import="java.util.ArrayList"%>
<!doctype html public "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <title>Teachers</title>
</head>
<body>
 
<h1>Teacher List</h1>
<table cellpadding="5" border=1>

  <tr valign="bottom">
    <th>Teacher ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Phone</th>
  </tr>
 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="teacher" items="${teacherList}">
  <tr valign="top">
    <td><p>${teacher.teacherID}</td>
    <td><p>${teacher.firstName}</td>
    <td><p>${teacher.lastName}</td>
    <td><p>${teacher.phone}</td>
  </tr>
  </c:forEach>
  
  
</table>
    
</body>
</html>