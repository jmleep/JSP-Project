<%@page import="business.Teacher"%>
<%@page import="java.util.ArrayList"%>
<!doctype html public "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
    <title>Tutorials</title>
</head>
<body>
 
<h1>Tutorial List</h1>
<table cellpadding="5" border=1>

  <tr valign="bottom">
    <th>Tutorial ID</th>
    <th>Description</th>
    <th>Teacher ID</th>

  </tr>
 
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <c:forEach var="tutorial" items="${tutorialList}">
  <tr valign="top">
    <td><p>${tutorial.tutorialID}</td>
    <td><p>${tutorial.tutorialDescribe}</td>
    <td><p>${tutorial.teacherID}</td>
  </tr>
  </c:forEach>
  
  
</table>
    
</body>
</html>