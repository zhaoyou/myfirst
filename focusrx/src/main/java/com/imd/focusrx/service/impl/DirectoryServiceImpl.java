package com.imd.focusrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.repository.DirectoryRepository;
import com.imd.focusrx.service.DirectoryService;

@Service
@Transactional(readOnly=false)
public class DirectoryServiceImpl implements DirectoryService {

  @Autowired
  private DirectoryRepository directoryRepository ;

  public List<Directory> getAll() {
    return directoryRepository.findAll() ;
  }

  public Directory add(Directory directory) {
    if(directory==null){
      return null ;
    }
    return directoryRepository.save(directory);
  }

}
