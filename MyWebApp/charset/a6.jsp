<%@ page contentType="text/html;charset=GBK"%>

<%//@ page pageEncoding="iso8859-1"%>

<%request.setCharacterEncoding("GBK");%>

<%String s = "�ٺ�";%>

<%//s = new String ("�ٺ�".getBytes(),"iso8859-1");%>

<jsp:include page="b.jsp">
	<jsp:param name="user" value="<%=s%>"/>
</jsp:include>




