package com.imd.focusrx.controller.dto;

public class BriefDto {
  private Long id ;
  private Integer pid ;
  private String name ;
  private Integer isShow ;

  public Integer getPid() {
    return pid;
  }
  public void setPid(Integer pid) {
    this.pid = pid;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getIsShow() {
    return isShow;
  }
  public void setIsShow(Integer isShow) {
    this.isShow = isShow;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
}
