package com.imd.focusrx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.Directory;

@Repository
public interface DirectoryRepository extends JpaRepository<Directory , Integer>{

}
