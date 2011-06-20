<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<% String basepath = "assets/";%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" media="screen" href="<%=basepath%>css/index.css"/>
</head>
<body>
<%@include file="header.jsp" %>
<div id="main">
    <h1>基本药物 databass framework</h1>
    <p style="text-align: -webkit-center; margin-bottom: 200px;"><a href="getInfo">Go Info</a></p>
 </div>
<%@include file="footer.jsp" %>
</body>
</html>