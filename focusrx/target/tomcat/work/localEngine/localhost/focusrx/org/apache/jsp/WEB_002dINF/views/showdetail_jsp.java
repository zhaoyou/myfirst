package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<title>查看详细信息</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".showdetailNav {\n");
      out.write("  margin-top: 10px;\n");
      out.write("  padding: 10px;\n");
      out.write("  background: #F0F0F0;\n");
      out.write("  color: #1f3e88;\n");
      out.write("  font-size: 20px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".detail {\n");
      out.write("  box-shadow: 0 0 20px silver;\n");
      out.write("  -moz-box-shadow: 0 0 20px silver;\n");
      out.write("  -webkit-box-shadow: 0 0 20px silver;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  -moz-border-radius: 10px;\n");
      out.write("  -webkit-border-radius: 10px;\n");
      out.write("  margin: 20px auto 40px;\n");
      out.write("  font-family: arial, sans-serif;\n");
      out.write("  font-size: 18px;\n");
      out.write("  overflow: atuo;\n");
      out.write("  padding: 50px;\n");
      out.write("  width: 700px;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  ");

    String basepath = "assets/";
  
      out.write('\n');
      out.write(' ');
      out.write(' ');
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
      out.write("  <div class=\"showdetailNav\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.province.provinceName\n    }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('-');
      out.write('-');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("  <br>\n");
      out.write("  <div align=\"center\">\n");
      out.write("    <div class=\"detail\">\n");
      out.write("      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/showdetail.jsp(45,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("singleItem");
    // /WEB-INF/views/showdetail.jsp(45,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/showdetail.jsp(45,6) '${contentItemList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${contentItemList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ singleItem.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" :<br> &nbsp;&nbsp;&nbsp;&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ singleItem.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" <p>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
