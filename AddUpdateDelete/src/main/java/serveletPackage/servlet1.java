package serveletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter();){
			String userEmail = request.getParameter("email");
			String password = request.getParameter("password");
			
			if(userEmail.equals("admin@gmail.com")) {
				Cookie cookies = new Cookie("email",userEmail);
				response.addCookie(cookies);
				
				out.println("welcome"+userEmail);
				out.println("<a href='Page1'>Next Page</a>");
			}
			
		}
	}

}
