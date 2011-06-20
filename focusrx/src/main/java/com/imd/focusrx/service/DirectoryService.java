package com.imd.focusrx.service;

import java.util.List;
import java.util.TreeMap;

import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.SecondDirectory;

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

  public TreeMap<Directory, List<SecondDirectory>> getMenu();
}
