<%-- ************* RequestBean.jsp ************** --%>


<jsp:useBean id="counterBean"
             scope="request"
             class="bean.CounterBean" />

<%--
<%
	bean.CounterBean counterBean = (bean.CounterBean)request.getAttribute("counterBean");
	if(counterBean == null) {
		counterBean = new bean.CounterBean();
		request.setAttribute("counterBean", counterBean);
	}
%>
--%>

<HTML>
<BODY>
<H3>CounterBean scope="request" Example</H3>

<% counterBean.setCount(100); %>

<jsp:forward page="RequestBean2.jsp" />

<%--
<% response.sendRedirect("RequestBean2.jsp"); %>
--%>
</BODY>
</HTML>
