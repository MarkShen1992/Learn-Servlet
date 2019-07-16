
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

public class ThreeParams extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		//���post��ʽ�ύ���ݵ�����
		//һ��Ҫд�ڴ�ȡ��һ������֮ǰ
		request.setCharacterEncoding("GBK");
		
		//���get��ʽ�������⣺-->URIEncoding="GBK"
		
		PrintWriter out = response.getWriter();
		out.println(request.getParameter("param1"));
		out.println("<br>");
		out.println(request.getParameter("param2"));
		out.println("<br>");
		out.println(request.getParameter("param3"));
		out.println("<br>");
		System.out.println("in doGet");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in doPost");
		doGet(request, response);
	}
}
