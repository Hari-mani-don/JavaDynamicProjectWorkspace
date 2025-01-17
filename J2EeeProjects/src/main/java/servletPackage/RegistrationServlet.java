package servletPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegisrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter out = response.getWriter();) {

			String registerName = request.getParameter("registerName");
			String registerMobileNumber = request.getParameter("registerMobileNumber");
			String registerEmail = request.getParameter("registerEmail");
			String registerPassword = request.getParameter("registerPassword");
			String registerAddress = request.getParameter("registerAddress");
			String registerGender = request.getParameter("registerGender");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root", "root");
			Statement stm = con.createStatement();
			int rs = stm.executeUpdate(
					"Insert into  RegistrationDetails (UserName,Password,Email,Address,MobileNumber,Gender) values('"
							+ registerName + "','" + registerPassword + "','" + registerEmail + "','" + registerAddress
							+ "','" + registerMobileNumber + "','" + registerGender + "')");

			if (rs == 1) {
				out.println("" + "Register Successful");
			} else {
				out.println("Data not inserted try again!!");
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
