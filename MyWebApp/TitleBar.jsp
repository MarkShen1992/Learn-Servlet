<%@page contentType="text/html;charset=gb2312"%>
<TABLE> <!-- ********** TitleBar.jsp ************** -->
<TR>
<TD>
</TD>
<TD>
<% out.println("Hi: " + request.getParameter("user"));%>
<%=new java.util.Date()%>
</TD>
</TR>
</TABLE>