import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.*;

public class ShowRs extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		
		out.println("<table border=1>");
		out.println("<tr><td>Content:</td></tr>");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bbs?user=root&password=12345678");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from article"); 
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>" + rs.getString("cont") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt= null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
