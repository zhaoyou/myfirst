package com.imd.focusrx.service;

import java.util.List;

import com.imd.focusrx.entity.Province;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
public interface ProvinceService {

  /**
   * get all province
   * @return
   */
  public List<Province> getAll();

  /**
   * add province
   * @param province
   * @return
   */
  public Province add(Province province);

  public List<Province> getByOrder();
}
