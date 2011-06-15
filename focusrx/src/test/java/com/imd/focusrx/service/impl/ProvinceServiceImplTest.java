package com.imd.focusrx.service.impl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.imd.focusrx.entity.Province;
import com.imd.focusrx.service.ProvinceService;


public class ProvinceServiceImplTest extends BaseTest{

  @Autowired
  private ProvinceService provinceService ;

  @Test
  @Rollback(false)
  public void testAdd(){
    Province p = new Province() ;
    p.setProvinceName("江苏省");

    Province p2 =new Province() ;
    p2.setProvinceName("四川省");

    Assert.assertNotNull(this.provinceService.add(p).getId());
    Assert.assertNotNull(this.provinceService.add(p2).getId());
  }


  @Test
  @Rollback(false)
  public void testGetAll(){
    List<Province> list = provinceService.getAll() ;
    Assert.assertNotNull(list);
    logger.debug("all List: "+list.size());
  }
}
