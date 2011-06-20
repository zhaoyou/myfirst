<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/showDetail.css" />
<script type="text/javascript" src="assets/js/showDetail.js"></script>
</head>
<body>
  <%
    String content = "非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）";
    String detail = "1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录";
  %>
  <table border="2">
    <tr>
      <th>省份</th>
      <th>AZ药品</th>
    </tr>
    <tr>
      <td>山东省</td>
      <td title="<%=content%>"></td>
    </tr>
    <tr>
      <td>江苏省</td>
      <td><a onmouseover="OpenDiv(400,200,'getContentItem?id=1')"
        onmouseout="document.getElementById('showDetail').style.display='none'"
        href="#">详细</a></td>
    </tr>
  </table>
  <div id="showDetail" style="display: none"
    onmouseout="this.style.display='none'"></div>
</body>
</html>