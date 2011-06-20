package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/showDetail.css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"assets/js/showDetail.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  ");

    String content = "非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）";
    String detail = "1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录";
  
      out.write("\n");
      out.write("  <table border=\"2\">\n");
      out.write("    <tr>\n");
      out.write("      <th>省份</th>\n");
      out.write("      <th>AZ药品</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>山东省</td>\n");
      out.write("      <td title=\"");
      out.print(content);
      out.write("\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>江苏省</td>\n");
      out.write("      <td><a onmouseover=\"OpenDiv(400,200,'getContentItem?id=1')\"\n");
      out.write("        onmouseout=\"document.getElementById('showDetail').style.display='none'\"\n");
      out.write("        href=\"#\">详细</a></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <div id=\"showDetail\" style=\"display: none\"\n");
      out.write("    onmouseout=\"this.style.display='none'\"></div>\n");
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
