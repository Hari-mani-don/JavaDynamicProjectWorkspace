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
 * Servlet implementation class AdminDeleteData
 */
@WebServlet("/AdminDeleteDataServlet")
public class AdminDeleteData extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter out = response.getWriter();) {

			String deleteUserName = request.getParameter("deleteUserName");
			String deleteUserPassword = request.getParameter("deleteUserPassword");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root", "root");
			Statement stm1 = con.createStatement();
			Statement stm = con.createStatement();
			ResultSet result = stm1.executeQuery("Select * from LoginUser");
			Integer id = null;
			while (result.next()) {
				if (deleteUserName.equals(result.getString("UserName"))
						&& deleteUserPassword.equals(result.getString("Password"))) {
					id = result.getInt("id");
					break;
				}
			}

			if (id != null) {
				int rs = stm.executeUpdate("delete from LoginUser where id=" + id);
				if (rs == 1) {
					out.println("Deleted data Success");
				} else {
					out.println("Data not Deleted try again!!");
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
