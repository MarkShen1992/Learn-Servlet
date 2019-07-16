<%@ page import="bean.*" %>

<%--

<% response.sendRedirect("../servlet/ShowRs"); %>

<% CounterBean cb = new CounterBean(); %>

<font color="red" size="5">
	<%=cb.getCount()%>
</font>
--%>

oooooo
<jsp:useBean id="cb" class="bean.CounterBean">
</jsp:useBean>

<jsp:setProperty name="cb" property="count" value="23"/>                   <%-- cb.setCount(Integer.parseInt("23")) --%>
<jsp:getProperty name="cb" property="count"/>                              <%-- out.print(cb.getCount()) --%>
	
	

