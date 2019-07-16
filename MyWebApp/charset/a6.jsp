<%@ page contentType="text/html;charset=GBK"%>

<%//@ page pageEncoding="iso8859-1"%>

<%request.setCharacterEncoding("GBK");%>

<%String s = "細細";%>

<%//s = new String ("細細".getBytes(),"iso8859-1");%>

<jsp:include page="b.jsp">
	<jsp:param name="user" value="<%=s%>"/>
</jsp:include>




