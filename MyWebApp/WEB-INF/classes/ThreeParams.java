import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class ThreeParams extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		request.setCharacterEncoding("GBK");
		PrintWriter pw = response.getWriter();
		pw
				.println("<html><head>"
						+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />"
						+ "<title>读取所有参数</title></head>"
						+ "<BODY BGCOLOR='#FDF5E6'>\n" + "<H1 ALIGN=CENTER>"
						+ "" + "</H1>\n" + "<TABLE BORDER=1 ALIGN=CENTER>\n"
						+ "<TR BGCOLOR=\"#FFAD00\"><TD>\n");

		pw.println("<br>");
		pw.println(request.getParameter("param1"));
		pw.println("<br>");
		pw.println(request.getParameter("param2"));
		pw.println("<br>");
		pw.println(request.getParameter("param3"));
		pw.println("<br>");
		pw.println("</TABLE></TD></TR></TABLE>");
		System.out.println("doGet!");
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*
		 * PrintWriter out = response.getWriter();
		 * out.println(request.getParameter("param1")); out.println("<br>");
		 * out.println(request.getParameter("param2")); out.println("<br>");
		 * out.println(request.getParameter("param3")); out.println("<br>");
		 */
		System.out.println("doPost!");
		doGet(request, response);
	}

}
