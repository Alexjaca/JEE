<%@page import="com.formacionbdi.ejemplo.servlet.models.Cuenta"%>
<%
    Cuenta cuenta = (Cuenta) request.getAttribute("cuenta");
    String titulo = (String) request.getAttribute("titulo");
    String titulo2 = (String) request.getAttribute("titulo2");
%>

<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <title><%=titulo%></title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>

<body>
    <div class="container" id="registration-form">
        <div class="image"></div>
        <div class="frm">
            <h1><%=titulo2%></h1>
            <table>
                <div class="form-group" >
                    <label for="nombre">Nombre</label>
                    <label><%=cuenta.getNombre()%></label>                
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                   <label><%=cuenta.getEmail()%></label> 
                </div>
                <div class="form-group">
                    <label for="saldo">Saldo:</label>
                   <label><%=cuenta.getSaldo()%></label> 
                </div>
                <div class="form-group">
                    <label for="nivelEndeudamiento">Nivel de Endeudamiento:</label>
                   <label><%=cuenta.getNivelEndeudamiento()%></label> 
                </div>
                <div class="form-group">
                    <label for="fechaRenovacion">Fecha de Renovacion:</label>
                   <label><%=cuenta.getFechaRenovacion()%></label> 
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success btn-lg">Volver</button>
                </div>
            </table>
        </div>
    </div>
</body>

</html>
