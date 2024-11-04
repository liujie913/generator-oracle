package com.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WxpayV3TransferDetail implements Serializable {
    private Long id;

    private String outBatchNo;

    private String outDetailNo;

    private BigDecimal transferAmount;

    private String transferRemark;

    private String openid;

    private String userName;

    private String detailId;

    private String detailStatus;

    private String failReason;

    private String initiateTime;

    private String detailUpdateTime;

    private Date createdTime;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo == null ? null : outBatchNo.trim();
    }

    public String getOutDetailNo() {
        return outDetailNo;
    }

    public void setOutDetailNo(String outDetailNo) {
        this.outDetailNo = outDetailNo == null ? null : outDetailNo.trim();
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getTransferRemark() {
        return transferRemark;
    }

    public void setTransferRemark(String transferRemark) {
        this.transferRemark = transferRemark == null ? null : transferRemark.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus == null ? null : detailStatus.trim();
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public String getInitiateTime() {
        return initiateTime;
    }

    public void setInitiateTime(String initiateTime) {
        this.initiateTime = initiateTime == null ? null : initiateTime.trim();
    }

    public String getDetailUpdateTime() {
        return detailUpdateTime;
    }

    public void setDetailUpdateTime(String detailUpdateTime) {
        this.detailUpdateTime = detailUpdateTime == null ? null : detailUpdateTime.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outBatchNo=").append(outBatchNo);
        sb.append(", outDetailNo=").append(outDetailNo);
        sb.append(", transferAmount=").append(transferAmount);
        sb.append(", transferRemark=").append(transferRemark);
        sb.append(", openid=").append(openid);
        sb.append(", userName=").append(userName);
        sb.append(", detailId=").append(detailId);
        sb.append(", detailStatus=").append(detailStatus);
        sb.append(", failReason=").append(failReason);
        sb.append(", initiateTime=").append(initiateTime);
        sb.append(", detailUpdateTime=").append(detailUpdateTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}