package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>prueba</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" id=\"registration-form\">\n");
      out.write("        <div class=\"image\"></div>\n");
      out.write("        <div class=\"frm\">\n");
      out.write("            <h1>prueba</h1>\n");
      out.write("     \n");
      out.write("            \n");
      out.write("            <a href =\"");
      out.print(request.getContextPath());
      out.write("/catalogo/listado\"></a>\n");
      out.write("\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <input name=\"id\" type=\"hidden\" value=\"\"/>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <label for=\"nombre\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"nombre\" placeholder=\"Ingresa Nombre\" value=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"precio\">Precio:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"precio\" id=\"precio\" placeholder=\"Ingresa el Precio\" value=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"cantidad\">Cantidad:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"cantidad\" id=\"cantidad\" placeholder=\"Ingresa el Cantidad\" value=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success btn-lg\" value=\"\">Enviar</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
