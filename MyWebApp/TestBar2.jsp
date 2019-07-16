<%@page contentType="text/html;charset=gb2312"%>
<HTML> <!-- *************** TestBar.jsp ***************** -->
<HEAD>
<TITLE>TestBar.jsp</TITLE>
</HEAD>
<BODY>
<TABLE WIDTH="100%">
<TR><TD>
	<jsp:include page="TitleBar2.jsp">
		<jsp:param name="user" value="<%=new String("你".getBytes("GB2312"), "8859_1")%>"/>
	</jsp:include>
</TD></TR>
<TR><TD><% out.println("<P>这是用户显示区</P>"); %></TD></TR>
</TABLE>
</BODY>
</HTML>
