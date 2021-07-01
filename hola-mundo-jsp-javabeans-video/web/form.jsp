<%!
   public String titulo1(){
    return "Ejemplo JSP Form enviados de JSP a JSP";
} 
  public String titulo2(){
    return "Crear cuenta";
}
%>

<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <title><%=titulo1()%></title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
</head>

<body>
    <div class="container" id="registration-form">
        <div class="image"><%=titulo1()%></div>
        <div class="frm">
            <h1></h1>
            <form action="<%=request.getContextPath()%>/resultado.jsp" method="post" required>
                <div class="form-group" >
                    <label for="nombre">Nombre:</label>
                    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa username" required>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="Ingresa email" required>
                </div>
                <div class="form-group">
                    <label for="saldo">Saldo:</label>
                    <input type="text" class="form-control" name="saldo" id="saldo" placeholder="Ingresa el Saldo" required>
                </div>
                <div class="form-group">
                    <label for="nivelEndeudamiento">Nivel de Endeudamiento:</label>
                    <input type="text" class="form-control" name="nivelEndeudamiento" id="nivelEndeudamiento" placeholder="Ingresa el Endeudamiento" required>
                </div>
                <div class="form-group">
                    <label for="fechaRenovacion">Fecha de Renovacion:</label>
                    <input type="text" class="form-control" name="fechaRenovacion" id="fechaRenovacion" placeholder="Ingresa el Endeudamiento" required>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-success btn-lg"><%=titulo2()%></button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>


