<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<%String basepath="assets/" ;%>
<link rel="stylesheet" href="<%=basepath%>css/info.css">
</head>
<body>
    <%@include file="header.jsp" %>
    <h1>基本药物 databass framework</h1>
    <div id="searchbar">
        <form>
            <span>省份:</span>
             <select id="province">
             <c:forEach var="p" items="${provinceList }">
                <option value="${p.id }">${p.provinceName }</option>
             </c:forEach>
           
            </select>
            <span>序号:</span>
            <select id="directory">
                <c:forEach var="d" items="${directoryList }">
                    <option value="${d.id }">${d.directoryName }</option>
                </c:forEach>
                
            </select>
            <span>主要内容:</span>
            <select id="contentItem">
            </select>
            <input type="button" id="btnsearch" value="查 看" style="display: none"/>
        </form>
    </div>
    <div id="fenge" style="text-align: center;">
    <img class="line" src="<%=basepath %>images/index_line.png">
    </div>
    <div id="contentshow" >
       <div id="titleshow" style="display: none" >
            <span class="selfTitle">内容:</span>
            <div id="selfText"><!--   国家、省基本医疗保险药品目录（甲类）范围内选择，确因少数慢性疾病治疗必需的，也可从目录（乙类）范围内选择--> </div>
            <span class="selfTitle">附件</span>
            <div id="selfattachment"><!--  名字： <a href="#">下载</a>--></div>
       </div>
       <div id="childcontent">
       <!--  
            <ul>
                <li class="pli">
                <span class="ptitle">AZ产品 (通用名):</span>
                 <div class="pcontent">非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）</div></li>
                <li class="pli">
                <span class="ptitle">关注领域</span>
                <ul>
                    <li class="cli"><span class="ctitle">高血压(CCB类：络活喜；波依定以及其他大类，ARB和ACEI)</span>
                        <div class="ccontent">1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，如洛汀新、代文等都进入药物目录</div></li>
                    <li class="cli"><span class="ctitle">高血脂(立普妥)</span>
                        <div class="ccontent">阿托伐他汀（立普妥）没有进入目录</div></li>
                    <li class="cli"><span class="ctitle">呼吸</span>
                        <div class="ccontent">平喘药增加三种：特布他林、布地奈德、班布特罗</div></li>
                    <li class="cli"><span class="ctitle">消化道(抗酸药及抗溃疡药类)</span>
                        <div class="ccontent">抗酸药及抗溃疡药类增加三类：硫糖铝、大黄碳酸氢钠、西咪替丁</div></li>
                </ul>
                </li>
            </ul>
            -->
       </div>
    </div>
    <%@include file="footer.jsp" %>
    <script type="text/javascript" src="<%=basepath%>js/info.js"></script>
</body>
</html>