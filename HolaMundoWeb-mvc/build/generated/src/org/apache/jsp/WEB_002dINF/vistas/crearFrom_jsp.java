package org.apache.jsp.WEB_002dINF.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearFrom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    String titulo = (String) request.getAttribute("titulo");
    String titulo2 = (String) request.getAttribute("titulo2");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>");
      out.print(titulo);
      out.write("</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" id=\"registration-form\">\n");
      out.write("        <div class=\"image\"></div>\n");
      out.write("        <div class=\"frm\">\n");
      out.write("            <h1>");
      out.print(titulo2);
      out.write("</h1>\n");
      out.write("            <form action=\"");
      out.print(request.getContextPath());
      out.write("/HolaMundo\" method=\"post\">\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <label for=\"nombre\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\" placeholder=\"Ingresa username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"email\">Email:</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Ingresa email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"saldo\">Saldo:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"saldo\" id=\"saldo\" placeholder=\"Ingresa el Saldo\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"nivelEndeudamiento\">Nivel de Endeudamiento:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"nivelEndeudamiento\" id=\"nivelEndeudamiento\" placeholder=\"Ingresa el Endeudamiento\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"fechaRenovacion\">Fecha de Renovacion:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"fechaRenovacion\" id=\"fechaRenovacion\" placeholder=\"Ingresa el Endeudamiento\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-lg\">Enviar</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
