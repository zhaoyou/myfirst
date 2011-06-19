package com.imd.focusrx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.SecondDirectory;




@Repository
public interface SecondDirectoryRepository extends JpaRepository<SecondDirectory, Long>{

  @Query("from SecondDirectory s where s.directory.id=:directoryId")
  public List<SecondDirectory> getByDirectoryId(@Param("directoryId")Integer directoryId);
}
