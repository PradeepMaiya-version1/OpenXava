/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2021-11-10 05:24:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openxava.controller.meta.MetaAction;

public final class bottomButtons_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/MaiyaP/Downloads/openxava-6.5.3-windows/openxava-6.5.3/workspace/DiscoveryTool/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425958868000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1636476317615L));
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1636476324079L));
    _jspx_dependants.put("jar:file:/C:/Users/MaiyaP/Downloads/openxava-6.5.3-windows/openxava-6.5.3/workspace/DiscoveryTool/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425958868000L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1636476324165L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.openxava.controller.meta.MetaAction");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody;

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
    _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');

org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context.get(request, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
if (manager.isBottomButtonsVisible()) { 
	
	boolean buttonBar = !"false".equalsIgnoreCase(request.getParameter("buttonBar"));
	String mode = request.getParameter("xava_mode"); 
	if (mode == null) mode = manager.getModeName(); 
	
	String defaultAction = null; 
	if (org.openxava.util.XavaPreferences.getInstance().isShowDefaultActionInBottom() && manager.isDetailMode()) { 	
		defaultAction = manager.getDefaultActionQualifiedName();
	
      out.write('\n');
      out.write('	');
      //  xava:button
      org.openxava.web.taglib.ButtonTag _jspx_th_xava_005fbutton_005f0 = (org.openxava.web.taglib.ButtonTag) _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.get(org.openxava.web.taglib.ButtonTag.class);
      boolean _jspx_th_xava_005fbutton_005f0_reused = false;
      try {
        _jspx_th_xava_005fbutton_005f0.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fbutton_005f0.setParent(null);
        // /xava/bottomButtons.jsp(20,1) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fbutton_005f0.setAction(defaultAction);
        int _jspx_eval_xava_005fbutton_005f0 = _jspx_th_xava_005fbutton_005f0.doStartTag();
        if (_jspx_th_xava_005fbutton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f0);
        _jspx_th_xava_005fbutton_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fbutton_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fbutton_005f0_reused);
      }
      out.write('\n');
      out.write('	');
 
	} 
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

	java.util.Iterator it = manager.getMetaActions().iterator();
	while (it.hasNext()) {
		MetaAction action = (MetaAction) it.next();
		if (!manager.actionApplies(action)) continue; 
		if (action.getQualifiedName().equals(defaultAction)) continue;
		if (action.appliesToMode(mode) && (!buttonBar || !(action.hasImage() ||  action.hasIcon()))) { 	
		
      out.write('\n');
      out.write('	');
      out.write('	');
      //  xava:button
      org.openxava.web.taglib.ButtonTag _jspx_th_xava_005fbutton_005f1 = (org.openxava.web.taglib.ButtonTag) _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.get(org.openxava.web.taglib.ButtonTag.class);
      boolean _jspx_th_xava_005fbutton_005f1_reused = false;
      try {
        _jspx_th_xava_005fbutton_005f1.setPageContext(_jspx_page_context);
        _jspx_th_xava_005fbutton_005f1.setParent(null);
        // /xava/bottomButtons.jsp(33,2) name = action type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
        _jspx_th_xava_005fbutton_005f1.setAction(action.getQualifiedName());
        int _jspx_eval_xava_005fbutton_005f1 = _jspx_th_xava_005fbutton_005f1.doStartTag();
        if (_jspx_th_xava_005fbutton_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fxava_005fbutton_0026_005faction_005fnobody.reuse(_jspx_th_xava_005fbutton_005f1);
        _jspx_th_xava_005fbutton_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fbutton_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fbutton_005f1_reused);
      }
      out.write('\n');
      out.write('	');
      out.write('	');

		}
	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");
  
	MetaAction defaultMetaAction = manager.getDefaultMetaAction();
	if (defaultMetaAction != null) {
	
      out.write("\n");
      out.write("\t<button name=\"xava.DEFAULT_ACTION\" type=\"submit\" \n");
      out.write("\t\tonclick=\"openxava.executeAction('");
      out.print(request.getParameter("application"));
      out.write("', '");
      out.print(request.getParameter("module"));
      out.write("', '");
      out.print(defaultMetaAction.getConfirmMessage(request));
      out.write('\'');
      out.write(',');
      out.write(' ');
      out.print(defaultMetaAction.isConfirm());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(manager.getDefaultActionQualifiedName());
      out.write("')\"\n");
      out.write("\t\tstyle=\"padding: 0; border: none; background-color:transparent; size: 0\"></button>\n");
      out.write("\t");

	}
	
      out.write('	');
      out.write('\n');
      out.write('\n');
 } // if (manager.isBottomButtonsVisible()) { 
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
