package com.imd.focusrx.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imd.focusrx.entity.ContentItem;
import com.imd.focusrx.repository.ContentItemRepository;
import com.imd.focusrx.service.ContentItemService;

@Service
@Transactional(readOnly=false)
public class ContentItemServiceImpl implements ContentItemService {

  @Autowired
  private ContentItemRepository contentItemRepository ;

  private final Logger logger = LoggerFactory.getLogger(ContentItemServiceImpl.class);

  public List<ContentItem> getItemByParentId(Long itemId) {
    return getChild(itemId);
  }

  protected List<ContentItem> getChild(Long itemId){
    List<ContentItem> list = contentItemRepository.findByParentId(itemId);
    logger.debug("itemId:  "+itemId + " list.size():"+list.size());
    if(list==null || list.size()==0){
      return list;
    }
    List<ContentItem> resultList = new ArrayList<ContentItem>();

    resultList.addAll(list);
    for (ContentItem contentItem : list) {
      List<ContentItem> l = getChild(contentItem.getId()) ;
      if(l!=null && l.size()>0)
        resultList.addAll(l);
    }
    logger.debug("resultList: size() "+resultList.size());
    return resultList ;
  }

  public ContentItem add(ContentItem item) {
    if(item==null){
      return null ;
    }
    return contentItemRepository.save(item);
  }

  public List<ContentItem> getByProvinceAndDirectory(Integer provinceId,
      Integer directoryId) {
    if(provinceId==null || directoryId==null){
      return null ;
    }
    return contentItemRepository.findByProvinceAndDirectory(provinceId, directoryId);
  }

  public ContentItem getById(Long id) {
    if(id==null){
      return null ;
    }
    return contentItemRepository.findById(id);
  }

  public String ContentItemToString(Long itemId ,List<ContentItem> list){
    StringBuffer sb = new StringBuffer() ;
    sb.append("<ul>");
    sb.append(getChildStr(1l, itemId, list));
    sb.append("</ul>");
    return sb.toString() ;
  }

  protected String getChildStr(Long first,Long itemId ,List<ContentItem> list){
    StringBuffer sb = new StringBuffer("") ;
    for (ContentItem contentItem : list) {
      if(contentItem.getParentId().equals(itemId)){
        if(first==1l){
          sb.append("<li class='pli'>");

          String remark = (contentItem.getRemark()==null||"".equals(contentItem.getRemark()))
          ?"":"("+contentItem.getRemark()+")";
          String content =(contentItem.getContent()==null || "".equals(contentItem.getContent()))
          ?"":contentItem.getContent() ;

          sb.append("<span class='ptitle'>"+contentItem.getName()+remark+"</span>");
          sb.append("<div class='pcontent'>"+content+"</div>");

          String str = getChildStr(0l, contentItem.getId(), list);
          if(!"".equals(str)){
            sb.append("<ul>");
            sb.append(str);
            sb.append("</ul>");
          }
          sb.append("</li>");
        }else{
          String remark = (contentItem.getRemark()==null||"".equals(contentItem.getRemark()))
          ?"":"("+contentItem.getRemark()+")";
          String content =(contentItem.getContent()==null || "".equals(contentItem.getContent()))
          ?"":contentItem.getContent() ;

          sb.append("<li class='cli'>");
          sb.append("<span class='ctitle'>"+contentItem.getName()+remark+"</span>");
          sb.append("<div class='ccontent'>"+content+"</div>");
          String str = getChildStr(0l, contentItem.getId(), list);
          if(!"".equals(str)){
            sb.append("<ul>");
            sb.append(str);
            sb.append("</ul>");
          }
          sb.append("</li>");
        }
      }
    }
    return sb.toString() ;
  }

}
