package com.imd.focusrx.service;

import java.util.List;

import com.imd.focusrx.entity.Directory;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
public interface DirectoryService {

  /**
   * get all directory
   * @return
   */
  public List<Directory> getAll() ;

  /**
   * add one directory
   * @param directory
   * @return
   */
  public Directory add(Directory directory) ;
}
