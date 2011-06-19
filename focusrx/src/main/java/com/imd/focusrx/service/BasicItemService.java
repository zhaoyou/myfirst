package com.imd.focusrx.service;

import java.util.List;

import com.imd.focusrx.entity.BasicItem;

public interface BasicItemService {
  public List<BasicItem> getBySecond(Long id);
}
