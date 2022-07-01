<%-- 
    Document   : video
    Created on : 29 jun 2022, 17:26:22
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
            if(session.getAttribute("userName")==null){
                response.sendRedirect("login.jsp");
            }
        %>
        <h1>Bienvendio a video page!</h1>
    </body>
</html>
