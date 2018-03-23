<%-- 
    Document   : orderconfirmationpage
    Created on : 22-Mar-2018, 14:22:18
    Author     : emilv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p><%out.println(session.getAttribute("Order"));%></p>
    </body>
</html>
