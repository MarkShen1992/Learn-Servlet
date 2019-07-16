
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//����Cookie

//1:������������ͻ���д����
//2:ֻ�����ı�����
//3:�ͻ��˿�����ֹ������д��
//4:ֻ�����Լ�webappд��Ķ���
//5:Cookie��Ϊ����,��һ�֣����ڴ���/�Ӵ��ڣ������ڴ��еģ����ڶ��֣������ı�(���������ڵģ�
//6:һ��servlet/jsp���õ�cookies�ܹ���ͬһ��·�����������·�������servlet/jsp���� (·�� = URL)(·�� != ��ʵ�ļ�·��)

public class SetCookies extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		for (int i = 0; i < 3; i++) {
			// Default maxAge is -1, indicating cookie applies only to current browsing session.
			Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
			response.addCookie(cookie);

			cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-Value-P" + i);
			// Cookie is valid for an hour, regardless of whether user quits browser, reboots computer, or whatever.
			cookie.setMaxAge(3600);
			response.addCookie(cookie);
		}
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>����Cookie</title></head>"
				+ "<BODY>\n" 
				+ "<H1 ALIGN=\"CENTER\">"
				+ "����Cookie" + "</H1>\n"
				+ "6��Cookie\n"
				+ "<A HREF=\"ShowCookies\">\n"
				+ "�鿴</A>.\n"
				+ "</BODY></HTML>");
	}
}
