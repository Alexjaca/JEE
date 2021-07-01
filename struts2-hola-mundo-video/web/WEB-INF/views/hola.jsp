<%-- 
    Document   : hola
    Created on : 16/03/2021, 11:49:53 PM
    Author     : alex
--%>

<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><s:property value="saludo"/></h1>
        <p>La fecha es= <s:property value="fecha" /></p>
    </body>
</html>
