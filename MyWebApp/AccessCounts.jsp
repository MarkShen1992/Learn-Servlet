<HTML>
<HEAD>
<TITLE>JSP Declarations</TITLE>
<META NAME="author" CONTENT="Marty Hall">
<META NAME="keywords"
      CONTENT="JSP,declarations,JavaServer,Pages,servlets">
<META NAME="description"
      CONTENT="A quick example of JSP declarations.">

</HEAD>

<BODY>
<H1>JSP Declarations</H1>

<%! 
	int accessCount = 0; 
	 void m(){}
%>

<%
  int jj = 0;
 
%>

<H2>Accesses to page since server reboot: 

<%

		java.awt.Frame f = new java.awt.Frame("My First Test");
		f.setLocation(300, 300);
		f.setSize( 170,100);
		//f.setBackground( Color.blue);
		//f.setResizable(false);
		f.setVisible( true);

%>

<%= ++accessCount %></H2>


<%= ++jj %></H2>

</BODY>
</HTML>