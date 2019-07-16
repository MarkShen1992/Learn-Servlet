import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestInitServlet extends HttpServlet {
	// ServletConfig config = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		out.println(this.getServletConfig().getServletName());
		java.util.Enumeration params = this.getServletConfig()
				.getInitParameterNames();
		for (; params.hasMoreElements();) {
			out.println(this.getServletConfig().getInitParameter(
					params.nextElement().toString()));
		}

		out.close();
	}

	@Override
	public void init() throws ServletException {
	}

	/*
	 * @Override public void init(ServletConfig config) throws ServletException {
	 * this.config = config; init(); } public ServletConfig getServletConfig() {
	 * return this.config; }
	 */

}
