package com.imd.focusrx.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.imd.focusrx.entity.ContentItem;
import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.Province;
import com.imd.focusrx.entity.SecondDirectory;
import com.imd.focusrx.service.BasicItemService;
import com.imd.focusrx.service.ContentItemService;
import com.imd.focusrx.service.DirectoryService;
import com.imd.focusrx.service.ProvinceService;

@Controller
public class ContentItemController3 {

  private final String info3 = "thirdinfo" ;

  private final String SHOWDETAIL = "showdetail";

  @Autowired
  private ProvinceService provinceService ;

  @Autowired
  private DirectoryService directoryService ;

  @Autowired
  private BasicItemService basicItemService ;

  @Autowired
  private ContentItemService contentItemService ;

  private final Logger logger = LoggerFactory.getLogger(ContentItemController3.class);


  @RequestMapping("/getinfo3")
  public String  getInfo3(Model model){
    //get directory
    List<Directory> directoryList = directoryService.getAll() ;
    model.addAttribute("directoryList", directoryList);

    //get province
    List<Province> provinceList = this.provinceService.getByOrder() ;
    model.addAttribute("provinceList", provinceList);

    TreeMap<Directory, List<SecondDirectory>> map = this.directoryService.getMenu() ;
    model.addAttribute("menu", map);

    return  info3 ;
  }

  @RequestMapping("/getResult")
  @ResponseBody
  public List<Object[]> getResultTable(@RequestParam("id")Long id){
    return basicItemService.getTableInfo(id);
  }

  @RequestMapping("/getContentItem")
  public String getContentItem(@RequestParam("id")Long id,Model model){
    List<ContentItem> childs = this.contentItemService.getByParentId(id);
    ContentItem item = this.contentItemService.getById(id);
    model.addAttribute("contentItemList",childs);
    model.addAttribute("item", item);
    return this.SHOWDETAIL;
  }

}
