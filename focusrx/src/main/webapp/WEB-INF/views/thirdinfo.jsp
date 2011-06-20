<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本药物 databass framework</title>
<%String basepath = "assets/"; %>
<link rel="stylesheet" href="<%=basepath %>css/info3.css">


</head>
<body>
    <%@include file="header.jsp"%>
    <h1>基本药物 databass framework</h1>
    <div class="directorydiv">
    序号: 
        <select id="directory">
            <c:forEach items="${directoryList }" var="d">
                 <option value="${d.id }"> ${d.directoryName }</option>
            </c:forEach>
        </select>
    </div>
    <div class="second_directory">
    <%-- 
        <span class="second_item"><a>药物目录</a></span>
         <span class="second_item"><a>增补模式</a></span>
          <span class="second_item"><a>遴选原则</a></span>
           <span class="second_item"><a>遴选来源</a></span>--%>
    </div>
    <div id="result_info">
        <table id="result_table">
        <%-- 
            <tbody>
              <tr><th></th><th>AZ产品</th><th>关注领域</th></tr>
              <tr><td class="table_privince">江苏省</td><td class="table_content">普米克（布地奈德）</td><td class="table_content">详细</td></tr>
              <tr><td class="table_privince">四川省</td><td class="table_content">没有相关通用名进入目录</td><td class="table_content">详细</td></tr>
            </tbody>
            --%>
        </table>
    </div>
    <%@include file="footer.jsp" %>
    <script type="text/javascript" src="<%=basepath%>js/info3.js"></script>
</body>
</html>