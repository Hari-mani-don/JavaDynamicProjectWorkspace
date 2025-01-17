/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2024-05-15 23:36:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;
import dpConnection.DpConnection;
import modelClass.Flight;
import java.sql.Connection;
import modelClass.Login;

public final class PlanesPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("dpConnection.DpConnection");
    _jspx_imports_classes.add("modelClass.Flight");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<title>Planes</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/bootstrap.css\">\n");
      out.write("<style>\n");
      out.write("/* Custom CSS */\n");
      out.write(".custom-card {\n");
      out.write("	border: 1px solid #dee2e6;\n");
      out.write("	border-radius: 0.25rem;\n");
      out.write("	margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-body {\n");
      out.write("	max-height: 200px; /* Adjust the maximum height as needed */\n");
      out.write("	overflow: auto;\n");
      out.write("	/* Add scrollbar if content exceeds the maximum height */\n");
      out.write("}\n");
      out.write("/* Custom CSS */\n");
      out.write(".seat {\n");
      out.write("	width: 50px;\n");
      out.write("	height: 50px;\n");
      out.write("	background-color: #ccc;\n");
      out.write("	border: 1px solid #aaa;\n");
      out.write("	margin: 5px;\n");
      out.write("	display: inline-block;\n");
      out.write("	text-align: center;\n");
      out.write("	line-height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".available {\n");
      out.write("	background-color: #28a745;\n");
      out.write("	color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".unavailable {\n");
      out.write("	background-color: #dc3545;\n");
      out.write("	color: #fff;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");

	Login authentication = (Login) session.getAttribute("userEmail");
	ArrayList<Flight> flights = (ArrayList<Flight>) session.getAttribute("flightList");
	if (authentication == null) {
		response.sendRedirect("login.jsp");
	}
	
      out.write('\n');
      out.write('	');

	int flag = 0;
	for (Flight flightList : flights) {

		if (flag == 0) {
			flag = 1;
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"row mt-5\">\n");
      out.write("			<!-- Left card -->\n");
      out.write("			<div class=\"col-md-5\">\n");
      out.write("				<div class=\"card custom-card\">\n");
      out.write("					<img src=\"./images/airplane2.jpg\" class=\"card-img-top\"\n");
      out.write("						alt=\"Left Card Image\">\n");
      out.write("					<div class=\"card-body\">\n");
      out.write("						<h5 class=\"card-title\">");
      out.print((flightList.getFlightName()));
      out.write("</h5>\n");
      out.write("						<p class=\"card-text\">\n");
      out.write("							<strong>Flight Number:</strong>\n");
      out.write("							");
      out.print(flightList.getFlightNumber());
      out.write("<br> <strong>Destination:</strong>\n");
      out.write("							");
      out.print(flightList.getFlightdestination());
      out.write("<br> <strong>Source:</strong>\n");
      out.write("							");
      out.print(flightList.getFlightsource());
      out.write("<br> <strong>Amount:</strong>\n");
      out.write("							$");
      out.print(flightList.getFlightAmount());
      out.write("<br> <strong>Distance\n");
      out.write("								(km):</strong> 4000<br> <strong>Speed:</strong> 800 km/h<br> <strong>Time:</strong>");
      out.print(flightList.getFlightTimes());
      out.write("<br>\n");
      out.write("						</p>\n");
      out.write("						<a\n");
      out.write("							href=\"ticketBookingPage.jsp?flightName=");
      out.print(flightList.getFlightName());
      out.write("&source=");
      out.print(flightList.getFlightsource());
      out.write("&destination=");
      out.print(flightList.getFlightdestination());
      out.write("&amount=");
      out.print(flightList.getFlightAmount());
      out.write("&time=");
      out.print(flightList.getFlightTimes());
      out.write("&flightNumber=");
      out.print(flightList.getFlightNumber());
      out.write("\"\n");
      out.write("							class=\"btn btn-primary\">Book Tickets</a> \n");
      out.write("							<a\n");
      out.write("							id=\"showSeatsBtn");
      out.print(flightList.getId());
      out.write("\"\n");
      out.write("							class=\"btn btn-secondary\">Seats Check</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			");

			}
			
      out.write("\n");
      out.write("			<div class=\"col-md-6\"></div>\n");
      out.write("			");

			if (flag == 1) {
				flag = 0;
			
      out.write("\n");
      out.write("		</div>\n");
      out.write("		<div class=\"row mt-5\">\n");
      out.write("			<div class=\"col-md-6\"></div>\n");
      out.write("			<!-- Right card -->\n");
      out.write("			<div class=\"col-md-5\">\n");
      out.write("				<div class=\"card custom-card\">\n");
      out.write("					<img src=\"./images/airplane2.jpg\" class=\"card-img-top\"\n");
      out.write("						alt=\"Left Card Image\">\n");
      out.write("					<div class=\"card-body\">\n");
      out.write("						<h5 class=\"card-title\">");
      out.print((flightList.getFlightName()));
      out.write("</h5>\n");
      out.write("						<p class=\"card-text\">\n");
      out.write("							<strong>Destination:</strong>\n");
      out.write("							");
      out.print(flightList.getFlightdestination());
      out.write("<br> <strong>Source:</strong>\n");
      out.write("							");
      out.print(flightList.getFlightsource());
      out.write("<br> <strong>Amount:</strong>\n");
      out.write("							$");
      out.print(flightList.getFlightAmount());
      out.write("<br> <strong>Distance\n");
      out.write("								(km):</strong> 4000<br> <strong>Speed:</strong> 800 km/h<br> <strong>Time:</strong>");
      out.print(flightList.getFlightTimes());
      out.write("<br>\n");
      out.write("						</p>\n");
      out.write("						<a href=\"#\" class=\"btn btn-primary\">BooK Tickets</a> <a\n");
      out.write("							id=\"showSeatsBtn\" class=\"btn btn-secondary\">Show seats</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"col-md-6\"></div>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	");

	}
	
      out.write('\n');
      out.write('	');

	}
	
      out.write("\n");
      out.write("\n");
      out.write("	<script>\n");
      out.write("		// Mock data for available seats\n");
      out.write("		var availableSeats = [ {\n");
      out.write("			seatNumber : 'A1',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A2',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A3',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A4',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B1',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B2',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B3',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B4',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C1',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C2',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C3',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C4',\n");
      out.write("			available : true\n");
      out.write("		}, ];\n");
      out.write("\n");
      out.write("		var availableSeats2 = [ {\n");
      out.write("			seatNumber : 'A1',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A2',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A3',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'A4',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B1',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B2',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B3',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'B4',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C1',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C2',\n");
      out.write("			available : true\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C3',\n");
      out.write("			available : false\n");
      out.write("		}, {\n");
      out.write("			seatNumber : 'C4',\n");
      out.write("			available : true\n");
      out.write("		}, ];\n");
      out.write("\n");
      out.write("		// Function to display available seats\n");
      out.write("		function showAvailableSeats() {\n");
      out.write("			var seatsContainer = document.createElement('div');\n");
      out.write("			seatsContainer.classList.add('row', 'mt-3');\n");
      out.write("			seatsContainer.id = 'seatsContainer'; // Add id for future reference\n");
      out.write("\n");
      out.write("			availableSeats.forEach(function(seat) {\n");
      out.write("				var seatElement = document.createElement('div');\n");
      out.write("				seatElement.textContent = seat.seatNumber;\n");
      out.write("				seatElement.classList.add('seat');\n");
      out.write("				if (seat.available) {\n");
      out.write("					seatElement.classList.add('available');\n");
      out.write("				} else {\n");
      out.write("					seatElement.classList.add('unavailable');\n");
      out.write("				}\n");
      out.write("				seatsContainer.appendChild(seatElement);\n");
      out.write("			});\n");
      out.write("\n");
      out.write("			var button = document.getElementById('showSeatsBtn2');\n");
      out.write("			button.parentNode.insertBefore(seatsContainer, button.nextSibling);\n");
      out.write("		}\n");
      out.write("		function showAvailableSeats1() {\n");
      out.write("			var seatsContainer = document.createElement('div');\n");
      out.write("			seatsContainer.classList.add('row', 'mt-3');\n");
      out.write("			seatsContainer.id = 'seatsContainer'; // Add id for future reference\n");
      out.write("\n");
      out.write("			availableSeats.forEach(function(seat) {\n");
      out.write("				var seatElement = document.createElement('div');\n");
      out.write("				seatElement.textContent = seat.seatNumber;\n");
      out.write("				seatElement.classList.add('seat');\n");
      out.write("				if (seat.available) {\n");
      out.write("					seatElement.classList.add('available');\n");
      out.write("				} else {\n");
      out.write("					seatElement.classList.add('unavailable');\n");
      out.write("				}\n");
      out.write("				seatsContainer.appendChild(seatElement);\n");
      out.write("			});\n");
      out.write("\n");
      out.write("			var button = document.getElementById('showSeatsBtn1');\n");
      out.write("			button.parentNode.insertBefore(seatsContainer, button.nextSibling);\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		// Event listener for button click to show available seats\n");
      out.write("		document.getElementById('showSeatsBtn2').addEventListener('click',\n");
      out.write("				function() {\n");
      out.write("					showAvailableSeats();\n");
      out.write("				});\n");
      out.write("		document.getElementById('showSeatsBtn1').addEventListener('click',\n");
      out.write("				function() {\n");
      out.write("					showAvailableSeats1();\n");
      out.write("				});\n");
      out.write("	</script>\n");
      out.write("\n");
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
