package urlRewritingPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter();) {
			String userEmail = request.getParameter("email");
			String password = request.getParameter("password");

			if (userEmail.equals("admin@gmail.com")) {

				out.println("email " + userEmail);
				out.println("<a href='Page1?userEmails='userEmail'>Next Page</a>");
			}

		}
	}

}
