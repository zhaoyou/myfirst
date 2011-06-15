package com.imd.focusrx.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import junit.framework.Assert;

import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.service.DirectoryService;

public class DirectoryServiceImplTest extends BaseTest{

  @Autowired
  private DirectoryService directoryService ;

  @Test
  @Rollback(false)
  public void testAdd(){

    Directory d= new Directory() ;
    d.setDirectoryName("目录部分");

    Directory d2= new Directory() ;
    d2.setDirectoryName("实施范围");

    Directory d3= new Directory() ;
    d3.setDirectoryName("招标采购");

    Directory d4= new Directory() ;
    d4.setDirectoryName("药物使用");

    Directory d5= new Directory() ;
    d5.setDirectoryName("零差率以及补偿机制");

    Directory d6= new Directory() ;
    d6.setDirectoryName("支付方式");

    Assert.assertNotNull(this.directoryService.add(d).getId());
    Assert.assertNotNull(this.directoryService.add(d2).getId());
    Assert.assertNotNull(this.directoryService.add(d3).getId());
    Assert.assertNotNull(this.directoryService.add(d4).getId());
    Assert.assertNotNull(this.directoryService.add(d5).getId());
    Assert.assertNotNull(this.directoryService.add(d6).getId());
  }

  public void testGetAll(){
    List<Directory> list = this.directoryService.getAll() ;
    Assert.assertNotNull(list);
    logger.debug("getAll size: "+list.size());
  }

}
