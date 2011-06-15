package com.imd.focusrx.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.Province;

@Repository
public interface ProvinceRepository extends JpaRepository<Province ,Integer> {

}
