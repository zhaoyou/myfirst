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
@Table(name="PROVINCE")
public class Province {

  @Id
  @Column(name="PROVINCE_ID")
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id ;

  @Column(name="PROVINCE_NAME")
  private String provinceName ;

  public Province(){
    super();
  }

  public Province(Integer id, String provinceName) {
    super();
    this.id = id;
    this.provinceName = provinceName;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getProvinceName() {
    return provinceName;
  }
  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }
}
