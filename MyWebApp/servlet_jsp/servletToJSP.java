import javax.servlet.*;
import javax.servlet.http.*;

public class ServletToJsp extends HttpServlet {
	public void doGet (HttpServletRequest req,HttpServletResponse resp) {
	    try {
			// �������Բ������ύ��ServletUseJsp.jsp
s		    resp.setContentType("text/html;charset=gb2312");
	        req.setAttribute ("servletName", "ServletToJsp");
	        getServletConfig().getServletContext().getRequestDispatcher
		    ("/ServletUseJsp.jsp").forward(req, resp);
	    }catch (Exception e){
	        e.printStackTrace ();
	    }
	}
}
