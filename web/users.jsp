<%@page import="business.Student"%>
<%@page import="java.util.ArrayList"%>
<!doctype html public "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <title>Students</title>
</head>
<body>
 
<h1>Student List</h1>
<table cellpadding="5" border=1>

  <tr valign="bottom">
    <th>Student ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Phone</th>
    <th>Balance</th>
    <th>Enroll Date</th>
  </tr>
 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="student" items="${studentList}">
  <tr valign="top">
    <td><p>${student.studentID}</td>
    <td><p>${student.firstName}</td>
    <td><p>${student.lastName}</td>
    <td><p>${student.phone}</td>
    <td><p>${student.balance}</td>
    <td><p>${student.enrollDate}</td>
  </tr>
  </c:forEach>
  
  
</table>
    
</body>
</html>