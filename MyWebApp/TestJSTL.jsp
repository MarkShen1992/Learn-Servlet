﻿<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>Count to 10 Example (using JSTL)</title>
	</head>
	<body>
		<c:forEach var="i" begin="1" end="10" step="1">
			<c:out value="${i}" />
			<br />
		</c:forEach>
	</body>
</html>