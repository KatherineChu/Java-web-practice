/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-23 15:36:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Todos</title>\n");
      out.write("<link href=\"webjars/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nunito:wght@300;400;600;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../resources/css/bootstrap.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../resources/css/bootstrap-icons.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../resources/css/app.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../resources/css/auth.css\">\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>\n");
      out.write(".footer {\n");
      out.write("\tposition: absolute;\n");
      out.write("\tbottom: 0;\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 60px;\n");
      out.write("\tbackground-color: #f5f5f5;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div id=\"auth\">\n");
      out.write("\n");
      out.write("        <div class=\"row h-100\">\n");
      out.write("            <div class=\"col-lg-5 col-12\">\n");
      out.write("                <div id=\"auth-left\">\n");
      out.write("                    <h1 class=\"auth-title\">Log in.</h1>\n");
      out.write("                    <p class=\"auth-subtitle mb-5\">Log in with your data that you entered during registration.</p>\n");
      out.write("\n");
      out.write("                    <form action=\"login.do\" method=\"post\">\n");
      out.write("                    \t<p><font color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\n");
      out.write("                        <div class=\"form-group position-relative has-icon-left mb-4\">\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control form-control-xl\" placeholder=\"Username\">\n");
      out.write("                            <div class=\"form-control-icon\">\n");
      out.write("                                <i class=\"bi bi-person\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group position-relative has-icon-left mb-4\">\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"form-control form-control-xl\" placeholder=\"Password\">\n");
      out.write("                            <div class=\"form-control-icon\">\n");
      out.write("                                <i class=\"bi bi-shield-lock\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-primary btn-block btn-lg shadow-lg mt-5\" value=\"login\">Log in</button>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"text-center mt-5 text-lg fs-4\">\n");
      out.write("                        <p class=\"text-gray-600\">Don't have an account? <a href=\"auth-register.html\"\n");
      out.write("                                class=\"font-bold\">Sign\n");
      out.write("                                up</a>.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-7 d-none d-lg-block\">\n");
      out.write("                <div id=\"auth-right\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
