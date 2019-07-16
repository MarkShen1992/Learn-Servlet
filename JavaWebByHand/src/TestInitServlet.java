import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//ע��<init-param>��ǩ��λ��
public class TestInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=GBK");     
		PrintWriter out = resp.getWriter();
		
		out.println(this.getServletConfig().getServletName());

		// out.println(this.getServletConfig().getInitParameter("name"));

		java.util.Enumeration params = this.getServletConfig()
				.getInitParameterNames();   
		for (; params.hasMoreElements();) {
			String name = params.nextElement().toString();
			String value = this.getServletConfig().getInitParameter(name);
			value = new String(value.getBytes("iso8859-1"),"GBK");
			out.println(value);
		}
		out.close();  
	}
}




//<servlet>
//<servlet-name>TestInitServletaaa</servlet-name>
//<servlet-class>TestInitServlet</servlet-class>
//<init-param>
//	<param-name>name</param-name>
//	<param-value>С��</param-value>
//</init-param>
//<init-param>
//	<param-name>gender</param-name>
//	<param-value>��</param-value>
//</init-param>
//</servlet>
