<%-- *************** SessionBean.jsp **************** --%>


<jsp:useBean id="counterBean"
             scope="session"
             class="bean.CounterBean" />
             

<%--
<%
bean.CounterBean counterBean = (bean.CounterBean)session.getAttribute("counterBean");
if(counterBean == null) {
	counterBean = new bean.CounterBean();
	session.setAttribute("counterBean", counterBean);
}
%>
--%>
<HTML>
<BODY>
<H3>CounterBean scope="session" Example</H3>
<B>Count:</B> <%= counterBean.getCount() %>
</BODY>
</HTML>