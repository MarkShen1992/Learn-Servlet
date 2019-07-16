<%-- *************** PageBean.jsp **************** --%>
<jsp:useBean id="counterBean"
             scope="page"
             class="bean.CounterBean" />
<HTML>
<BODY>
<H3>CounterBean scope="page" Example</H3>
<B>count:</B> <%= counterBean.getCount() %>
<jsp:getProperty name="counterBean" property="count"/>
</BODY>
</HTML>