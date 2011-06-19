package com.imd.focusrx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.BasicItem;


@Repository
public interface BasicItemRepository extends JpaRepository<BasicItem, Long> {

  @Query("from BasicItem b where b.secondDirectory.id = :id")
  public List<BasicItem> getBySecondDirectory(@Param("id")Long id);

}
