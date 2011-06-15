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
@Table(name="ATTACHMENT")
public class Attachment {
  @Id
  @Column(name="ATTACHMENT_ID")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id ;

  @Column(name="ATTACHMENT_NAME")
  private String name ;

  @Column(name="ATTACHMENT_PATH")
  private String path ;

  public Attachment(){
    super();
  }

  public Attachment(Integer id, String name, String path) {
    super();
    this.id = id;
    this.name = name;
    this.path = path;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }
}
