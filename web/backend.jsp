<%-- 
    Document   : backend
    Created on : Jun 16, 2014, 4:07:43 PM
    Author     : Gage
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Backend</title>
    </head>
    <body>
        <h1>Welcome "${sessionScope.username}"</h1>
        <h2> Posts  <a href="newPost.jsp"> new </a></h2>
        <c:forEach items="${requestScope.posts}" var="post">
            <div>${post.body}</div>
            <div>- ${post.username} on ${post.date}</div>
        </c:forEach>
        <a href="/HelloWorld/Logout"/>Logout</a>
    </body>
</html>
