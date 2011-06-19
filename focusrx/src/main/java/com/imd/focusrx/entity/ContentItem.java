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
  @JoinColumn(name="BASICITEM")
  private BasicItem basicItem ;

  @Column(name="NAME")
  private String name ;

  @Column(name="REMARK")
  private String remark ;

  @Column(name="CONTENT")
  private String content ;

  @Column(name="PARENTID")
  private Long parentId ;

  @Column(name="isShowDetail")
  private Integer isShowDetail ;

  //  @OneToMany
  //  private  List<Attachment> attachments = new ArrayList<Attachment>() ;

  public ContentItem() {
    super();
  }

  public ContentItem(Long id,
      String content, Long parentId) {
    super();
    this.id = id;
    this.content = content;
    this.parentId = parentId;
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

  public Province getProvince() {
    return province;
  }

  public void setProvince(Province province) {
    this.province = province;
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

  public BasicItem getBasicItem() {
    return basicItem;
  }

  public void setBasicItem(BasicItem basicItem) {
    this.basicItem = basicItem;
  }

  public Integer getIsShowDetail() {
    return isShowDetail;
  }

  public void setIsShowDetail(Integer isShowDetail) {
    this.isShowDetail = isShowDetail;
  }

}
