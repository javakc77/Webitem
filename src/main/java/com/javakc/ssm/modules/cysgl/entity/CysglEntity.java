package com.javakc.ssm.modules.cysgl.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;

/**
 * 测试实体类
 */
public class CysglEntity extends BaseEntity<CysglEntity> {

    /** 创建时间 */
    private Date createDate ;
    /** 承运商管理id;承运商管理id */
    private String id ;
    /** 承运商编号;承运商编号 */
    private String cysglNumber ;
    /** 承运商名称;承运商名称 */
    private String cysglName ;
    /** 座机;座机 */
    private String cysglLandlines ;
    /** 合作状态;合作状态，1合作，2终止合作 */
    private Integer cysglState ;
    /** 承运商联系人;承运商联系人 */
    private String cysglUsername ;
    /** 承运商联系电话;承运商联系电话 */
    private String cysglTelephone ;
    /** 地址;地址 */
    private String cysglAddress ;
    /** 负责业务范围;负责业务范围 */
    private String cysglRange ;
    /** 备注;备注 */
    private String cysglRemarks ;

    @Override
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCysglNumber() {
        return cysglNumber;
    }

    public void setCysglNumber(String cysglNumber) {
        this.cysglNumber = cysglNumber;
    }

    public String getCysglName() {
        return cysglName;
    }

    public void setCysglName(String cysglName) {
        this.cysglName = cysglName;
    }

    public String getCysglLandlines() {
        return cysglLandlines;
    }

    public void setCysglLandlines(String cysglLandlines) {
        this.cysglLandlines = cysglLandlines;
    }

    public Integer getCysglState() {
        return cysglState;
    }

    public void setCysglState(Integer cysglState) {
        this.cysglState = cysglState;
    }

    public String getCysglUsername() {
        return cysglUsername;
    }

    public void setCysglUsername(String cysglUsername) {
        this.cysglUsername = cysglUsername;
    }

    public String getCysglTelephone() {
        return cysglTelephone;
    }

    public void setCysglTelephone(String cysglTelephone) {
        this.cysglTelephone = cysglTelephone;
    }

    public String getCysglAddress() {
        return cysglAddress;
    }

    public void setCysglAddress(String cysglAddress) {
        this.cysglAddress = cysglAddress;
    }

    public String getCysglRange() {
        return cysglRange;
    }

    public void setCysglRange(String cysglRange) {
        this.cysglRange = cysglRange;
    }

    public String getCysglRemarks() {
        return cysglRemarks;
    }

    public void setCysglRemarks(String cysglRemarks) {
        this.cysglRemarks = cysglRemarks;
    }
}


