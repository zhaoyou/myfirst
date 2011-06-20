<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看详细信息</title>
<style type="text/css">
.showdetailNav {
  margin-top: 10px;
  padding: 10px;
  background: #F0F0F0;
  color: #1f3e88;
  font-size: 20px;
  font-weight: bold;
}

.detail {
  box-shadow: 0 0 20px silver;
  -moz-box-shadow: 0 0 20px silver;
  -webkit-box-shadow: 0 0 20px silver;
  border-radius: 10px;
  -moz-border-radius: 10px;
  -webkit-border-radius: 10px;
  margin: 20px auto 40px;
  font-family: arial, sans-serif;
  font-size: 18px;
  overflow: atuo;
  padding: 50px;
  width: 700px;
  text-align: left;
}
</style>
</head>
<body>
  <%
    String basepath = "assets/";
  %>
  <%@include file="header.jsp"%>
  <div class="showdetailNav">${item.province.provinceName
    }-->${item.name }</div>
  <br>
  <div align="center">
    <div class="detail">
      <c:forEach var="singleItem" items="${contentItemList }">
        ${ singleItem.name} :<br> &nbsp;&nbsp;&nbsp;&nbsp;${ singleItem.content} <p>
      </c:forEach>
    </div>
  </div>

  <%@include file="footer.jsp"%>
</body>
</html>