package com.imd.focusrx.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imd.focusrx.entity.Directory;
import com.imd.focusrx.entity.SecondDirectory;
import com.imd.focusrx.repository.DirectoryRepository;
import com.imd.focusrx.repository.SecondDirectoryRepository;
import com.imd.focusrx.service.DirectoryService;

@Service
@Transactional(readOnly=false)
public class DirectoryServiceImpl implements DirectoryService {

  @Autowired
  private DirectoryRepository directoryRepository ;

  @Autowired
  private SecondDirectoryRepository secondDirectoryRepository ;

  @Override
  public List<Directory> getAll() {
    return directoryRepository.findAll() ;
  }

  @Override
  public Directory add(Directory directory) {
    if(directory==null){
      return null ;
    }
    return directoryRepository.save(directory);
  }

  @Override
  public TreeMap<Directory, List<SecondDirectory>> getMenu() {
    List<Directory> directoryList = directoryRepository.findAll() ;
    TreeMap<Directory,List<SecondDirectory>> map = new TreeMap<Directory, List<SecondDirectory>>();

    for (Directory directory : directoryList) {
      List<SecondDirectory> list = secondDirectoryRepository.getByDirectoryId(directory.getId());
      map.put(directory, list);
    }

    return map;
  }

}
