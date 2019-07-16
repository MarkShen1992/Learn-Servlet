<html>
<head>
<title>Devide</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body bgcolor="#FFFFFF">
<center>
<h1>
<% 
	try{
	//System.out.println(request.getParameter("v1"));
			float multiplicand = Float.parseFloat( request.getParameter( "value1" ) );
   		float multiplicator = Float.parseFloat( request.getParameter( "value2" ) );
   		double result=multiplicand*multiplicator;
   		out.println( multiplicand + " * " + multiplicator + " = " + result );
   	}
   	catch( Exception ex ){
   		out.println( "不合法的被乘数或乘数！" );
   	}
%>   
</h1>
</center>	
</body>
</html>