package com.imd.focusrx.service;

import java.util.List;

import com.imd.focusrx.entity.ContentItem;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
public interface ContentItemService {
  /**
   * get all child contentIten by parentId
   * @param itemId  itemId
   * @return
   */
  public List<ContentItem> getItemByParentId(Long itemId) ;

  /**
   * add contentItem
   * @param item
   * @return
   */
  public ContentItem add(ContentItem item);

  /**
   * get by
   * @param provinceId
   * @param directoryId
   * @return
   */
  public List<ContentItem> getByProvinceAndDirectory(Integer provinceId,Integer directoryId) ;

  /**
   * get by id
   * @param id
   * @return
   */
  public ContentItem getById(Long id);

  /**
   * contentItem to String
   * @return
   */
  public String ContentItemToString(Long itemId,List<ContentItem> list) ;

}
