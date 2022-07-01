<%-- 
    Document   : jstl
    Created on : 29 jun 2022, 15:44:44
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:out value="label"/>
        <c:out value="${label}"/>
        <c:out value="${user.id}"/>
        <c:out value="${user.name}"/>
    </body>
</html>
