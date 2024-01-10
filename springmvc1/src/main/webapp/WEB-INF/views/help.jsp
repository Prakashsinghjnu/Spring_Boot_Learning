<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is my help page</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>My name is Prakash</h1>
<h3>This is my help page</h3>
<%
/* String name1=(String)request.getAttribute("key");
String name2=(String)request.getAttribute("key1");
Integer id1=(Integer)request.getAttribute("id"); */
%>

<h1>
My name is ${key};
<hr>
My name is ${key1};
<%-- <%=name1%>
<%=id1%> --%>
</h1>
<hr>
<h4>${datetime}</h4>
<h3><%-- <%=name2 %> --%></h3>
<hr>
<h2>
${marks};
</h2>
<c:forEach var="item" items="${marks}">
<h1>${item}</h1>
</c:forEach>
</body>
</html>