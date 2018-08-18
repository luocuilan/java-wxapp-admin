package com.xm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Attachment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.attachment_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer attachmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.data_key
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String dataKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.file_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.file_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.file_size
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private BigDecimal fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.partial_path
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String partialPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.upload_time
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Date uploadTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.uploader_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private Integer uploaderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.uploader_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    private String uploaderName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.attachment_id
     *
     * @return the value of attachment.attachment_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.attachment_id
     *
     * @param attachmentId the value for attachment.attachment_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.data_key
     *
     * @return the value of attachment.data_key
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getDataKey() {
        return dataKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.data_key
     *
     * @param dataKey the value for attachment.data_key
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setDataKey(String dataKey) {
        this.dataKey = dataKey == null ? null : dataKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.type
     *
     * @return the value of attachment.type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.type
     *
     * @param type the value for attachment.type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.file_name
     *
     * @return the value of attachment.file_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.file_name
     *
     * @param fileName the value for attachment.file_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.file_type
     *
     * @return the value of attachment.file_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.file_type
     *
     * @param fileType the value for attachment.file_type
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.file_size
     *
     * @return the value of attachment.file_size
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public BigDecimal getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.file_size
     *
     * @param fileSize the value for attachment.file_size
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.partial_path
     *
     * @return the value of attachment.partial_path
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getPartialPath() {
        return partialPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.partial_path
     *
     * @param partialPath the value for attachment.partial_path
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setPartialPath(String partialPath) {
        this.partialPath = partialPath == null ? null : partialPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.remark
     *
     * @return the value of attachment.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.remark
     *
     * @param remark the value for attachment.remark
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.upload_time
     *
     * @return the value of attachment.upload_time
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.upload_time
     *
     * @param uploadTime the value for attachment.upload_time
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.uploader_id
     *
     * @return the value of attachment.uploader_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public Integer getUploaderId() {
        return uploaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.uploader_id
     *
     * @param uploaderId the value for attachment.uploader_id
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setUploaderId(Integer uploaderId) {
        this.uploaderId = uploaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.uploader_name
     *
     * @return the value of attachment.uploader_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public String getUploaderName() {
        return uploaderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.uploader_name
     *
     * @param uploaderName the value for attachment.uploader_name
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName == null ? null : uploaderName.trim();
    }
}