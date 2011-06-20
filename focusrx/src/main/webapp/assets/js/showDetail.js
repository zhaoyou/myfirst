function $() {
  return document.getElementById ? document.getElementById(arguments[0])
      : eval(arguments[0]);
}
var OverH, OverW, ChangeDesc, ChangeH = 50, ChangeW = 50;
function OpenDiv(_Dw, _Dh, _Desc) {
  $("showDetail").innerHTML = "Loading...";
  OverH = _Dh;
  OverW = _Dw;
  ChangeDesc = _Desc;
  $("showDetail").style.display = '';
  if (_Dw > _Dh) {
    ChangeH = Math.ceil((_Dh - 10) / ((_Dw - 10) / 50));
  } else if (_Dw < _Dh) {
    ChangeW = Math.ceil((_Dw - 10) / ((_Dh - 10) / 50));
  }
  $("showDetail").style.top = (document.documentElement.clientHeight - 10) / 2
      + "px";
  $("showDetail").style.left = (document.documentElement.clientWidth - 10) / 2
      + "px";
  OpenNow();
}
var Nw = 10, Nh = 10;
function OpenNow() {
  if (Nw > OverW - ChangeW)
    ChangeW = 2;
  if (Nh > OverH - ChangeH)
    ChangeH = 2;
  Nw = Nw + ChangeW;
  Nh = Nh + ChangeH;
  if (OverW > Nw || OverH > Nh) {
    if (OverW > Nw) {
      $("showDetail").style.width = Nw + "px";
      $("showDetail").style.left = (document.documentElement.clientWidth - Nw)
          / 2 + "px";
    }// 欢迎来到站长特效网，我们的网址是www.zzjs.net，很好记，zz站长，js就是js特效，本站收集大量高质量js代码，还有许多广告代码r下载。
    if (OverH > Nh) {
      $("showDetail").style.height = Nh + "px";
      $("showDetail").style.top = (document.documentElement.clientHeight - Nh)
          / 2 + "px";
    }
    window.setTimeout("OpenNow()", 10);
  } else {
    Nw = 10;
    Nh = 10;
    ChangeH = 50;
    ChangeW = 50;
    AjaxGet(ChangeDesc);
  }
}
// 创建XML对象
function createXMLHttps() {
  var ret = null;
  try {
    ret = new ActiveXObject('Msxml2.XMLHTTP');
  } catch (e) {
    try {
      ret = new ActiveXObject('Microsoft.XMLHTTP');
    } catch (ee) {
      ret = null;
    }
  }
  if (!ret && typeof XMLHttpRequest != 'undefined')
    ret = new XMLHttpRequest();
  return ret;
}
function AjaxGet(URL) {
  var xmlhttp = createXMLHttps();
  xmlhttp.open("Get", URL, true);
  xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
  xmlhttp.onreadystatechange = function() {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 404) {
      $("showDetail").innerHTML = '读取页面失败，文件' + URL + '不存在！';
      return;
    }
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
      $("showDetail").innerHTML = "<div class='LoadContent'>"
          + xmlhttp.responseText + "</div>";
    }
  }
  xmlhttp.send(null);
}