package com.jinqianl.cash.domain;

import java.util.Date;

public class Cash {
    private Integer id;

    private Integer recId;

    private Integer applyId;

    private Double money;

    private Date createTime;

    private Byte status;

    private Double vipEarn;

    private Double normalEarn;

    private Date modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getVipEarn() {
        return vipEarn;
    }

    public void setVipEarn(Double vipEarn) {
        this.vipEarn = vipEarn;
    }

    public Double getNormalEarn() {
        return normalEarn;
    }

    public void setNormalEarn(Double normalEarn) {
        this.normalEarn = normalEarn;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}