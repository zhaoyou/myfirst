package com.imd.focusrx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
@Entity
@Table(name="BASIC_ITEM")
public class BasicItem {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID")
  private Long id ;

  @Column(name="NAME")
  private String  name ;
  @Column(name="BRIEF_NAME")
  private String briefName ;

  @Column(name="FACTOR")
  private Integer factor ;

  @ManyToOne
  @JoinColumn(name="SECOND_DIRECTORY")
  private SecondDirectory secondDirectory ;

  public BasicItem(){
    super();
  }


  public BasicItem(Long id, String name, String briefName, Integer factor,
      SecondDirectory secondDirectory) {
    super();
    this.id = id;
    this.name = name;
    this.briefName = briefName;
    this.factor = factor;
    this.secondDirectory = secondDirectory;
  }


  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getBriefName() {
    return briefName;
  }
  public void setBriefName(String briefName) {
    this.briefName = briefName;
  }
  public Integer getFactor() {
    return factor;
  }
  public void setFactor(Integer factor) {
    this.factor = factor;
  }
  public SecondDirectory getSecondDirectory() {
    return secondDirectory;
  }
  public void setSecondDirectory(SecondDirectory secondDirectory) {
    this.secondDirectory = secondDirectory;
  }
}
