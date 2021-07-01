
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>

<%!
   public String obtenerFecha(){
    return "Hoy es = "+ new Date().toString();
} 
  public String saludar(String saludo){
    return "Hola = "+ saludo;
}
%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= new Date()%>JSP Page</title>
    </head>
    <body>
         <h1><%= new Date()%>Hello World!</h1>
        <p>
            <%out.println(new Date());%>
        </p>
        <p><% 
            out.println(obtenerFecha());
            out.println("<br>");
            out.println(saludar("Que tal Amigos"));
        %></p>
       
    </body>
</html>
