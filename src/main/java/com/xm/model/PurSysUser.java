package com.xm.model;

import java.util.Date;

public class PurSysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.id
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.userid
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.login
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private String login;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.username
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.pwd
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.count
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private Integer count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pur_sys_user.create_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.id
     *
     * @return the value of pur_sys_user.id
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.id
     *
     * @param id the value for pur_sys_user.id
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.userid
     *
     * @return the value of pur_sys_user.userid
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.userid
     *
     * @param userid the value for pur_sys_user.userid
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.login
     *
     * @return the value of pur_sys_user.login
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.login
     *
     * @param login the value for pur_sys_user.login
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.username
     *
     * @return the value of pur_sys_user.username
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.username
     *
     * @param username the value for pur_sys_user.username
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.pwd
     *
     * @return the value of pur_sys_user.pwd
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.pwd
     *
     * @param pwd the value for pur_sys_user.pwd
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.last_login_time
     *
     * @return the value of pur_sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.last_login_time
     *
     * @param lastLoginTime the value for pur_sys_user.last_login_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.count
     *
     * @return the value of pur_sys_user.count
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.count
     *
     * @param count the value for pur_sys_user.count
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pur_sys_user.create_time
     *
     * @return the value of pur_sys_user.create_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pur_sys_user.create_time
     *
     * @param createTime the value for pur_sys_user.create_time
     *
     * @mbggenerated Sun Aug 12 18:01:38 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}