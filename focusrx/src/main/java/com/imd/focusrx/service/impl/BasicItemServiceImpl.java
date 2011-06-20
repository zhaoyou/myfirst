package com.imd.focusrx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imd.focusrx.entity.BasicItem;
import com.imd.focusrx.entity.ContentItem;
import com.imd.focusrx.entity.Province;
import com.imd.focusrx.repository.BasicItemRepository;
import com.imd.focusrx.repository.ContentItemRepository;
import com.imd.focusrx.repository.ProvinceRepository;
import com.imd.focusrx.service.BasicItemService;
import com.imd.focusrx.service.ContentItemService;

@Service
public class BasicItemServiceImpl implements BasicItemService {

  @Autowired
  private BasicItemRepository basicItemRepository ;

  @Autowired
  private ProvinceRepository provinceRepository ;

  @Autowired
  private ContentItemRepository contentItemRepository ;

  @Override
  public List<BasicItem> getBySecond(Long id) {
    return basicItemRepository.getBySecondDirectory(id);
  }

  @Override
  public List<Object[]> getTableInfo(Long id) {
    if(id==null){
      return null ;
    }

    //get column title
    List<BasicItem> basicList = basicItemRepository.getBySecondDirectory(id);

    //get privince
    List<Province> provinceList = provinceRepository.getByOrder() ;

    //define variable save result (contains column title)
    Object[] obj = new Object[basicList.size()+1];

    List<Object[]> resultList = new ArrayList<Object[]>();

    int th_column_index = 0 ;
    obj[th_column_index++] = "" ;

    //get each column each privince data.
    List<List<ContentItem>> allContentItemList = new ArrayList<List<ContentItem>>() ;
    for (BasicItem basicItem : basicList) {

      obj[th_column_index++] = basicItem.getName() ;
      allContentItemList.add(contentItemRepository.findByBasic(basicItem.getId()));
    }

    //add th title.
    resultList.add(obj);

    int provinceLength= provinceList.size();

    for (int i = 0; i < provinceLength;i++) {
      Object[] objloop = new Object[basicList.size()+1];
      int td_column_index = 0 ;
      objloop[td_column_index++] = provinceList.get(i).getProvinceName() ;
      for (List<ContentItem> list : allContentItemList) {

        //do handler show tip or text
        if(list.get(i).getIsShowDetail().equals(1)){
          String s = "<a  href=\"getContentItem?id="+list.get(i).getId()+"\">"+
          list.get(i).getContent()+"</a>";
          objloop[td_column_index++] = s ;
        }else{
          String content = list.get(i).getContent();

          if(content.length()<=15){
            objloop[td_column_index++] = content ;
          }else{
            String tip = "<span title='"+content+"'>"+content.substring(0, 15)+ "...."+"</span>" ;
            objloop[td_column_index++] = tip;
          }
        }
      }
      resultList.add(objloop);
    }


    return resultList;
  }

}
