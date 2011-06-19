<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基本药物 databass framework</title>
<%String basepath = "assets/"; %>
<link rel="stylesheet" href="<%=basepath %>css/info2.css">
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
    <div class="column_class">
    <%-- 
        <span class="column_item"><a>AZ产品</a></span>
        <span class="column_item"><a>关注领域</a></span>--%>
    </div>
    <hr style="margin-left: 50px; margin-right: 50px;">
    <div class="mainContent">
        <div class="content">
            <table>
                <tbody>
                    <c:forEach var="p" items="${provinceList }">
                        <tr>
                          <td class="provicetd" >${p.provinceName }</td>
                          <td class="td_format"><span id="province_${p.id }" class="childContent"></span></td>
                         </tr>
                    </c:forEach>
                </tbody>
                <%-- 
                <tr>
                    <td class="provicetd">湖南</td>
                    <td>内容..........</td>
                </tr>
                 <tr>
                    <td class="provicetd">江苏</td>
                    <td>内容..........</td>
                </tr>
                 <tr>
                    <td class="provicetd">江西</td>
                    <td>内容.....sdfsdfsffs.....ssssssssssssssssssssssssss</td>
                </tr>
                --%>
                
            </table>
        </div>
    </div>
    <%@include file="footer.jsp" %>
    <script type="text/javascript" src="<%=basepath%>js/info2.js"></script>
</body>
</html>