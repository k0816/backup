/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-12-26 05:18:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_005finformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.20.jar", Long.valueOf(1507171396000L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-konishi/backup/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/solare/WEB-INF/lib/struts2-core-2.3.20.jar!/META-INF/struts-tags.tld", Long.valueOf(1416572074000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!--BootStrap読み込み-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- フォントの読み込み -->\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Open+Sans:300'\r\n");
      out.write("\trel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- jQueryの読み込み -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>支払い選択</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/design.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("input, select {\r\n");
      out.write("\tcolor: black\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*ボタンデザインのcss*/\r\n");
      out.write(".button4 {\r\n");
      out.write("\tmargin-top: 20px;\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tborder-color: white;\r\n");
      out.write("\t/* 文字サイズを1.4emに指定 */\r\n");
      out.write("\tfont-size: 1.4em;\r\n");
      out.write("\t/* 縦方向に10px、\r\n");
      out.write("                * 横方向に30pxの余白を指定 */\r\n");
      out.write("\tpadding: 10px 30px;\r\n");
      out.write("\t/* 背景色を濃い青色に指定 */\r\n");
      out.write("\tbackground-color: rgb(106, 12, 59);\r\n");
      out.write("\t/* 文字色を白色に指定 */\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\t/* ボーダーをなくす */\r\n");
      out.write("\tborder-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button.button4:hover {\r\n");
      out.write("\t/* 背景色を明るい青色に指定 */\r\n");
      out.write("\tbackground-color: rgb(150, 17, 84);\r\n");
      out.write("\t/* 文字色を白色に指定 */\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pinput {\r\n");
      out.write("\tfont-size: 1.0em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tpadding-left: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tcolor: red;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body style=\"color: white;\">\r\n");
      out.write("\t<h1>Payment</h1>\r\n");
      out.write("\t<h3>\r\n");
      out.write("\t\t<span>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</span>\r\n");
      out.write("\t</h3>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form name=\"form1\" action=\"GoToReservationConfirmationPageAction\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 支払方法の選択 -->\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"radio\" id=\"cash\" name=\"pay\" value=\"Cash\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"changeDisabled()\" checked> <label for=\"cash\">現金支払い</label>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"radio\" id=\"credit\" name=\"pay\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"Credit card\" onClick=\"changeDisabled()\"> <label\r\n");
      out.write("\t\t\t\t\t\tfor=\"credit\">クレジットカード</label> ");
      if (_jspx_meth_s_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr id=\"cardSelect\">\r\n");
      out.write("\t\t\t\t\t<th>カードを選択</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<!-- カードの種類を選択 --> <select name=\"card\" style=\"color: black\"\r\n");
      out.write("\t\t\t\t\t\trequired>");
      if (_jspx_meth_s_005fproperty_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"VISA\">VISA</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"JCB\">JCB</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"MASTER\">MASTER</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr id=\"text1\">\r\n");
      out.write("\t\t\t\t\t<th>Card holder</th>\r\n");
      out.write("\t\t\t\t\t<!-- カード名義を入力 -->\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"cardHolder\" size=\"30\"\r\n");
      out.write("\t\t\t\t\t\tmaxlength=\"20\" pattern=\"^[A-Z| |]{,20}\"\r\n");
      out.write("\t\t\t\t\t\ttitle=\"大文字アルファベット20文字以下で入力してください。\" placeholder=\"名前を入力してください\"\r\n");
      out.write("\t\t\t\t\t\trequired /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr id=\"text2\">\r\n");
      out.write("\t\t\t\t\t<th>Card number</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<!-- カード番号を入力 --> <input type=\"password\" name=\"cardNumber\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"30\" pattern=\"[0-9]{16}\" maxlength=\"16\"\r\n");
      out.write("\t\t\t\t\t\ttitle=\"数字のみ16桁を入力してください。\" placeholder=\"カード番号を入力してください\" required />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr id=\"Period\">\r\n");
      out.write("\t\t\t\t\t<th>MONTH/YEAR</th>\r\n");
      out.write("\t\t\t\t\t<!-- カード有効期限を選択 -->\r\n");
      out.write("\t\t\t\t\t<td><select name=\"cardMonth\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">1</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">2</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">3</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"4\">4</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"6\">6</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"7\">7</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"8\">8</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"9\">9</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t</select> <select id=\"Year\" name=\"cardYear\" required>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\"></option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"08\">08</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"09\">09</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"10\">10</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"11\">11</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"12\">12</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"13\">13</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"14\">14</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"15\">16</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"17\">17</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"18\">18</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"19\">19</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr id=\"text3\">\r\n");
      out.write("\t\t\t\t\t<th>Security code</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<!-- セキュリティコードを入力 --> <input type=\"password\" name=\"securityCode\"\r\n");
      out.write("\t\t\t\t\t\tsize=\"30\" maxlength=\"4\" pattern=\"[0-9]{3,4}\"\r\n");
      out.write("\t\t\t\t\t\ttitle=\"数字のみ3桁又は4桁を入力してください。\" placeholder=\"セキュリティコードを入力してください\"\r\n");
      out.write("\t\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"pinput\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"btn1\" value=\"ReservationConfirm\"\r\n");
      out.write("\t\t\t\t\tclass=\"button4\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"BackPageAction\">\r\n");
      out.write("\t\t\t<p align=\"center\" class=\"pinput\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"btn2\" value=\"Back\" class=\"button4\" />\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tfunction changeDisabled() {\r\n");
      out.write("\t\t\t\t//クレジットカード情報の入力可にする\r\n");
      out.write("\t\t\t\tif (document.form1[\"pay\"][1].checked) {\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"card\"].disabled = false;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardHolder\"].disabled = false;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardNumber\"].disabled = false;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardMonth\"].disabled = false;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardYear\"].disabled = false;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"securityCode\"].disabled = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//クレジットカード情報の入力不可にする\r\n");
      out.write("\t\t\t\telse {\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"card\"].disabled = true;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardHolder\"].disabled = true;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardNumber\"].disabled = true;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardMonth\"].disabled = true;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"cardYear\"].disabled = true;\r\n");
      out.write("\t\t\t\t\tdocument.form1[\"securityCode\"].disabled = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//ページを表示したとき、changeDisabled()を呼び出す\r\n");
      out.write("\t\t\twindow.onload = changeDisabled;\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<hr class=\"foot\">\r\n");
      out.write("\t<p class=\"copy\">\r\n");
      out.write("\t\t<small>Copyright © 2017 Solare. All Rights Reserved.</small>\r\n");
      out.write("\t</p>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /payment_information.jsp(78,3) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("payNotFundErrorMessage");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent(null);
    // /payment_information.jsp(95,6) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("pay");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f2 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f2.setParent(null);
    // /payment_information.jsp(101,36) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f2.setValue("pay");
    int _jspx_eval_s_005fproperty_005f2 = _jspx_th_s_005fproperty_005f2.doStartTag();
    if (_jspx_th_s_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f3 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f3.setParent(null);
    // /payment_information.jsp(110,15) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f3.setValue("card");
    int _jspx_eval_s_005fproperty_005f3 = _jspx_th_s_005fproperty_005f3.doStartTag();
    if (_jspx_th_s_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f3);
    return false;
  }
}
