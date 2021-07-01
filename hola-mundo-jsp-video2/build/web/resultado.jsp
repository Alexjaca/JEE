<%
    String nombre = (String) request.getParameter("nombre");
    String email = (String) request.getParameter("email");
    String saldo = (String) request.getParameter("saldo");
    String nivelEndeudamiento = (String) request.getParameter("nivelEndeudamiento");
    String fechaRenovacion = (String) request.getParameter("fechaRenovacion");
    String titulo = "Formulario Basico de Servlet; Datos enviados de JSP a JSP";
    String titulo2 = "Detalle de la cuenta de "+ nombre;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=titulo%></title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>  
        <h1><%=titulo2%></h1>
                 
        <table class="table table-responsive table-striped">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Saldo</th>
                    <th>Nivel de Endeudamiento</th>
                    <th>Fecha de Renovacion</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=nombre%></td>
                    <td><%=email%></td>
                    <td><%=saldo%></td>
                    <td><%=nivelEndeudamiento%></td>
                    <td><%=fechaRenovacion%></td>
            </tbody>
        </table>
    </body>
</html>

