package com.imd.focusrx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.imd.focusrx.entity.ContentItem;

@Repository
public interface ContentItemRepository extends JpaRepository<ContentItem, Long> {

  @Query("from ContentItem item where item.parentId=:pid")
  public List<ContentItem> findByParentId(@Param("pid")Long parentId);

  @Query("from ContentItem item where item.parentId=0 and item.province.id=:pid and " +
  "item.directory.id=:did")
  public List<ContentItem> findByProvinceAndDirectory(@Param("pid")Integer provinceId,
      @Param("did")Integer directoryId);

  @Query("from ContentItem c where c.basicItem.id=:basicId and c.parentId=0")
  public List<ContentItem> findByBasic(@Param("basicId")Long id);

  @Query("from ContentItem c where c.basicItem.id=:basicId and c.parentId=0 order by c.province.id")
  public List<ContentItem> findByBasicOrderPrivince(@Param("basicId")Long id);

}
