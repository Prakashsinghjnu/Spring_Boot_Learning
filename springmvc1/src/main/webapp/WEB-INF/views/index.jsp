<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This Is My Home Page</h1>

<%@ page import="java.util.ArrayList" %>

<% String name=(String) request.getAttribute("name");
ArrayList<String> friends = (ArrayList<String>) request.getAttribute("l");
Integer id= (Integer)request.getAttribute("id");
%>
<h1>
Id :
<%=id%>
</h1>
<h1>
My Name Is :<h3><%=name%></h3>
</h1>
<h1>
Name Of My Friends are : 
<%
for(String s:friends){
	/* out.println(s); */
%> 
</h1>
<h3>
<%=s %>
</h3>
<%
}
%>

</body>
</html>