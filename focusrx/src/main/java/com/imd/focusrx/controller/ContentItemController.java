// Copyright 2011 i-MD. All rights reserved.

package com.imd.focusrx.controller;

import java.util.ArrayList;
import java.util.List;

import com.imd.focusrx.controller.dto.ContentItemAllDto;
import com.imd.focusrx.controller.dto.ContentItemDto;
import com.imd.focusrx.entity.ContentItem;
import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.Province;
import com.imd.focusrx.service.ContentItemService;
import com.imd.focusrx.service.DirectoryService;
import com.imd.focusrx.service.ProvinceService;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
@Controller
public class ContentItemController {

  @Autowired
  private ContentItemService contentItemService ;

  @Autowired
  private ProvinceService provinceService ;

  @Autowired
  private DirectoryService directoryService ;

  private final Logger logger = LoggerFactory.getLogger(ContentItemController.class);

  @RequestMapping("/getInfo")
  public String getInfo(Model model){

    List<Province> provinceList = provinceService.getAll() ;

    List<Directory> directoryList = directoryService.getAll() ;

    model.addAttribute("provinceList", provinceList);

    model.addAttribute("directoryList", directoryList);

    return "info" ;
  }

  @RequestMapping("getItem")
  @ResponseBody
  public List<ContentItemDto> getItem(
      @RequestParam("pid")Integer pid,
      @RequestParam("did")Integer did){
    List<ContentItem> list = contentItemService.getByProvinceAndDirectory(pid, did);
    List<ContentItemDto> dtoList = new ArrayList<ContentItemDto>();
    for (ContentItem contentItem : list) {
      dtoList.add(new ContentItemDto(contentItem.getId(),contentItem.getName()));
    }
    return dtoList ;
  }

  @RequestMapping("getContent")
  @ResponseBody
  public ContentItemAllDto getContent(
      @RequestParam("cid")Long cid){
    ContentItem c = this.contentItemService.getById(cid);
    String attachment = new Gson().toJson(c.getAttachments());
    String content = c.getContent() ;
    List<ContentItem> list = this.contentItemService.getItemByParentId(cid);
    String str =this.contentItemService.ContentItemToString(cid, list);


    ContentItemAllDto dto = new ContentItemAllDto() ;
    dto.setAttachment(attachment);
    dto.setContent(content);
    dto.setStrChild(str);

    return dto ;
  }
}
