<html>
<head>
<title> include test</title>
</head>
<body bgcolor="white">
<font color="red">
The current date and time are 
<%@ include file="date.jsp" %>
<jsp:include page="date.jsp" flush="true"/>
</font>
</body>
</html>
