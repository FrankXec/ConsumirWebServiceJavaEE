<%-- 
    Document   : welcome
    Created on : 29 jun 2022, 17:26:17
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            response.setHeader("cache-control", "no-cache, no-store, must-revalidate");//esto elimina el cache de las paginas
            //importante saber como funciona esta funcion en cada navegador, por si varia
            //Funciona en HTTP 1.1 en adelante
            //response.setHeader("Pragma","no-cache") Http 1.0
            ////response.setHeader("Expires","0") proxies
            if(session.getAttribute("userName")==null){
                response.sendRedirect("login.jsp");
            }
        %>
        <h1>Bienvenido a wecolme page.. <a href="video.jsp">Video aca</a></h1>
    </body>
</html>
