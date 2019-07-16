//��ʵ����ʾ��¼�ͻ���������Ϣ��Filter
//Filter����˼�ǿ�����Servletʵ������ʵ���ԵĴ���֮ǰ���𵽡����ˡ�������.
//һ��Filter���Թ���һ������Servlet��
//Filter����ʵ��javax.Servlet.Filter�ӿڣ�
//���ұ��붨��������������:init(),destory(),doFilter().



//web.xml�����������
//	<filter>
//		<filter-name>LogFilter</filter-name>
//		<filter-class>LogFilter</filter-class>
//	</filter>
//	<filter-mapping>
//		<filter-name>LogFilter</filter-name>
//		<url-pattern>/*</url-pattern>
//	</filter-mapping> 


//������tomcat  Ŀ¼��logĿ¼�µ�localhost.2006-01-02.log����������Ϣ:

//2006-1-2  16:25:51  org.apache.catalina.core.ApplicationContext  log
//��Ϣ:  [127.0.0.1]  request:  /Filter/
//2006-1-2  16:25:51  org.apache.catalina.core.ApplicationContext  log
//��Ϣ:  [127.0.0.1]  done

//�����logFilter�Ѿ���server���óɹ�.
//��Ȼ��ʵ��Ӧ����filter���������ô�,���½��֤������ת����.
	
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {
	private ServletContext context;

	public void init(FilterConfig arg0) throws ServletException {
		context = arg0.getServletContext();
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		context.log("[" + arg0.getRemoteHost() + "] request: "
				+ ((HttpServletRequest) arg0).getRequestURI());
		arg2.doFilter(arg0, arg1);
		context.log("[" + arg0.getRemoteHost() + "] done");
	}

	public void destroy() {
		context = null;
	}

}