package com.imd.focusrx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.Province;
import com.imd.focusrx.service.BasicItemService;
import com.imd.focusrx.service.DirectoryService;
import com.imd.focusrx.service.ProvinceService;

@Controller
public class ContentItemController3 {

  private final String info3 = "thirdinfo" ;

  @Autowired
  private ProvinceService provinceService ;

  @Autowired
  private DirectoryService directoryService ;

  @Autowired
  private BasicItemService basicItemService ;


  @RequestMapping("/getinfo3")
  public String  getInfo3(Model model){
    //get directory
    List<Directory> directoryList = directoryService.getAll() ;
    model.addAttribute("directoryList", directoryList);

    //get province
    List<Province> provinceList = this.provinceService.getByOrder() ;
    model.addAttribute("provinceList", provinceList);

    return  info3 ;
  }

  @RequestMapping("/getResult")
  @ResponseBody
  public List<Object[]> getResultTable(@RequestParam("id")Long id){
    return basicItemService.getTableInfo(id);
  }
}
