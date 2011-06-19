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
 * second directory info.
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */

@Entity
@Table(name="SECOND_DIRECTORY")
public class SecondDirectory {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID")
  private Long id ;

  @Column(name="NAME")
  private String name ;

  @Column(name="CONTENT")
  private String content ;

  @ManyToOne
  @JoinColumn(name="DIRECTORY")
  private Directory directory ;

  @Column(name="FACTOR")
  private Integer factor ;

  public SecondDirectory(){
    super();
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
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Directory getDirectory() {
    return directory;
  }
  public void setDirectory(Directory directory) {
    this.directory = directory;
  }
  public Integer getFactor() {
    return factor;
  }
  public void setFactor(Integer factor) {
    this.factor = factor;
  }
}
