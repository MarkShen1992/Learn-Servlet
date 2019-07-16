<%@ page language="java" import="bean.HelloBean;" %>
<%@ page contentType="text/html;charset=gb2312" %>
<%
//request.getParameter("name");
//request.setCharacterEncoding("gb2312");
%>
<jsp:useBean id="hello" class="bean.HelloBean" scope="request" >
	<jsp:setProperty name="hello" property="*" />
</jsp:useBean>
<html>
<head>
<title>HelloBean</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body bgcolor="#FFFFFF">
<p>&nbsp;</p>
<p align="center">
<font size="4">欢迎
<font color="#0000FF"><b>
	
<%--	
<%=new String(hello.getName().getBytes("ISO8859_1"),"GBK")%>
--%>
</b></font>
<%--
<%=new String(hello.getSex().getBytes("ISO8859_1"),"GBK")%>
--%>
</font></p>

<jsp:getProperty name="hello" property="name"/>
<jsp:getProperty name="hello" property="sex"/>

</body>
</html>



