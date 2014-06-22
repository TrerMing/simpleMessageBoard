<%-- 
    Document   : newPost
    Created on : Jun 21, 2014, 7:34:56 PM
    Author     : Gage
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="backend.jsp"> &Larr; Back to all posts</a> <span>(no save)</span>
        <h1>New Post</h1>
        <form method="post">
            <textarea placeholder="Blah Blah Blah Blah blah..." rows="10" cols="50"></textarea><br />
            <input type="submit" name="submit" />
        </form>
    </body>
</html>
