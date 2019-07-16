<html>
<head>
<title>Divide</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body bgcolor="#FFFFFF">
<center>
<h1>
<% 
	try{
		float dividend = Float.parseFloat( request.getParameter( "value1" ) );
   		float divisor = Float.parseFloat( request.getParameter( "value2" ) );
   		double result=dividend/divisor;
   		%>
   		<%= result%>
   		<%
   		//out.println( dividend + " / " + divisor + " = " + result );
   	}
   	catch( Exception ex ){
   		out.println( "不合法的被乘数或除数！" );
   	}
%>   
</h1>
</center>	
</body>
</html>
