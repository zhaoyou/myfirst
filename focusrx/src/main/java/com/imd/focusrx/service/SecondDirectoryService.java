package com.imd.focusrx.service;

import java.util.List;

import com.imd.focusrx.entity.SecondDirectory;


public interface SecondDirectoryService {
  public List<SecondDirectory> getByDirectoryId(Integer directoryId);

  public List<SecondDirectory> getAll();
}
