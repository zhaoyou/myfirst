//package com.imd.focusrx.service.impl;
//
//import java.util.List;
//
//import junit.framework.Assert;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//
//import com.imd.focusrx.entity.Attachment;
//import com.imd.focusrx.entity.ContentItem;
//import com.imd.focusrx.entity.Directory;
//import com.imd.focusrx.entity.Province;
//import com.imd.focusrx.service.AttachmentService;
//import com.imd.focusrx.service.ContentItemService;
//
//
//public class ContentItemServiceImplTest extends BaseTest{
//
//  @Autowired
//  private ContentItemService contentItemService ;
//
//  @Autowired
//  private AttachmentService attachmentService ;
//
//  @Test
//  @Rollback(false)
//  public void testAddBase(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(1);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("药物目录");
//    contentItem.setRemark("附上各个省市的药物目录");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Attachment a = new Attachment() ;
//    a.setName("药物目录表");
//    a.setPath("11.xls");
//    this.attachmentService.add(a);
//
//    contentItem.getAttachments().add(a);
//
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//
//
//    //one level
//    ContentItem contentItemchild1 = new ContentItem() ;
//    contentItemchild1.setContent("非洛地平（波依定）、特布他林（博利康尼）、普米克（布地奈德）");
//    contentItemchild1.setName("AZ产品");
//    contentItemchild1.setRemark("通用名");
//    contentItemchild1.setDirectory(d);
//    contentItemchild1.setProvince(p);
//    contentItemchild1.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild1).getId());
//
//    ContentItem contentItemchild2 = new ContentItem() ;
//    contentItemchild2.setContent("");
//    contentItemchild2.setName("关注领域");
//    contentItemchild2.setRemark("");
//    contentItemchild2.setDirectory(d);
//    contentItemchild2.setProvince(p);
//    contentItemchild2.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild2).getId());
//
//    // two level
//    //    高血压
//    //    高血脂
//    //    呼吸
//    //    消化道
//
//    ContentItem contentItemchild21 = new ContentItem() ;
//    contentItemchild21.setContent("1，CCB类药物络活喜；波依定都进入药物目录；2，ACEI和ARB类的主要药物，" +
//    "如洛汀新、代文等都进入药物目录");
//    contentItemchild21.setName("高血压");
//    contentItemchild21.setRemark("CCB类：络活喜；波依定以及其他大类，ARB和ACEI");
//    contentItemchild21.setDirectory(d);
//    contentItemchild21.setProvince(p);
//    contentItemchild21.setParentId(contentItemchild2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild21).getId());
//
//    ContentItem contentItemchild22 = new ContentItem() ;
//    contentItemchild22.setContent("阿托伐他汀（立普妥）没有进入目录");
//    contentItemchild22.setName("高血脂");
//    contentItemchild22.setRemark("立普妥");
//    contentItemchild22.setDirectory(d);
//    contentItemchild22.setProvince(p);
//    contentItemchild22.setParentId(contentItemchild2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild22).getId());
//
//    ContentItem contentItemchild23 = new ContentItem() ;
//    contentItemchild23.setContent("平喘药增加三种：特布他林、布地奈德、班布特罗");
//    contentItemchild23.setName("呼吸");
//    contentItemchild23.setRemark("");
//    contentItemchild23.setDirectory(d);
//    contentItemchild23.setProvince(p);
//    contentItemchild23.setParentId(contentItemchild2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild23).getId());
//
//    ContentItem contentItemchild24 = new ContentItem() ;
//    contentItemchild24.setContent("抗酸药及抗溃疡药类增加三类：硫糖铝、大黄碳酸氢钠、西咪替丁");
//    contentItemchild24.setName("消化道");
//    contentItemchild24.setRemark("抗酸药及抗溃疡药类");
//    contentItemchild24.setDirectory(d);
//    contentItemchild24.setProvince(p);
//    contentItemchild24.setParentId(contentItemchild2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild24).getId());
//
//
//
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setName("增补模式");
//    contentItem2.setRemark("307+X（主要）；307+X+Y（福建）；307（江西）；307+0+Y（湖南）；");
//    contentItem2.setContent("307+292");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//    ContentItem contentItem3 = new ContentItem() ;
//    contentItem3.setContent("国家、省基本医疗保险药品目录（甲类）范围内选择，" +
//    "确因少数慢性疾病治疗必需的，也可从目录（乙类）范围内选择 ");
//    contentItem3.setName("增补目录遴选来源");
//    contentItem3.setDirectory(d);
//    contentItem3.setProvince(p);
//    contentItem3.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem3).getId());
//
//
//    ContentItem contentItem4 = new ContentItem() ;
//    contentItem4.setName("增补目录遴选原则");
//    contentItem4.setContent("根据经济社会的发展、医疗保障能力、疾病谱变化、基本医疗卫生服务需求、" +
//    "科学技术进步等情况以及防治必需、安全有效、价格合理、使用方便、中西医并重的原则确定");
//    contentItem4.setDirectory(d);
//    contentItem4.setProvince(p);
//    contentItem4.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem4).getId());
//
//  }
//
//  @Test
//  @Rollback(false)
//  public void testAddTwoLevel(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(2);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("实施意见");
//    contentItem.setRemark("附上各个省市的实施意见");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Attachment a = new Attachment() ;
//    a.setName("实施意见");
//    a.setPath("22.docx");
//    this.attachmentService.add(a);
//
//    contentItem.getAttachments().add(a);
//
//
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setContent("社区卫生中心和乡镇卫生院");
//    contentItem2.setName("计划实施的范围");
//    contentItem2.setRemark("");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//    ContentItem contentItem3 = new ContentItem() ;
//    contentItem3.setContent("试行阶段");
//    contentItem3.setName("实施现状");
//    contentItem3.setRemark("还未开始；试行阶段；全面执行");
//    contentItem3.setDirectory(d);
//    contentItem3.setProvince(p);
//    contentItem3.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem3).getId());
//
//    ContentItem contentItem4 = new ContentItem() ;
//    contentItem4.setContent("2011年全省所有地区政府举办的基层医疗卫生机构全部配备和使用基本药物，并实行零差率销售");
//    contentItem4.setName("实施的时间表和目标");
//    contentItem4.setRemark("");
//    contentItem4.setDirectory(d);
//    contentItem4.setProvince(p);
//    contentItem4.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem4).getId());
//
//  }
//
//  @Test
//  @Rollback(false)
//  public void testAddThird(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(3);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("招标采购的文件");
//    contentItem.setRemark("附上相关文件");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Attachment a = new Attachment() ;
//    a.setName("药物集中采购实施方案");
//    a.setPath("33.docx");
//    this.attachmentService.add(a);
//
//    contentItem.getAttachments().add(a);
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setContent("");
//    contentItem2.setName("文件解读");
//    contentItem2.setRemark("");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//
//    ContentItem contentItemchild21 = new ContentItem() ;
//    contentItemchild21.setContent("省药品集中采购中心作为基本药物采购的责任主体；市、县（市、区）" +
//        "人民政府作为基本药物制度施行的地方责任主体，市、县（市、区）卫生行政部门负责辖区内基本药物采购的监管，" +
//        "组织基层医疗卫生机构在省级药品采购平台上申报采购计划，与省药品采购中心签订委托协议等。" +
//    "基本药物集中采购入围候选品种既是基层医疗卫生机构使用目录，同时也纳入二、三级医疗机构药品采购目录。");
//    contentItemchild21.setName("采购范围");
//    contentItemchild21.setRemark("药物范围；医疗机构范围");
//    contentItemchild21.setDirectory(d);
//    contentItemchild21.setProvince(p);
//    contentItemchild21.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild21).getId());
//
//    ContentItem contentItemchild22 = new ContentItem() ;
//    contentItemchild22.setContent("对用量明确的产品，实行量价同招、带量采购，促使企业进一步降低价格。" +
//        "对无法确定采购数量的药品，采取单一货源承诺方式进行采购，即一种药物（具体到剂型和规格）选择一家企业产品，" +
//    "使该企业获得全省或一定区域内该药物全部市场份额，供货区域内的所有政府办基层医疗卫生机构都由这家企业供应该药物");
//    contentItemchild22.setName("采购方式");
//    contentItemchild22.setRemark("");
//    contentItemchild22.setDirectory(d);
//    contentItemchild22.setProvince(p);
//    contentItemchild22.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild22).getId());
//
//    ContentItem contentItemchild23 = new ContentItem() ;
//    contentItemchild23.setContent("按照质量优先、价格合理原则");
//    contentItemchild23.setName("采购原则");
//    contentItemchild23.setRemark("");
//    contentItemchild23.setDirectory(d);
//    contentItemchild23.setProvince(p);
//    contentItemchild23.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild23).getId());
//
//    ContentItem contentItemchild24 = new ContentItem() ;
//    contentItemchild24.setContent("没有明确的提出是否质量分层");
//    contentItemchild24.setName("质量分层");
//    contentItemchild24.setRemark("");
//    contentItemchild24.setDirectory(d);
//    contentItemchild24.setProvince(p);
//    contentItemchild24.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild24).getId());
//
//    ContentItem contentItemchild25 = new ContentItem() ;
//    contentItemchild25.setContent("国家发展改革委公布的基本药物基层平均采购价格为参照，" +
//    "结合上年度基本药物采购价格和其他省（区、市）集中采购价格，形成集中采购参考价格");
//    contentItemchild25.setName("限价原则");
//    contentItemchild25.setRemark("包括最高零售价");
//    contentItemchild25.setDirectory(d);
//    contentItemchild25.setProvince(p);
//    contentItemchild25.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild25).getId());
//
//    ContentItem contentItemchild26 = new ContentItem() ;
//    contentItemchild26.setContent("暂没有明确规定");
//    contentItemchild26.setName("报价原则");
//    contentItemchild26.setRemark("");
//    contentItemchild26.setDirectory(d);
//    contentItemchild26.setProvince(p);
//    contentItemchild26.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild26).getId());
//
//
//    ContentItem contentItemchild27 = new ContentItem() ;
//    contentItemchild27.setContent("原则上基本药物直接向生产企业采购，由生产企业委托经营企业配送或直接配送。" +
//        "在此之前，基本药物继续由入围候选品种的生产企业直接委托入围候选的配送企业统一配送。" +
//    "生产企业和配送企业作为供货主体，都要对药品的质量和供应一并负责。");
//    contentItemchild27.setName("配送规则");
//    contentItemchild27.setRemark("");
//    contentItemchild27.setDirectory(d);
//    contentItemchild27.setProvince(p);
//    contentItemchild27.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild27).getId());
//
//
//
//    ContentItem contentItem3 = new ContentItem() ;
//    contentItem3.setContent("没有明确的时间表");
//    contentItem3.setName("招标时间表");
//    contentItem3.setRemark("");
//    contentItem3.setDirectory(d);
//    contentItem3.setProvince(p);
//    contentItem3.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem3).getId());
//
//    ContentItem contentItem4 = new ContentItem() ;
//    contentItem4.setContent("暂时没有明确的出台文件");
//    contentItem4.setName("招标结果");
//    contentItem4.setRemark("是否有合资产品");
//    contentItem4.setDirectory(d);
//    contentItem4.setProvince(p);
//    contentItem4.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem4).getId());
//
//    //****************
//    //one level
//    ContentItem contentItemchild41 = new ContentItem() ;
//    contentItemchild41.setContent("暂时没有明确的出台文件");
//    contentItemchild41.setName("AZ产品");
//    contentItemchild41.setRemark("");
//    contentItemchild41.setDirectory(d);
//    contentItemchild41.setProvince(p);
//    contentItemchild41.setParentId(contentItem4.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild41).getId());
//
//    ContentItem contentItemchild42 = new ContentItem() ;
//    contentItemchild42.setContent("");
//    contentItemchild42.setName("关注领域");
//    contentItemchild42.setRemark("");
//    contentItemchild42.setDirectory(d);
//    contentItemchild42.setProvince(p);
//    contentItemchild42.setParentId(contentItem4.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild42).getId());
//
//    // two level
//    //    高血压
//    //    高血脂
//    //    呼吸
//    //    消化道
//
//    ContentItem contentItemchild421 = new ContentItem() ;
//    contentItemchild421.setContent("暂时没有明确的出台文件");
//    contentItemchild421.setName("高血压");
//    contentItemchild421.setRemark("络活喜；波依定");
//    contentItemchild421.setDirectory(d);
//    contentItemchild421.setProvince(p);
//    contentItemchild421.setParentId(contentItemchild42.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild421).getId());
//
//    ContentItem contentItemchild422 = new ContentItem() ;
//    contentItemchild422.setContent("暂时没有明确的出台文件");
//    contentItemchild422.setName("高血脂");
//    contentItemchild422.setRemark("舒降之；立普妥");
//    contentItemchild422.setDirectory(d);
//    contentItemchild422.setProvince(p);
//    contentItemchild422.setParentId(contentItemchild42.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild422).getId());
//
//    ContentItem contentItemchild423 = new ContentItem() ;
//    contentItemchild423.setContent("暂时没有明确的出台文件");
//    contentItemchild423.setName("呼吸");
//    contentItemchild423.setRemark("万托林");
//    contentItemchild423.setDirectory(d);
//    contentItemchild423.setProvince(p);
//    contentItemchild423.setParentId(contentItemchild42.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild423).getId());
//
//    ContentItem contentItemchild424 = new ContentItem() ;
//    contentItemchild424.setContent("暂时没有明确的出台文件");
//    contentItemchild424.setName("消化道");
//    contentItemchild424.setRemark("");
//    contentItemchild424.setDirectory(d);
//    contentItemchild424.setProvince(p);
//    contentItemchild424.setParentId(contentItemchild42.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild424).getId());
//
//    //*****************
//
//    ContentItem contentItem5 = new ContentItem() ;
//    contentItem5.setContent("暂时没有明确的出台文件");
//    contentItem5.setName("药物使用执行时间");
//    contentItem5.setRemark("指招标完成以后");
//    contentItem5.setDirectory(d);
//    contentItem5.setProvince(p);
//    contentItem5.setParentId(0l);
//    Assert.assertNotNull(contentItemService.add(contentItem5).getId());
//
//  }
//
//  @Test
//  @Rollback(false)
//  public void testAddFour(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(4);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("基层医院");
//    contentItem.setRemark("");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//    //********
//    ContentItem contentItemchild1 = new ContentItem() ;
//    contentItemchild1.setContent("630种");
//    contentItemchild1.setName("可使用的药物数目");
//    contentItemchild1.setRemark("");
//    contentItemchild1.setDirectory(d);
//    contentItemchild1.setProvince(p);
//    contentItemchild1.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild1).getId());
//
//    ContentItem contentItemchild2 = new ContentItem() ;
//    contentItemchild2.setContent("按照规定只能使用基本药物");
//    contentItemchild2.setName("基本药物使用规定");
//    contentItemchild2.setRemark("金额或者比例的规定");
//    contentItemchild2.setDirectory(d);
//    contentItemchild2.setProvince(p);
//    contentItemchild2.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild2).getId());
//
//    ContentItem contentItemchild3 = new ContentItem() ;
//    contentItemchild3.setContent("2010年底，实施基本药物制度的县（市、区）达到 82个，占县（市、区）总数的77%；" +
//    "多数医疗机构还处于过渡期，允许使用库存药物");
//    contentItemchild3.setName("执行现状");
//    contentItemchild3.setRemark("");
//    contentItemchild3.setDirectory(d);
//    contentItemchild3.setProvince(p);
//    contentItemchild3.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild3).getId());
//
//    ContentItem contentItemchild4 = new ContentItem() ;
//    contentItemchild4.setContent("2011年，全面执行基本药物制度");
//    contentItemchild4.setName("实施时间表");
//    contentItemchild4.setRemark("");
//    contentItemchild4.setDirectory(d);
//    contentItemchild4.setProvince(p);
//    contentItemchild4.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild4).getId());
//    //**********
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setContent("");
//    contentItem2.setName("非基层医院");
//    contentItem2.setRemark("");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//
//    //********
//    ContentItem contentItemchild21 = new ContentItem() ;
//    contentItemchild21.setContent("是");
//    contentItemchild21.setName("是否要求配备所有基药");
//    contentItemchild21.setRemark("");
//    contentItemchild21.setDirectory(d);
//    contentItemchild21.setProvince(p);
//    contentItemchild21.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild21).getId());
//
//    ContentItem contentItemchild22 = new ContentItem() ;
//    contentItemchild22.setContent("应将基本药物作为首选药物，按规定使用一定比例的基本药物。" +
//        "基本药物使用比例采用基本药物销售收入额占全部药品销售收入额比例的方法计算。" +
//    "具体比例还没有进一步的规定");
//    contentItemchild22.setName("基本药物使用规定");
//    contentItemchild22.setRemark("金额或者比例的规定");
//    contentItemchild22.setDirectory(d);
//    contentItemchild22.setProvince(p);
//    contentItemchild22.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild22).getId());
//
//    ContentItem contentItemchild23 = new ContentItem() ;
//    contentItemchild23.setContent("大多数医院已经配备基本药物，但是基本药物很少使用；" +
//    "且没有相关比例的规定限制");
//    contentItemchild23.setName("执行现状");
//    contentItemchild23.setRemark("");
//    contentItemchild23.setDirectory(d);
//    contentItemchild23.setProvince(p);
//    contentItemchild23.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild23).getId());
//
//    ContentItem contentItemchild24 = new ContentItem() ;
//    contentItemchild24.setContent("暂时没有明确的时间表");
//    contentItemchild24.setName("实施时间表");
//    contentItemchild24.setRemark("");
//    contentItemchild24.setDirectory(d);
//    contentItemchild24.setProvince(p);
//    contentItemchild24.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild24).getId());
//
//    //********
//
//  }
//
//
//  @Test
//  @Rollback(false)
//  public void testAddFive(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(5);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("零差率");
//    contentItem.setRemark("");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//    //********
//    ContentItem contentItemchild1 = new ContentItem() ;
//    contentItemchild1.setContent("599");
//    contentItemchild1.setName("计划零差价药物数目");
//    contentItemchild1.setRemark("");
//    contentItemchild1.setDirectory(d);
//    contentItemchild1.setProvince(p);
//    contentItemchild1.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild1).getId());
//
//    ContentItem contentItemchild2 = new ContentItem() ;
//    contentItemchild2.setContent("开始试行基本药物的医疗机构基本都开始试行零差率");
//    contentItemchild2.setName("零差率现状");
//    contentItemchild2.setRemark("");
//    contentItemchild2.setDirectory(d);
//    contentItemchild2.setProvince(p);
//    contentItemchild2.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild2).getId());
//
//    ContentItem contentItemchild3 = new ContentItem() ;
//    contentItemchild3.setContent("2011年，随着基本药物制度的全面试行，零差率");
//    contentItemchild3.setName("实施时间表");
//    contentItemchild3.setRemark("");
//    contentItemchild3.setDirectory(d);
//    contentItemchild3.setProvince(p);
//    contentItemchild3.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild3).getId());
//
//
//    //**********
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setContent("");
//    contentItem2.setName("补偿机制");
//    contentItem2.setRemark("");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//
//    //********
//    ContentItem contentItemchild21 = new ContentItem() ;
//    contentItemchild21.setContent("");
//    contentItemchild21.setName("政府补贴");
//    contentItemchild21.setRemark("");
//    contentItemchild21.setDirectory(d);
//    contentItemchild21.setProvince(p);
//    contentItemchild21.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild21).getId());
//
//    //*
//    ContentItem contentItemchild211 = new ContentItem() ;
//    contentItemchild211.setContent("90%都是区政府补贴");
//    contentItemchild211.setName("补贴主体");
//    contentItemchild211.setRemark("");
//    contentItemchild211.setDirectory(d);
//    contentItemchild211.setProvince(p);
//    contentItemchild211.setParentId(contentItemchild21.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild211).getId());
//
//    ContentItem contentItemchild212 = new ContentItem() ;
//    contentItemchild212.setContent("目前绝大多数还是以政府补贴为主，部分市区（如南京、苏州）" +
//    "卫生服务中心主要以收支两条线为主；独立财政体制是以政府补贴为主");
//    contentItemchild212.setName("补贴方式");
//    contentItemchild212.setRemark("");
//    contentItemchild212.setDirectory(d);
//    contentItemchild212.setProvince(p);
//    contentItemchild212.setParentId(contentItemchild21.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild212).getId());
//    //*
//
//    ContentItem contentItemchild22 = new ContentItem() ;
//    contentItemchild22.setContent("");
//    contentItemchild22.setName("收支两条线");
//    contentItemchild22.setRemark("");
//    contentItemchild22.setDirectory(d);
//    contentItemchild22.setProvince(p);
//    contentItemchild22.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild22).getId());
//
//    //*
//    ContentItem contentItemchild221 = new ContentItem() ;
//    contentItemchild221.setContent("政府负责其举办的乡镇卫生院基本建设、设备购置、" +
//    "人员经费及其承担的公共卫生服务的业务经费，医务人员的工资水平要与当地事业单位工作人员平均工资水平相衔接。");
//    contentItemchild221.setName("收支两条线形式");
//    contentItemchild221.setRemark("");
//    contentItemchild221.setDirectory(d);
//    contentItemchild221.setProvince(p);
//    contentItemchild221.setParentId(contentItemchild22.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild221).getId());
//
//    ContentItem contentItemchild222 = new ContentItem() ;
//    contentItemchild222.setContent("区财政");
//    contentItemchild222.setName("收支主体");
//    contentItemchild222.setRemark("");
//    contentItemchild222.setDirectory(d);
//    contentItemchild222.setProvince(p);
//    contentItemchild222.setParentId(contentItemchild22.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild222).getId());
//    //*
//
//    //****
//  }
//
//  @Test
//  @Rollback(false)
//  public void testAddSix(){
//    Province p = new Province() ;
//    p.setId(1);
//    Directory d = new Directory();
//    d.setId(6);
//
//    ContentItem contentItem = new ContentItem() ;
//    contentItem.setContent("");
//    contentItem.setName("医保的相关规定");
//    contentItem.setRemark("");
//    contentItem.setDirectory(d);
//    contentItem.setProvince(p);
//    contentItem.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem).getId());
//
//    //********
//    ContentItem contentItemchild1 = new ContentItem() ;
//    contentItemchild1.setContent("基本药物品种中属于医保目录范围内的，全部纳入基本医疗保险报销范围");
//    contentItemchild1.setName("城镇职工医保");
//    contentItemchild1.setRemark("是否被纳入医保");
//    contentItemchild1.setDirectory(d);
//    contentItemchild1.setProvince(p);
//    contentItemchild1.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild1).getId());
//
//    ContentItem contentItemchild2 = new ContentItem() ;
//    contentItemchild2.setContent("基本药物品种中属于医保目录范围内的，" +
//    "全部纳入基本医疗保险报销范围");
//    contentItemchild2.setName("新农合");
//    contentItemchild2.setRemark("");
//    contentItemchild2.setDirectory(d);
//    contentItemchild2.setProvince(p);
//    contentItemchild2.setParentId(contentItem.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild2).getId());
//
//
//    //**********
//
//    ContentItem contentItem2 = new ContentItem() ;
//    contentItem2.setContent("");
//    contentItem2.setName("报销比例");
//    contentItem2.setRemark("");
//    contentItem2.setDirectory(d);
//    contentItem2.setProvince(p);
//    contentItem2.setParentId(0l);
//
//    Assert.assertNotNull(contentItemService.add(contentItem2).getId());
//
//
//    //********
//    ContentItem contentItemchild21 = new ContentItem() ;
//    contentItemchild21.setContent("基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，" +
//    "不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点");
//    contentItemchild21.setName("城镇职工医保");
//    contentItemchild21.setRemark("");
//    contentItemchild21.setDirectory(d);
//    contentItemchild21.setProvince(p);
//    contentItemchild21.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild21).getId());
//
//    ContentItem contentItemchild22 = new ContentItem() ;
//    contentItemchild22.setContent("基本药物属于医保目录的甲类药品，按照基本医疗保险的规定全额支付，" +
//    "不得设定个人自付比例；基本药物属于医保目录的乙类药品，个人自付比例的要下降5到10个百分点");
//    contentItemchild22.setName("新农合");
//    contentItemchild22.setRemark("");
//    contentItemchild22.setDirectory(d);
//    contentItemchild22.setProvince(p);
//    contentItemchild22.setParentId(contentItem2.getId());
//    Assert.assertNotNull(contentItemService.add(contentItemchild22).getId());
//
//
//    //********
//
//  }
//
//  @Test
//  public void testGetChild(){
//    Long itemId = 1l ;
//    List<ContentItem> list = contentItemService.getItemByParentId(itemId);
//    //    for (ContentItem contentItem : list) {
//    //      logger.debug("contentItem: content:"+contentItem.getContent());
//    //    }
//    String s = contentItemService.ContentItemToString(itemId, list);
//    logger.debug(s);
//  }
//}
