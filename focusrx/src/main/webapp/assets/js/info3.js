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
    innerhtml +='<span class="second_item"><a href="javascript:getResult(\''+
    e.id+'\');" >'+e.name+'</a></span>' ;
    //alert(e.id+" name: "+e.name);
    });
  //alert(innerhtml);
 
  $('.second_directory').html(innerhtml);
  $('#result_table').empty();
  }

function getResult(id){
  if(id==''){
    return ;
  }
  $.getJSON('getResult',{'id':id},resultHandler);
}

function resultHandler(data){
  var str = '' ;
  var columnNum = 0 ;
  if(data!=null){
    $(data).each(function(i,e){
      var rowstr = '';
      columnNum = e.length ;
      if (i == 0) {
        rowstr += '<tr>' ;
        for(var j=0;j<e.length;j++){
          rowstr +="<th>"+e[j]+"</th>";
        }
        rowstr +='</tr>';
      }else {
        rowstr += '<tr>' ;
        for(var j=0;j<e.length;j++){
          //j=0 td is province
          if(j==0){
            rowstr +="<td class='table_privince'>"+e[j]+"</td>";
          }else{
            //if e.length <=3 the width should be more long
            if (e.length <= 4) {
              rowstr +="<td class='table_content_long'>"+e[j]+"</td>";
            }else{
              rowstr +="<td class='table_content'>"+e[j]+"</td>";
            }
            
          }
         
        }
        rowstr +='</tr>';
      }
      str +=rowstr ;
      // show tr under-text line 
      if(columnNum!=0 && columnNum!=1)
        str +="<tr><td colspan='"+columnNum+"'><hr/></td></tr>" ;
    });
    $()
  }
  $('#result_table').empty();
  $('#result_table').html(str);
}

