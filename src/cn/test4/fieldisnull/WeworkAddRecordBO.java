package cn.test4.fieldisnull;

import java.io.Serializable;
import java.util.Date;
import java.util.StringJoiner;

public class WeworkAddRecordBO implements Serializable {

    private static final long serialVersionUID = 2817475919856468486L;

    /**
     * 门店id
     */
    private Long orgId;

    /**
     * 业务场景，包括【未明确/售前/售后】
     */
    private String businessType;

    /**
     * 元兵客户Id
     */
    private Long customerId;

    /**
     * 元兵电销坐席Id
     */
    private Long ccUserId;

    /**
     * 元兵网销坐席Id
     */
    private Long weworkCcUserId;

    /**
     * 元兵坐席企业微信成员ID
     */
    private String ccUserWechat;

    /**
     * 手机串随机码
     */
    private String mobileHashcode;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 好友状态，包括【已添加/已通过/已删除】
     */
    private String status;

    /**
     * 通过时间
     */
    private Date passTime;

    /**
     * 添加次数
     */
    private Integer addTimes;

    /**
     * 企业成员角色类型（供wework接口使用）
     */
    private String roleType;

    /**
     * 企业成员角色名称（供wework接口使用）
     */
    private String ewRoleName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCcUserId() {
        return ccUserId;
    }

    public void setCcUserId(Long ccUserId) {
        this.ccUserId = ccUserId;
    }

    public Long getWeworkCcUserId() {
        return weworkCcUserId;
    }

    public void setWeworkCcUserId(Long weworkCcUserId) {
        this.weworkCcUserId = weworkCcUserId;
    }

    public String getCcUserWechat() {
        return ccUserWechat;
    }

    public void setCcUserWechat(String ccUserWechat) {
        this.ccUserWechat = ccUserWechat;
    }

    public String getMobileHashcode() {
        return mobileHashcode;
    }

    public void setMobileHashcode(String mobileHashcode) {
        this.mobileHashcode = mobileHashcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public Integer getAddTimes() {
        return addTimes;
    }

    public void setAddTimes(Integer addTimes) {
        this.addTimes = addTimes;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getEwRoleName() {
        return ewRoleName;
    }

    public void setEwRoleName(String ewRoleName) {
        this.ewRoleName = ewRoleName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", WeworkAddRecordBO.class.getSimpleName() + "[", "]")
                .add("orgId=" + orgId)
                .add("businessType='" + businessType + "'")
                .add("customerId=" + customerId)
                .add("ccUserId=" + ccUserId)
                .add("weworkCcUserId=" + weworkCcUserId)
                .add("ccUserWechat='" + ccUserWechat + "'")
                .add("mobileHashcode='" + mobileHashcode + "'")
                .add("phone='" + phone + "'")
                .add("status='" + status + "'")
                .add("passTime=" + passTime)
                .add("addTimes=" + addTimes)
                .add("roleType='" + roleType + "'")
                .add("ewRoleName='" + ewRoleName + "'")
                .toString();
    }
}
