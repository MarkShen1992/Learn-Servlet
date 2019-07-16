<%-- ************ ApplicationBean2.jsp ************ --%>
<jsp:useBean id="counterBean"
             scope="application"
             class="bean.CounterBean" />
<HTML>
<BODY>
<H3>CounterBean scope="application" Example</H3>
<B>Count:</B> <%= counterBean.getCount() %>
</BODY>
</HTML>
