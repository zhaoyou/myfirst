<%@ page language="java" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="<%=basepath %>css/nav.css" />

<script type="text/javascript">
  function displaySubMenu(li) {
    var subMenu = li.getElementsByTagName("ul")[0];
    subMenu.style.display = "inline";
  }
  function hideSubMenu(li) {
    var subMenu = li.getElementsByTagName("ul")[0];
    subMenu.style.display = "none";
  }
</script>
  <ul id="navigation" style="display: block;">
    <c:forEach var="menuItem" items="${menu }">
      <li onmouseover="displaySubMenu(this)"
      onmouseout="hideSubMenu(this)">
      <a href="#">${menuItem.key.directoryName }</a>
      <ul>
      <c:forEach var="subMenu" items="${menuItem.value }">
        <li><a href="javascript:getResult(${subMenu.id })">${subMenu.name}</a>
        </li>
      </c:forEach>
      </ul>
      </li>
    </c:forEach>
    <div style="clear: both;"></div>
  </ul>
