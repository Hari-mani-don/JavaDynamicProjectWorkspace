package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class adminUpadteServlet
 */
@WebServlet("/adminUpdateServlet")
public class adminUpadteServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter out = response.getWriter();) {
			String ExistingUserName = request.getParameter("existingUserName");
			String ExistingUserPassword = request.getParameter("ExistingUaerpassword");

			String NewUserName = request.getParameter("NewUserName");
			String NewUserPassword = request.getParameter("NewUserpassword");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root", "root");
			Statement stm1 = con.createStatement();
			Statement stm = con.createStatement();
			ResultSet result = stm1.executeQuery("Select * from LoginUser");
			Integer id = null;
			while (result.next()) {
				if (ExistingUserName.equals(result.getString("UserName"))
						&& ExistingUserPassword.equals(result.getString("Password"))) {
					id = result.getInt("id");
					break;
				}
			}

			if (id != null) {
				int rs = stm.executeUpdate("update LoginUser set UserName='" + NewUserName + "' , Password='"
						+ NewUserPassword + "' where id=" + id);
				if (rs == 1) {
					out.println("Update data Success");
				} else {
					out.println("Data not Updated try again!!");
				}
			} else {
				out.println("User is not available");
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
