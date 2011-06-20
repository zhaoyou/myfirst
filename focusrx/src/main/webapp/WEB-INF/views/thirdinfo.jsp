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
     <%@include file="nav.jsp" %>
    
      <%-- 
    <div class="directorydiv" style="display: none">
    序号: 
        <select id="directory">
            <c:forEach items="${directoryList }" var="d">
                 <option value="${d.id }"> ${d.directoryName }</option>
            </c:forEach>
        </select>
    </div>
    <div class="second_directory" style="display: none">
   
        <span class="second_item"><a>药物目录</a></span>
         <span class="second_item"><a>增补模式</a></span>
          <span class="second_item"><a>遴选原则</a></span>
           <span class="second_item"><a>遴选来源</a></span>
    </div>--%>
    <div id="result_info">
        <table id="result_table">
            <tr><td colspan="1"><hr/></td></tr>
        </table>
    </div>
    <%@include file="footer.jsp" %> 
    <script type="text/javascript" src="<%=basepath%>js/info3.js"></script>
</body>
</html>