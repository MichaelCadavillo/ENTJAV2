/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.57
 * Generated at: 2017-08-24 02:29:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class records_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/design/footer.jsp", Long.valueOf(1503470070029L));
    _jspx_dependants.put("/design/navbar.html", Long.valueOf(1503470070031L));
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
      out.write("     ");
      java.sql.ResultSet records = null;
      records = (java.sql.ResultSet) _jspx_page_context.getAttribute("records", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (records == null){
        throw new java.lang.InstantiationException("bean records not found within scope");
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("  \t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("\r\n");
      out.write("  \t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/layout.css\">\r\n");
      out.write("\r\n");
      out.write("  <style media=\"screen\">\r\n");
      out.write(" table {\r\n");
      out.write(" border-collapse: collapse;\r\n");
      out.write(" border-spacing: 0;\r\n");
      out.write(" width: 100%;\r\n");
      out.write(" border: 1px solid #ddd;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   th, td {\r\n");
      out.write("       border: none;\r\n");
      out.write("       text-align: left;\r\n");
      out.write("       padding: 8px;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   tr:nth-child(even){background-color: #f2f2f2}\r\n");
      out.write("\r\n");
      out.write(" </style>\r\n");
      out.write("\r\n");
      out.write("<title>MRT Records</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"icon/apple-icon-57x57.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"icon/apple-icon-60x60.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"icon/apple-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"icon/apple-icon-76x76.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"icon/apple-icon-114x114.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"icon/apple-icon-120x120.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"icon/apple-icon-144x144.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"icon/apple-icon-152x152.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"icon/apple-icon-180x180.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"192x192\"  href=\"icon/android-icon-192x192.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"icon/favicon-32x32.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"icon/favicon-96x96.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"icon/favicon-16x16.png\">\r\n");
      out.write("<link rel=\"manifest\" href=\"icon/manifest.json\">\r\n");
      out.write("<meta name=\"msapplication-TileColor\" content=\"#ffffff\">\r\n");
      out.write("<meta name=\"msapplication-TileImage\" content=\"icon/ms-icon-144x144.png\">\r\n");
      out.write("<meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\">\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write(" <div class=\"container\">\r\n");
      out.write("   <div class=\"navbar-header\">\r\n");
      out.write("     <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("       <span class=\"icon-bar\"></span>\r\n");
      out.write("       <span class=\"icon-bar\"></span>\r\n");
      out.write("       <span class=\"icon-bar\"></span>\r\n");
      out.write("     </button>\r\n");
      out.write("     <a class=\"navbar-brand\" href=\"index.html\">MRT</a>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("     <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("       <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("       <li><a href=\"index.html#station\">Stations</a></li>\r\n");
      out.write("        <li><a href=\"records.html\">Records</a></li>\r\n");
      out.write("     </ul>\r\n");
      out.write("   </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div style=\"width: auto; height: auto; padding: 20px; background-color: white; text-align: center; border-radius: 20px;\">\r\n");
      out.write("\t\t\t<div style=\"overflow-y: scroll; height: 50vh;\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>#</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Last Name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>First Name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Destination</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Destination Fare</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						while (records.next()) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(records.getInt("id"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(records.getString("lastName"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(records.getString("firstName"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(records.getString("destination"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(records.getDouble("destinationFare"));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<form action=\"display.jsp\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-default center\" type=\"submit\" name=\"submit\">View\r\n");
      out.write("\t\t\t\t\tList of Profits</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tClick <a href=\"index.html#station\" style=\"color: blue;\">here</a> to\r\n");
      out.write("\t\t\t\tgo back to home.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<footer class=\"container-fluid text-center\">\r\n");
      out.write("    <img src=\"images/Capture.jpg\"><br><br>\r\n");
      out.write("    <strong>MRT3</strong><br>\r\n");
      out.write("    <div>\r\n");
      out.write("      <p>Powered by M&M<br> Michael Cadavillo & <br>Mark Ticzon</p>\r\n");
      out.write("      <p>&#169;2017 - MRT3, All Rights Reserved</p>\r\n");
      out.write("    </div>\r\n");
      out.print( new java.util.Date() );
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
