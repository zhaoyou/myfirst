package com.imd.focusrx.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import com.imd.focusrx.service.BasicItemService;

public class BasicItemServiceImplTest extends BaseTest {

  @Autowired
  private BasicItemService basicItemService ;

  @Test
  @Rollback(false)
  public void testGetAllInfo(){
    List<Object[]> list = basicItemService.getTableInfo(1l);
    for (Object[] objects : list) {
      for (Object object : objects) {
        System.out.print(object + "\t");
      }
      System.out.println("");
    }
  }
}
