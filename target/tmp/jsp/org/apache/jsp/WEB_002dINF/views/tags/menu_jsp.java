package org.apache.jsp.WEB_002dINF.views.tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<ul class=\"nav nav-list\">\r\n");
      out.write("\t<li><a\r\n");
      out.write("\t\thref=\"https://github.com/SpringSource/spring-mvc-showcase/blob/master/MasteringSpringMVC3.pdf\"\r\n");
      out.write("\t\ttarget=\"_blank\">New Test Suite</a></li>\r\n");
      out.write("\t<li><a href=\"http://getbootstrap.com/getting-started/\"\r\n");
      out.write("\t\ttarget=\"_blank\">People</a></li>\r\n");
      out.write("\t<li><a\r\n");
      out.write("\t\thref=\"http://static.springsource.org/spring/docs/3.2.x/spring-framework-reference/html/spring-web.html\"\r\n");
      out.write("\t\ttarget=\"_blank\">History</a></li>\r\n");
      out.write("\t<li><a href=\"https://src.springframework.org/svn/spring-samples/\"\r\n");
      out.write("\t\ttarget=\"_blank\">Settings</a></li>\r\n");
      out.write("\t<li><a href=\"http://wrapbootstrap.com/\" target=\"_blank\">Executor\r\n");
      out.write("\t\t\tstatus</a></li>\r\n");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nav nav-list\">\r\n");
      out.write("\t<li>Suite 1</li>\r\n");
      out.write("\t<li><div class=\"progress\">\r\n");
      out.write("\t\t\t<div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"70\"\r\n");
      out.write("\t\t\t\taria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">70% Complete</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t<li>Suite 2</li>\r\n");
      out.write("\t<li><div class=\"progress\">\r\n");
      out.write("\t\t\t<div class=\"progress-bar\" role=\"progressbar\" aria-valuenow=\"20\"\r\n");
      out.write("\t\t\t\taria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 70%\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">70% Complete</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div></li>\r\n");
      out.write("</ul>\r\n");
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
