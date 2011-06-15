package com.imd.focusrx.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author you.zhao@i-md.com (zhaoyou)
 *
 */
@Entity
@Table(name="CONTNETITEM")
public class ContentItem {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="CONTENTITEM_ID")
  private Long id ;

  @ManyToOne
  @JoinColumn(name="PROVINCE")
  private Province province ;

  @ManyToOne
  @JoinColumn(name="DIRECTORY")
  private Directory directory ;

  @Column(name="NAME")
  private String name ;

  @Column(name="REMARK")
  private String remark ;

  @Column(name="CONTENT")
  private String content ;

  @Column(name="PARENTID")
  private Long parentId ;

  @OneToMany
  private  List<Attachment> attachments = new ArrayList<Attachment>() ;

  public ContentItem() {
    super();
  }

  public ContentItem(Long id,
      String content, Long parentId, List<Attachment> attachments) {
    super();
    this.id = id;
    this.content = content;
    this.parentId = parentId;
    this.attachments = attachments;
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
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }
  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
  }

  public Directory getDirectory() {
    return directory;
  }

  public void setDirectory(Directory directory) {
    this.directory = directory;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
