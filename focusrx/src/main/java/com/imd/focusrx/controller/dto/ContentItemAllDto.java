package com.imd.focusrx.controller.dto;

public class ContentItemAllDto {
  private String content ;
  private String attachment ;
  private String strChild ;



  public ContentItemAllDto(String content, String attachment, String strChild) {
    super();
    this.content = content;
    this.attachment = attachment;
    this.strChild = strChild;
  }
  public ContentItemAllDto(){
    super();
  }

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getAttachment() {
    return attachment;
  }
  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }
  public String getStrChild() {
    return strChild;
  }
  public void setStrChild(String strChild) {
    this.strChild = strChild;
  }



}
