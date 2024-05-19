/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-05-16 02:17:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import modelClass.Flight;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import dpConnection.DpConnection;
import modelClass.Login;
import modelClass.AdminUpdate;

public final class adminFlightDelete_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("modelClass.Login");
    _jspx_imports_classes.add("modelClass.AdminUpdate");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("modelClass.Flight");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("dpConnection.DpConnection");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Delete Page</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./registration.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".datas2 {\n");
      out.write("	overflow: auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");

	Login authentication = (Login) session.getAttribute("userEmail");

	if (authentication == null) {
		response.sendRedirect("login.jsp");
	}
	Flight adminUpdate = (Flight) session.getAttribute("adminFlightUpdate");

	Connection con = DpConnection.getConnection();
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery("select * from FlightDetails");
	
      out.write("\n");
      out.write("	<div class=\"datas2\">\n");
      out.write("		<div class=\"col\">\n");
      out.write("			<div class=\"table-wrapper\">\n");
      out.write("				<table class=\"table table-bordered\">\n");
      out.write("					<thead>\n");
      out.write("					\n");
      out.write("						<tr>\n");
      out.write("\n");
      out.write("							<th></th>\n");
      out.write("							<th>id</th>\n");
      out.write("							<th>Flight Number</th>\n");
      out.write("							<th>Flight Name</th>\n");
      out.write("							<th>Flight Source</th>\n");
      out.write("							<th>FlightDestination</th>\n");
      out.write("							<th>Flight Amount</th>\n");
      out.write("							<th>Flight Time</th>\n");
      out.write("\n");
      out.write("						</tr>\n");
      out.write("						\n");
      out.write("					</thead>\n");
      out.write("					<tbody>\n");
      out.write("\n");
      out.write("						");

						while (rs.next()) {
						
      out.write("\n");
      out.write("\n");
      out.write("						<tr>\n");
      out.write("							<td><a class=\"btn btn-danger\"\n");
      out.write("								href=\"AdminFlightDeleteServlet?id=");
      out.print(rs.getInt("id"));
      out.write("\">Delete</a></td>\n");
      out.write("							<td>");
      out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightNumber"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightName"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightSource"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightDestination"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightTime"));
      out.write("</td>\n");
      out.write("							<td>");
      out.print(rs.getString("FlightAmount"));
      out.write("</td>\n");
      out.write("							\n");
      out.write("						</tr>\n");
      out.write("\n");
      out.write("						");

						}
						
      out.write("\n");
      out.write("					</tbody>\n");
      out.write("				</table>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
