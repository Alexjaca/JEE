<%@page import="java.util.List"%>
<%@page import="models.entity.Producto"%>
<%
    String titulo = (String) request.getAttribute("titulo");
    Producto producto = (Producto) request.getAttribute("producto");
    List<String> errores = (List<String>) request.getAttribute("errores");
%>

<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <title><%=titulo%></title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css\styles.css">
</head>

<body>
    <div class="container" id="registration-form">
        <div class="image"></div>
        <div class="frm">
            <h1><%=titulo%></h1>
            
            <% if(errores != null && errores.size() > 0) {%>
            <ul>
                <% for (String error : errores) {%>
                <li style="color:red; font-weight: bold;"><%=error%></li>
                <% }%>  
            </ul>
            <% }%>
            
            <a href ="<%=request.getContextPath()%>/catalogo/listado">Volver al Listado</a>

            <form method="post">
                <input name="id" type="hidden" value="<%=producto.getId()%>"/>
                
                <div class="form-group" >
                    <label for="nombre">Nombre</label>
                    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa Nombre" value="<%=(producto.getNombre() == null) ? "" : producto.getNombre() %>" required >
                </div>
                <div class="form-group">
                    <label for="precio">Precio:</label>
                    <input type="text" class="form-control" name="precio" id="precio" placeholder="Ingresa el Precio" value="<%=(producto.getPrecio() == 0) ? "" : producto.getPrecio() %>" required >
                </div>
                <div class="form-group">
                    <label for="cantidad">Cantidad:</label>
                    <input type="text" class="form-control" name="cantidad" id="cantidad" placeholder="Ingresa el Cantidad" value="<%=(producto.getCantidad() == 0) ? "" : producto.getCantidad() %>" required >
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success btn-lg" value="<%=titulo%>">Guardar</button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>
