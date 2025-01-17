package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		try (PrintWriter out = response.getWriter();) {

			String userName = request.getParameter("userName");
			String userPassword = request.getParameter("password");

			if (userName.equals("admin") && userPassword.equals("admin@123")) {

				RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminData.html");
				requestDispatcher.forward(request, response);

			} else {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Users", "root", "root");
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("select * from LoginUser");

				int loginCheckFlag = 0;
				while (rs.next()) {
					String name = rs.getString("UserName");
					String password = rs.getString("Password");

					if (name.equals(userName) && password.equals(userPassword)) {
						out.println("Your Name: " + name);
						out.println("Your Password: " + password);
//						RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginSuccess.html");
//						requestDispatcher.forward(request, response);
						loginCheckFlag = 1;
						break;
					}
				}
				if (loginCheckFlag == 0) {
					System.out.println("Invalid Users");
					out.println("Invalid username and password");
				}
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
