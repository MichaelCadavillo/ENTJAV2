/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2017-08-24 05:25:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/design/footer.jsp", Long.valueOf(1502877869569L));
    _jspx_dependants.put("/design/header.html", Long.valueOf(1502877869572L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>MVC Model 2 Lecture</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t");
      out.write("\t<img src=\"images/bpi.jpg\" width=\"200px\">\r\n");
      out.write("\t<img src=\"images/bdo.jpg\" width=\"300px\">\r\n");
      out.write("\t<h1>BPI x BDO Forex Collab</h1>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<fieldset>\r\n");
      out.write("\t\t<legend>BPI x BDO Forex Form</legend>\r\n");
      out.write("\t\t<form action='processcurrencyexchange.html' method=\"post\">\r\n");
      out.write("\t\t\t<p>Enter Philippine Peso Amount: Php<input type=\"number\" name=\"pesoAmount\" id='pesoAmount' min='1000' max='300000' required></p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p>Select Currency: \r\n");
      out.write("\t\t\t<select name='currencyType' id='currencyType'>\r\n");
      out.write("\t\t\t\t<option value='USD'>US$</option>\r\n");
      out.write("\t\t\t\t<option value='EUR'>&euro;uro</option>\r\n");
      out.write("\t\t\t\t<option value='YEN'>&yen;en</option>\r\n");
      out.write("\t\t\t\t<option value='AUS'>AUS$</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<input type=\"submit\" value='Compute Currency Exchange'>&nbsp;&nbsp;&nbsp;<input type='reset'>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      out.write("<span style=\"text-align: center\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<hr>\r\n");
      out.write("<p><i>&copy; 2017 - Bank of The Philippine Islands</i></p>\r\n");
      out.write("<p><i>&copy; 2017 - Banco De Oro</i></p>\r\n");
      out.write("</span>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
