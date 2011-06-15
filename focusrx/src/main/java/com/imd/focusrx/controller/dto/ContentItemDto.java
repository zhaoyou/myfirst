package com.imd.focusrx.controller.dto;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
public class ContentItemDto {
  private Long id ;
  private String content ;

  public  ContentItemDto(){
    super();
  }

  public ContentItemDto(Long id, String content) {
    super();
    this.id = id;
    this.content = content;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
}
