<%
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
            <form action="<%=request.getContextPath()%>/HolaMundo" method="post">
                <div class="form-group" >
                    <label for="nombre">Nombre</label>
                    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa username">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="Ingresa email">
                </div>
                <div class="form-group">
                    <label for="saldo">Saldo:</label>
                    <input type="text" class="form-control" name="saldo" id="saldo" placeholder="Ingresa el Saldo">
                </div>
                <div class="form-group">
                    <label for="nivelEndeudamiento">Nivel de Endeudamiento:</label>
                    <input type="text" class="form-control" name="nivelEndeudamiento" id="nivelEndeudamiento" placeholder="Ingresa el Endeudamiento">
                </div>
                <div class="form-group">
                    <label for="fechaRenovacion">Fecha de Renovacion:</label>
                    <input type="text" class="form-control" name="fechaRenovacion" id="fechaRenovacion" placeholder="Ingresa el Endeudamiento">
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success btn-lg">Enviar</button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>

