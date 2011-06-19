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

  @Column(name="FACTOR")
  private Integer factor ;

  public Province(){
    super();
  }

  public Province(Integer id, String provinceName,Integer factor) {
    super();
    this.id = id;
    this.provinceName = provinceName;
    this.factor = factor ;
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
  public Integer getFactor() {
    return factor;
  }
  public void setFactor(Integer factor) {
    this.factor = factor;
  }
}
