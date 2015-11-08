package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<h2>Test Suites</h2>\n");
      out.write("<p>The .table-responsive class creates a responsive table which will\n");
      out.write("\tscroll horizontally on small devices (under 768px). When viewing on\n");
      out.write("\tanything larger than 768px wide, there is no difference:</p>\n");
      out.write("<div class=\"table-responsive\">\n");
      out.write("\t<table class=\"table\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>#</th>\n");
      out.write("\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t<th>Test Suite Name</th>\n");
      out.write("\t\t\t\t<th>Last Success</th>\n");
      out.write("\t\t\t\t<th>lastDuration</th>\n");
      out.write("\t\t\t\t<th>Short Description</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t<td>Anna</td>\n");
      out.write("\t\t\t\t<td>Pitt</td>\n");
      out.write("\t\t\t\t<td>35</td>\n");
      out.write("\t\t\t\t<td>New York</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>");
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
