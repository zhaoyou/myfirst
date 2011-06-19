package com.imd.focusrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imd.focusrx.entity.BasicItem;
import com.imd.focusrx.repository.BasicItemRepository;
import com.imd.focusrx.service.BasicItemService;

@Service
public class BasicItemServiceImpl implements BasicItemService {

  @Autowired
  private BasicItemRepository basicItemRepository ;

  @Override
  public List<BasicItem> getBySecond(Long id) {
    return basicItemRepository.getBySecondDirectory(id);
  }

}
