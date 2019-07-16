<%@page contentType="text/html;charset=gb2312"%>
<%-- request.setCharacterEncoding("GB2312"); --%>
<TABLE> <!-- ********** TitleBar.jsp ************** -->
<TR>
<TD>
</TD>
<TD>
<% out.println("Hi: " + new String(request.getParameter("user").getBytes("8859_1"), "GB2312"));%>

</TD>
</TR>
</TABLE>