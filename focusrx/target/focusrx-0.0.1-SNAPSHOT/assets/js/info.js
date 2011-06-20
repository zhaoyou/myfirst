$(function() {
  loadContentItem();
  $('#directory').bind('change' , directoryChange);
  $('#province').bind('change' , provinceChange);
  $('#contentItem').bind('change' , clicksearch);
  $('#btnsearch').bind('click' , clicksearch);
});

/**
 * click search.
 */
function clicksearch() {
  var p = $('#province option').length;
  var d = $('#directory option').length;
  var i = $('#contentItem option').length;
  if (p < 1 || d < 1 || i < 1) {
    return;
  }
  $.getJSON('getContent', {cid: $('#contentItem').val()},contentShowHandler);
}

/**
 * show data.
 *
 * @param {object} data json contains content.
 */
function contentShowHandler(data) {
  $('#titleshow').show();
  showContent(data.content);
  showAttachment(data.attachment);
  showChildStr(data.strChild);
}
/**
 * show contentname.
 *
 * @param {string} c selftext.
 */
function showContent(c) {
  $('#selfText').html(c);
}

/**
 * show attachment name and link.
 *
 * @param {object} a contains name and link.
 */
function showAttachment(a) {
  var str = '';
  var j = eval('(' + a + ')');
  $(j).each(function(i, link) {
    str = str + '<a href="assets/downloads/' + link.path + '">' +
    link.name + '</a>';
  });
  $('#selfattachment').html(str);
}

function showChildStr(childStr) {
  $('#childcontent').html(childStr);
}

/**
 * change province.
 *
 */
function provinceChange() {
  var d = $('#directory option').length;
  if (d < 1) {
    return;
  }
  getJsonItem($('#province').val(), $('#directory').val());
}

/**
 * change directory
 */
function directoryChange() {
  var p = $('#province option').length;
  if (p < 1) {
    return;
  }
  getJsonItem($('#province').val(), $('#directory').val());
}

/**
 * load contentItem
 */
function loadContentItem() {
  var p = $('#province option').length;
  var d = $('#directory option').length;
  //if no item return
  if (p < 1 || d < 1) {
    return;
  }
  getJsonItem($('#province').val(), $('#directory').val());
}

/**
 *
 * @param {long} pid provinceid.
 * @param {long} did directoryid.
 */
function getJsonItem(pid, did) {
  $('#contentItem').empty();
  $.getJSON('getItem', {'pid': pid, 'did': did},function(data) {
    $(data).each(function(i, d) {
      $('#contentItem')[0].options.add(new Option(d.content, d.id));
    });clicksearch();
  });
}
