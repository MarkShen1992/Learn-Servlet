<html>
<head>
<title>forward example</title>
<body bgcolor=red>
welcome to here!
<jsp:forward page="forforward1.jsp">
	<jsp:param name="name" value="m" />
	<jsp:param name="oldName" value='<%=request.getParameter("name")%>' />
	<jsp:param name="roles" value="manager" />
</jsp:forward>
<%System.out.println("eee");%>
</body>
</html>
