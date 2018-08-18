package com.xm.model;

import java.util.Date;

public class LoGoods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.goods_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.attachment_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer attachmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.product_no
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String productNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.lable
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String lable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.goods_type
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer goodsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.goods_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.title
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.remark
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.isdelete
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Boolean isdelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.status
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.repertory
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer repertory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.virtual_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer virtualCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.sellout_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer selloutCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.create_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.create_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String createName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.create_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.update_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Integer updateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.update_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private String updateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_goods.update_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.goods_id
     *
     * @return the value of lo_goods.goods_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.goods_id
     *
     * @param goodsId the value for lo_goods.goods_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.attachment_id
     *
     * @return the value of lo_goods.attachment_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.attachment_id
     *
     * @param attachmentId the value for lo_goods.attachment_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.product_no
     *
     * @return the value of lo_goods.product_no
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.product_no
     *
     * @param productNo the value for lo_goods.product_no
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.lable
     *
     * @return the value of lo_goods.lable
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getLable() {
        return lable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.lable
     *
     * @param lable the value for lo_goods.lable
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setLable(String lable) {
        this.lable = lable == null ? null : lable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.goods_type
     *
     * @return the value of lo_goods.goods_type
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.goods_type
     *
     * @param goodsType the value for lo_goods.goods_type
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.goods_name
     *
     * @return the value of lo_goods.goods_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.goods_name
     *
     * @param goodsName the value for lo_goods.goods_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.title
     *
     * @return the value of lo_goods.title
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.title
     *
     * @param title the value for lo_goods.title
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.remark
     *
     * @return the value of lo_goods.remark
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.remark
     *
     * @param remark the value for lo_goods.remark
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.isdelete
     *
     * @return the value of lo_goods.isdelete
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.isdelete
     *
     * @param isdelete the value for lo_goods.isdelete
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.status
     *
     * @return the value of lo_goods.status
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.status
     *
     * @param status the value for lo_goods.status
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.repertory
     *
     * @return the value of lo_goods.repertory
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getRepertory() {
        return repertory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.repertory
     *
     * @param repertory the value for lo_goods.repertory
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.virtual_count
     *
     * @return the value of lo_goods.virtual_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getVirtualCount() {
        return virtualCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.virtual_count
     *
     * @param virtualCount the value for lo_goods.virtual_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setVirtualCount(Integer virtualCount) {
        this.virtualCount = virtualCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.sellout_count
     *
     * @return the value of lo_goods.sellout_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getSelloutCount() {
        return selloutCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.sellout_count
     *
     * @param selloutCount the value for lo_goods.sellout_count
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setSelloutCount(Integer selloutCount) {
        this.selloutCount = selloutCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.create_id
     *
     * @return the value of lo_goods.create_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.create_id
     *
     * @param createId the value for lo_goods.create_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.create_name
     *
     * @return the value of lo_goods.create_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.create_name
     *
     * @param createName the value for lo_goods.create_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.create_time
     *
     * @return the value of lo_goods.create_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.create_time
     *
     * @param createTime the value for lo_goods.create_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.update_id
     *
     * @return the value of lo_goods.update_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.update_id
     *
     * @param updateId the value for lo_goods.update_id
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.update_name
     *
     * @return the value of lo_goods.update_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.update_name
     *
     * @param updateName the value for lo_goods.update_name
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_goods.update_time
     *
     * @return the value of lo_goods.update_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_goods.update_time
     *
     * @param updateTime the value for lo_goods.update_time
     *
     * @mbggenerated Sun Aug 12 16:07:24 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}