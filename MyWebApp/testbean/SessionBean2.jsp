<%-- ************** SessionBean2.jsp **************** --%>
<jsp:useBean id="counterBean"
             scope="session"
             class="bean.CounterBean" />
<HTML>
<BODY>
<H3>CounterBean scope="session" Example</H3>
<B>Count:</B> <%= counterBean.getCount() %>
</BODY>
</HTML>