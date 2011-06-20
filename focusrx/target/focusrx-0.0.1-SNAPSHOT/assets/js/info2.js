/**
 * info2.jsp
 */

$(document).ready(function(){
  $('#directory').bind('change',directoryChange);
  directoryChange() ;
});


function directoryChange(){
  var did = $('#directory').val();
  if(did==''){
    return ;
  }
  $.getJSON('getSecond',{'id':did},directoryHandler);
}

function directoryHandler(data){
  if(data==null || data==""){
    alert("not find second directory!");
    return ;
  }
  var innerhtml = '';
  $(data).each(function(i,e){
    innerhtml +='<span class="second_item"><a href="javascript:clickSecond(\''+
    e.id+'\');" >'+e.name+'</a></span>' ;
    //alert(e.id+" name: "+e.name);
    });
  //alert(innerhtml);
  $('.second_directory').empty();
  $('.column_class').empty();
  cleanerChild();
  $('.second_directory').html(innerhtml);
  
  }

function clickSecond(id){
  if(id==''){
    return ;
  }
  $.getJSON('getBasicItem',{'id':id},basicHandler);
}

function basicHandler(data){
  var innerHtml = ""
    
    $(data).each(function(i,e){
      innerHtml +=' <span class="column_item"><a href="javascript:getContent(\''+e.id+'\')">'+e.name+'</a></span>';
    });
  
  $('.column_class').empty();
  cleanerChild();
  $('.column_class').html(innerHtml);
}

function getContent(basicId){
  if(basicId==''){
    return  ;
  }
  $.getJSON('getlistInfo',{'basicId':basicId},ContentHandler);
}


function ContentHandler(data){
  
  if(data!=null){
    $(data).each(function(i,e){
      var s = '';
      if(e.isShow==1){
         s = '<span id="div_detail_title_'+e.id+'" style="cursor: pointer;" onclick="getChild(\''+e.id+'\')">'+e.name+'</span>';
         s +='<div id="div_detail_'+e.id+'"></div>' ;
      }else{
         s = e.name ;
      }
     
     $('#province_'+e.pid).html(s);
    });
  }
}

function cleanerChild(){
  $('.childContent').empty();
}


function getChild(pid){
  if(pid==''){
    return ;
  }
  $.getJSON('getChild',{'pid':pid},childHandler);
}

function childHandler(data){
  if(data!=null){
    var str = '';
    var pid = '' ;
    $(data).each(function(i,e){
      pid = e.parentId ;
      str += "<b>"+e.name+"</b> : "+e.content + "\<br>";
    });
    $("#div_detail_"+pid).html(str);
    $('#div_detail_title_'+pid).empty();
  //  alert(str);
  }
}
