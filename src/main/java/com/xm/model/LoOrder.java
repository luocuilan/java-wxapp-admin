package com.xm.model;

public class LoOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.order_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.goods_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer goodsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.user_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.serial_no
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String serialNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.order_code
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String orderCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.address
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.customer_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lo_order.pay_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer payType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.order_id
     *
     * @return the value of lo_order.order_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.order_id
     *
     * @param orderId the value for lo_order.order_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.goods_id
     *
     * @return the value of lo_order.goods_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.goods_id
     *
     * @param goodsId the value for lo_order.goods_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.user_id
     *
     * @return the value of lo_order.user_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.user_id
     *
     * @param userId the value for lo_order.user_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.serial_no
     *
     * @return the value of lo_order.serial_no
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.serial_no
     *
     * @param serialNo the value for lo_order.serial_no
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.order_code
     *
     * @return the value of lo_order.order_code
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.order_code
     *
     * @param orderCode the value for lo_order.order_code
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.address
     *
     * @return the value of lo_order.address
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.address
     *
     * @param address the value for lo_order.address
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.customer_name
     *
     * @return the value of lo_order.customer_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.customer_name
     *
     * @param customerName the value for lo_order.customer_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.remark
     *
     * @return the value of lo_order.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.remark
     *
     * @param remark the value for lo_order.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lo_order.pay_type
     *
     * @return the value of lo_order.pay_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lo_order.pay_type
     *
     * @param payType the value for lo_order.pay_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }
}