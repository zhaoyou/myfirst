package com.imd.focusrx.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring-service.xml")
@Transactional
public class BaseTest {

  protected final Logger logger = LoggerFactory.getLogger(BaseTest.class);

  @Test
  @Rollback(false)
  public void init(){
  }

}
