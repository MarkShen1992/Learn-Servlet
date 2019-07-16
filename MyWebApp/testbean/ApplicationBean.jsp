<%-- *********** ApplicationBean.jsp ************ --%>

<%--
<jsp:useBean id="counterBean"
             scope="application"
             class="bean.CounterBean" />
             
 --%>
 
<%
bean.CounterBean counterBean = (bean.CounterBean)application.getAttribute("counterBean");
if(counterBean == null) {
	counterBean = new bean.CounterBean();
	application.setAttribute("counterBean", counterBean);
}

%>
<HTML>
<BODY>
<H3>CounterBean scope="application" Example</H3>
<B>Count:</B> <%= counterBean.getCount() %>
</BODY>
</HTML>
