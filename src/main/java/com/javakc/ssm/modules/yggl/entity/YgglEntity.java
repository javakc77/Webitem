package com.javakc.ssm.modules.yggl.entity;

import com.javakc.ssm.base.entity.BaseEntity;

import java.util.Date;


/**
 * 员工管理实体类
 */
public class YgglEntity extends BaseEntity<YgglEntity> {

    /** 员工管理id;员工管理id */
    private String id ;

    /** 员工编号;员工编号，自动生成，六位数字 */
    private String ygglNumber ;

    /** 员工姓名;员工姓名 */
    private String ygglName ;

    /** 员工性别;员工性别,1男，2女 */
    private Integer ygglSex ;

    /** 员工电话;员工电话 */
    private String ygglTelephone ;

    /** 民族;民族 */
    private String ygglNation ;

    /** 户口所在地;户口所在地 */
    private String ygglResidence ;

    /** 出生日期;出生日期 */
    private Date ygglBirthday ;

    /** 紧急联系人;紧急联系人 */
    private String ygglEmergency ;

    /** 紧急联系电话;紧急联系电话 */
    private String ygglEmtelephone ;

    /** 入职时间;入职时间 */
    private Date ygglEntrytime ;

    /** 任职状态;任职状态，1在职，2离职 */
    private Integer ygglState ;

    /** 家庭住址;家庭住址 */
    private String ygglAddress ;

    /** 备注;备注 */
    private String ygglRemarks ;


    /** 员工管理id;员工管理id */
    public String getId(){
        return this.id;
    }
    /** 员工管理id;员工管理id */
    public void setId(String id){
        this.id = id;
    }
    /** 员工编号;员工编号，自动生成，六位数字 */
    public String getYgglNumber(){
        return this.ygglNumber;
    }
    /** 员工编号;员工编号，自动生成，六位数字 */
    public void setYgglNumber(String ygglNumber){
        this.ygglNumber = ygglNumber;
    }
    /** 员工姓名;员工姓名 */
    public String getYgglName(){
        return this.ygglName;
    }
    /** 员工姓名;员工姓名 */
    public void setYgglName(String ygglName){
        this.ygglName = ygglName;
    }
    /** 员工性别;员工性别,1男，2女 */
    public Integer getYgglSex(){
        return this.ygglSex;
    }
    /** 员工性别;员工性别,1男，2女 */
    public void setYgglSex(Integer ygglSex){
        this.ygglSex = ygglSex;
    }
    /** 员工电话;员工电话 */
    public String getYgglTelephone(){
        return this.ygglTelephone;
    }
    /** 员工电话;员工电话 */
    public void setYgglTelephone(String ygglTelephone){
        this.ygglTelephone = ygglTelephone;
    }
    /** 民族;民族 */
    public String getYgglNation(){
        return this.ygglNation;
    }
    /** 民族;民族 */
    public void setYgglNation(String ygglNation){
        this.ygglNation = ygglNation;
    }
    /** 户口所在地;户口所在地 */
    public String getYgglResidence(){
        return this.ygglResidence;
    }
    /** 户口所在地;户口所在地 */
    public void setYgglResidence(String ygglResidence){
        this.ygglResidence = ygglResidence;
    }
    /** 出生日期;出生日期 */
    public Date getYgglBirthday(){
        return this.ygglBirthday;
    }
    /** 出生日期;出生日期 */
    public void setYgglBirthday(Date ygglBirthday){
        this.ygglBirthday = ygglBirthday;
    }
    /** 紧急联系人;紧急联系人 */
    public String getYgglEmergency(){
        return this.ygglEmergency;
    }
    /** 紧急联系人;紧急联系人 */
    public void setYgglEmergency(String ygglEmergency){
        this.ygglEmergency = ygglEmergency;
    }
    /** 紧急联系电话;紧急联系电话 */
    public String getYgglEmtelephone(){
        return this.ygglEmtelephone;
    }
    /** 紧急联系电话;紧急联系电话 */
    public void setYgglEmtelephone(String ygglEmtelephone){
        this.ygglEmtelephone = ygglEmtelephone;
    }
    /** 入职时间;入职时间 */
    public Date getYgglEntrytime(){
        return this.ygglEntrytime;
    }
    /** 入职时间;入职时间 */
    public void setYgglEntrytime(Date ygglEntrytime){
        this.ygglEntrytime = ygglEntrytime;
    }
    /** 任职状态;任职状态，1在职，2离职 */
    public Integer getYgglState(){
        return this.ygglState;
    }
    /** 任职状态;任职状态，1在职，2离职 */
    public void setYgglState(Integer ygglState){
        this.ygglState = ygglState;
    }
    /** 家庭住址;家庭住址 */
    public String getYgglAddress(){
        return this.ygglAddress;
    }
    /** 家庭住址;家庭住址 */
    public void setYgglAddress(String ygglAddress){
        this.ygglAddress = ygglAddress;
    }
    /** 备注;备注 */
    public String getYgglRemarks(){
        return this.ygglRemarks;
    }
    /** 备注;备注 */
    public void setYgglRemarks(String ygglRemarks){
        this.ygglRemarks = ygglRemarks;
    }
}
