<%@page import="models.entity.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@page import="java.util.List"%>
<%
    List<Producto> lista = (List<Producto>) request.getAttribute("productos");
    String titulo = (String) request.getAttribute("titulo");
%>

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
        <h1><%=titulo%></h1>
       
        <a href ="<%=request.getContextPath()%>/catalogo/form">Crear Producto (+)</a>
                         
        <table class="table table-responsive table-striped">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
        <% for(Producto producto : lista){%>
                <tr>
                    <input name="id" type="hidden" value="<%=producto.getId()%>"/>
                    <td><%=producto.getNombre()%></td>
                    <td>$<%=producto.getPrecio()%></td>
                    <td>$<%=producto.getCantidad()%></td>
                    <td><a href="<%=request.getContextPath()%>/catalogo/form?id=<%=producto.getId()%>">Editar</a></td>
                    <td><a  onclick="return confirm('Seguro que desea Eliminar este Producto?'); 
                            "href="<%=request.getContextPath()%>/catalogo/eliminar?id=<%=producto.getId()%>">Eliminar</a></td>
                </tr>
        <% }%>
            </tbody>
        </table>
    </body>
</html>
