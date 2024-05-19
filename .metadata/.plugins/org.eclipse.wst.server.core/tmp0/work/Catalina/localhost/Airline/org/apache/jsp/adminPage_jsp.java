/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-05-16 15:51:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class adminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Mani Plane</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap.css\">\n");
      out.write("<!-- Font Awesome for icons (you can replace this with any icon library) -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"/w3School/userPage/userpage.css\"> -->\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("	background-image: url(\"./images/airplane.avif\");\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-size: cover;\n");
      out.write("}\n");
      out.write("/* Additional custom styles */\n");
      out.write(".navbar-nav .nav-link.active {\n");
      out.write("	color: black;\n");
      out.write("	font-weight: 900;\n");
      out.write("	/* Changes the color of the active nav link to blue and increases font weight */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style for dropdowns */\n");
      out.write(".dropdown-toggle::after {\n");
      out.write("	display: inline-block;\n");
      out.write("	margin-left: .255em;\n");
      out.write("	vertical-align: .255em;\n");
      out.write("	content: \"\";\n");
      out.write("	border-top: .3em solid;\n");
      out.write("	border-right: .3em solid transparent;\n");
      out.write("	border-bottom: 0;\n");
      out.write("	border-left: .3em solid transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-menu {\n");
      out.write("	border-radius: 0;\n");
      out.write("	margin-top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Profile.dropdown-toggle::after {\n");
      out.write("	display: none; /* Hide the arrow for the profile dropdown */\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("		<div class=\"container-fluid\">\n");
      out.write("			<a class=\"navbar-brand\" href=\"adminPage.jsp\">Mani Plane</a>\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\"\n");
      out.write("				aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\"\n");
      out.write("				aria-label=\"Toggle navigation\">\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("			</button>\n");
      out.write("			<div class=\"collapse navbar-collapse lists\" id=\"navbarNavDropdown\">\n");
      out.write("				<ul class=\"navbar-nav mr-auto\">\n");
      out.write("					<li class=\"nav-item dropdown\"><a class=\"nav-link \"\n");
      out.write("						aria-current=\"page\" href=\"adminPage.jsp\"\n");
      out.write("						onclick=\"changeActiveLink(this)\">Home</a></li>\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\"\n");
      out.write("						id=\"navbarDropdownMenuLink1\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Users </a>\n");
      out.write("						<ul class=\"dropdown-menu\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink1\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminInsertDataPage.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">add User</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminUpdateUser.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">update user</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminDeletPage.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">delete user</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"planesServlet\"\n");
      out.write("						id=\"navbarDropdownMenuLink2\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" > Planes </a>\n");
      out.write("						<ul class=\"dropdown-menu\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink2\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminFlightDataInsert.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">add Plane</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminFlightDataUpdate.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">update Plane</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"adminFlightDelete.jsp\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">delete Plane</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("					<!-- <li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\"\n");
      out.write("						id=\"navbarDropdownMenuLink3\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Tickets </a>\n");
      out.write("						<ul class=\"dropdown-menu\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink3\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">add ticket</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">update ticket</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">delete ticket</a></li>\n");
      out.write("						</ul></li> -->\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\"\n");
      out.write("						id=\"navbarDropdownMenuLink4\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Turn Over </a>\n");
      out.write("						<ul class=\"dropdown-menu\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink4\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">Per day</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">Per month</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">Per Year</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\"\n");
      out.write("						id=\"navbarDropdownMenuLink4\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> Day TurnOVer </a>\n");
      out.write("						<ul class=\"dropdown-menu\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink4\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\"\n");
      out.write("								onclick=\"changeActiveLink(this)\">Select date</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("			<div>\n");
      out.write("				<ul class=\"navbar-nav ml-auto Profile nav-link\">\n");
      out.write("					<li class=\"nav-item dropdown\"><a\n");
      out.write("						class=\"nav-link dropdown-toggle Profile\" href=\"#\"\n");
      out.write("						id=\"navbarDropdownMenuLink\" role=\"button\"\n");
      out.write("						data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> <i\n");
      out.write("							class=\"fas fa-user-circle\"></i>\n");
      out.write("					</a>\n");
      out.write("						<ul class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("							aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">My Profile</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"logOutServlet\">Logout</a></li>\n");
      out.write("						</ul></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</nav>\n");
      out.write("	<!-- Bootstrap JS -->\n");
      out.write("	<script src=\"./js/bootstrap.bundle.min.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		function changeActiveLink(link) {\n");
      out.write("			// Remove 'active' class from all nav links within the dropdown menu\n");
      out.write("			var parentDropdown = link.closest('.dropdown-menu');\n");
      out.write("			if (parentDropdown) {\n");
      out.write("				var navLinks = parentDropdown\n");
      out.write("						.querySelectorAll('.dropdown-item');\n");
      out.write("				navLinks.forEach(function(navLink) {\n");
      out.write("					navLink.classList.remove('active');\n");
      out.write("				});\n");
      out.write("			} else {\n");
      out.write("				// Remove 'active' class from all nav links\n");
      out.write("				var navLinks = document\n");
      out.write("						.querySelectorAll('.navbar-nav .nav-link');\n");
      out.write("				navLinks.forEach(function(navLink) {\n");
      out.write("					navLink.classList.remove('active');\n");
      out.write("				});\n");
      out.write("			}\n");
      out.write("\n");
      out.write("			// Add 'active' class to the clicked nav link\n");
      out.write("			link.classList.add('active');\n");
      out.write("		}\n");
      out.write("	</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
