<%-- ************* RequestBean2.jsp ************** --%>
<jsp:useBean id="counterBean"
             scope="request"
             class="bean.CounterBean" />
<HTML>
<BODY>
<H3>CounterBean scope="request" Example</H3>
<B>Count:</B> <%= counterBean.getCount() %>
</BODY>
</HTML>