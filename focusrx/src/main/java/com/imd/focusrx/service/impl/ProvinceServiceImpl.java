package com.imd.focusrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imd.focusrx.entity.Province;
import com.imd.focusrx.repository.ProvinceRepository;
import com.imd.focusrx.service.ProvinceService;

@Service
@Transactional(readOnly=false)
public class ProvinceServiceImpl implements ProvinceService {

  @Autowired
  private ProvinceRepository provinceRepository ;

  public List<Province> getAll() {
    return provinceRepository.findAll() ;
  }

  public Province add(Province province) {
    if(province==null){
      return null ;
    }
    return provinceRepository.save(province);
  }

}
