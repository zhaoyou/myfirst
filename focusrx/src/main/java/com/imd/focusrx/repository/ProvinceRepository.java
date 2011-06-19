package com.imd.focusrx.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province ,Integer> {

  @Query("from Province p order by p.factor asc ")
  public List<Province> getByOrder();
}
