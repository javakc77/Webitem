package com.javakc.ssm.modules.bzcl.entity;

import com.javakc.ssm.base.entity.BaseEntity;

/**
 * 包装材料实体类
 */
public class BzclEntity extends BaseEntity<BzclEntity> {

    /** 包装材料id;包装材料id */
    private String id ;
    /** 包装材料编号;包装材料编号 */
    private String bzclNumber ;
    /** 包装材料名称;包装材料名称 */
    private String bzclName ;
    /** 材料单价;材料单价 */
    private String bzclPrice ;
    /** 重量;重量 */
    private String bzclWeight ;
    /** 材料类别,1包装，2原材料 */
    private Integer bzclCategory ;
    /** 尺寸;尺寸 */
    private String bzclSize ;
    /** 规格;规格 */
    private String bzclSpecifications ;
    /** 形态;形态 */
    private Integer bzclForm ;
    /** 单位;单位 */
    private String bzclCompany ;
    /** 备注;备注 */
    private String bzclRemarks ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBzclNumber() {
        return bzclNumber;
    }

    public void setBzclNumber(String bzclNumber) {
        this.bzclNumber = bzclNumber;
    }

    public String getBzclName() {
        return bzclName;
    }

    public void setBzclName(String bzclName) {
        this.bzclName = bzclName;
    }

    public String getBzclPrice() {
        return bzclPrice;
    }

    public void setBzclPrice(String bzclPrice) {
        this.bzclPrice = bzclPrice;
    }

    public String getBzclWeight() {
        return bzclWeight;
    }

    public void setBzclWeight(String bzclWeight) {
        this.bzclWeight = bzclWeight;
    }

    public Integer getBzclCategory() {
        return bzclCategory;
    }

    public void setBzclCategory(Integer bzclCategory) {
        this.bzclCategory = bzclCategory;
    }

    public String getBzclSize() {
        return bzclSize;
    }

    public void setBzclSize(String bzclSize) {
        this.bzclSize = bzclSize;
    }

    public String getBzclSpecifications() {
        return bzclSpecifications;
    }

    public void setBzclSpecifications(String bzclSpecifications) {
        this.bzclSpecifications = bzclSpecifications;
    }

    public Integer getBzclForm() {
        return bzclForm;
    }

    public void setBzclForm(Integer bzclForm) {
        this.bzclForm = bzclForm;
    }

    public String getBzclCompany() {
        return bzclCompany;
    }

    public void setBzclCompany(String bzclCompany) {
        this.bzclCompany = bzclCompany;
    }

    public String getBzclRemarks() {
        return bzclRemarks;
    }

    public void setBzclRemarks(String bzclRemarks) {
        this.bzclRemarks = bzclRemarks;
    }
}
