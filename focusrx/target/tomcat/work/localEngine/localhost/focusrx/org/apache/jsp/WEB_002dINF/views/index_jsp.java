package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
 String basepath = "assets/";
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(basepath);
      out.write("css/index.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(basepath);
      out.write("css/footer.css\" />\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"");
      out.print(basepath);
      out.write("css/header.css\" />\n");
      out.write("<header>\n");
      out.write("    <img src=\"");
      out.print(basepath);
      out.write("images/logo2.png\"/>\n");
      out.write("</header>\n");
      out.write("  <script src=\"");
      out.print(basepath);
      out.write("js/jquery-1.6.1.min.js\"></script>");
      out.write("\n");
      out.write("<div id=\"main\">\n");
      out.write("    <h1>基本药物 databass framework</h1>\n");
      out.write("    <p style=\"text-align: -webkit-center; margin-bottom: 200px;\"><a href=\"getInfo\">Go Info</a></p>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("  <p class=\"nav\">\n");
      out.write("    <a href=\"#\">关于我们</a>\n");
      out.write("    <a href=\"#\">联系我们</a>\n");
      out.write("    <a href=\"#\">隐私政策</a>\n");
      out.write("    <a href=\"#\">版权声明</a>\n");
      out.write("    <a href=\"#\">免责声明</a>\n");
      out.write("    <a href=\"#\">网站帮助</a>\n");
      out.write("  </p>\n");
      out.write("  <p>方括 版权所有</p>\n");
      out.write("  <p>&#169; 2011 focusrxsearch.com.All rights reserved.</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
