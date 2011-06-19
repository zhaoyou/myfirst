package com.imd.focusrx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
@Entity
@Table(name="DIRECTORY")
public class Directory {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="DIRECTORY_ID")
  public Integer id ;

  @Column(name="DIRECTORY_NAME")
  public String directoryName ;

  @Column(name="FACTOR")
  public String factor ;

  public Directory() {
    super();
  }

  public Directory(Integer id, String directoryName) {
    super();
    this.id = id;
    this.directoryName = directoryName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDirectoryName() {
    return directoryName;
  }

  public void setDirectoryName(String directoryName) {
    this.directoryName = directoryName;
  }

  public String getFactor() {
    return factor;
  }

  public void setFactor(String factor) {
    this.factor = factor;
  }


}
