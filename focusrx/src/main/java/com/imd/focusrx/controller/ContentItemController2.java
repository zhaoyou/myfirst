package com.imd.focusrx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imd.focusrx.controller.dto.BriefDto;
import com.imd.focusrx.entity.BasicItem;
import com.imd.focusrx.entity.ContentItem;
import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.Province;
import com.imd.focusrx.entity.SecondDirectory;
import com.imd.focusrx.service.BasicItemService;
import com.imd.focusrx.service.ContentItemService;
import com.imd.focusrx.service.DirectoryService;
import com.imd.focusrx.service.ProvinceService;
import com.imd.focusrx.service.SecondDirectoryService;

@Controller
public class ContentItemController2 {

  @Autowired
  private ProvinceService provinceService ;

  @Autowired
  private DirectoryService directoryService ;

  @Autowired
  private SecondDirectoryService secondDirectoryService ;

  @Autowired
  private BasicItemService basicItemService ;

  @Autowired
  private ContentItemService contentItemService ;


  private final String info2 = "secondinfo" ;



  @RequestMapping("getinfo2")
  public String getInfo2(Model model){

    //get directory
    List<Directory> directoryList = directoryService.getAll() ;
    model.addAttribute("directoryList", directoryList);

    //get province
    List<Province> provinceList = this.provinceService.getByOrder() ;
    model.addAttribute("provinceList", provinceList);

    return info2 ;
  }

  @RequestMapping("getSecond")
  @ResponseBody
  public List<SecondDirectory> getSecondDirectory(@RequestParam("id") Integer id){
    if("".equals(id)){
      return null ;
    }
    return secondDirectoryService.getByDirectoryId(id);
  }

  @RequestMapping("getBasicItem")
  @ResponseBody
  public List<BasicItem> getBasicItem(@RequestParam("id") Long id){
    if("".equals(id)){
      return null ;
    }
    return basicItemService.getBySecond(id);
  }

  @RequestMapping("getlistInfo")
  @ResponseBody
  public List<BriefDto> getContent(@RequestParam("basicId") Long id){
    return contentItemService.getByBasicId(id) ;
  }

  @RequestMapping("getChild")
  @ResponseBody
  public List<ContentItem> getChild(@RequestParam("pid") Long id){
    return contentItemService.getByParentId(id);
  }
}
