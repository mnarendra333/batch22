<%@page import="java.util.Date"%>


<%!
	int a=10;
	int b =20;
%>

<%

	int c = a+b;
	
%>


<%=new Date()%>

<%

	out.println("result "+c);
	out.println(new Date());
%>