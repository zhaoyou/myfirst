package com.imd.focusrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imd.focusrx.entity.SecondDirectory;
import com.imd.focusrx.repository.SecondDirectoryRepository;
import com.imd.focusrx.service.SecondDirectoryService;

@Service
public class SecondDirectoryServiceImpl implements SecondDirectoryService {

  @Autowired
  private SecondDirectoryRepository secondDirectoryRepository;

  @Override
  public List<SecondDirectory> getByDirectoryId(Integer directoryId) {

    if(directoryId==null){
      return null ;
    }
    return secondDirectoryRepository.getByDirectoryId(directoryId);
  }

  @Override
  public List<SecondDirectory> getAll() {
    return secondDirectoryRepository.findAll() ;
  }

}
