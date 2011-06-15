package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>index</title>\n");
String basepath="assets/" ;
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(basepath);
      out.write("css/info.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    <h1>基本药物 databass framework</h1>\n");
      out.write("    <div id=\"searchbar\">\n");
      out.write("        <form>\n");
      out.write("            <span>省份:</span>\n");
      out.write("             <select id=\"province\">\n");
      out.write("             ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           \n");
      out.write("            </select>\n");
      out.write("            <span>序号:</span>\n");
      out.write("            <select id=\"directory\">\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            <span>主要内容:</span>\n");
      out.write("            <select id=\"contentItem\">\n");
      out.write("            </select>\n");
      out.write("            <input type=\"button\" id=\"btnsearch\" value=\"查 看\" style=\"display: none\"/>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"fenge\" style=\"text-align: center;\">\n");
      out.write("    <img class=\"line\" src=\"");
      out.print(basepath );
      out.write("images/index_line.png\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"contentshow\" >\n");
      out.write("       <div id=\"titleshow\" style=\"display: none\" >\n");
      out.write("            <span class=\"selfTitle\">内容:</span>\n");
      out.write("            <div id=\"selfText\"><!--   国家、省基本医疗保险药品目录（甲类）范围内选择，确因少数慢性疾病治疗必需的，也可从目录（乙类）范围内选择--> </div>\n");
      out.write("            <span class=\"selfTitle\">附件</span>\n");
      out.write("            <div id=\"selfattachment\"><!--  名字： <a href=\"#\">下载</a>--></div>\n");
      out.write("       </div>\n");
      out.write("       <div id=\"childcontent\">\n");
      out.write("       <!--  \n");
      out.write("            <ul>\n");
      out.write("                <li class=\"pli\">\n");
      out.write("                <span class=\"ptitle\">AZ产品 (通用名):</span>\n");
      out.write("                 <div class=\"pcontent\">非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）</div></li>\n");
      out.write("                <li class=\"pli\">\n");
      out.write("                <span class=\"ptitle\">关注领域</span>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"cli\"><span class=\"ctitle\">高血压(CCB类：络活喜；波依定以及其他大类，ARB和ACEI)</span>\n");
      out.write("                        <div class=\"ccontent\">1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录</div></li>\n");
      out.write("                    <li class=\"cli\"><span class=\"ctitle\">高血脂(立普妥)</span>\n");
      out.write("                        <div class=\"ccontent\">阿托伐他汀（立普妥）没有进入目录</div></li>\n");
      out.write("                    <li class=\"cli\"><span class=\"ctitle\">呼吸</span>\n");
      out.write("                        <div class=\"ccontent\">平喘药增加三种：特布他林、布地奈德、班布特罗</div></li>\n");
      out.write("                    <li class=\"cli\"><span class=\"ctitle\">消化道(抗酸药及抗溃疡药类)</span>\n");
      out.write("                        <div class=\"ccontent\">抗酸药及抗溃疡药类增加三类：硫糖铝、大黄碳酸氢钠、西咪替丁</div></li>\n");
      out.write("                </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            -->\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("    ");
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
      out.write("    <script type=\"text/javascript\" src=\"");
      out.print(basepath);
      out.write("js/info.js\"></script>\n");
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
    // /WEB-INF/views/info.jsp(18,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("p");
    // /WEB-INF/views/info.jsp(18,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/info.jsp(18,13) '${provinceList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${provinceList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.provinceName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("             ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/info.jsp(25,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("d");
    // /WEB-INF/views/info.jsp(25,16) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/info.jsp(25,16) '${directoryList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${directoryList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${d.directoryName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
