package com.xm.mapper;

import com.xm.model.Attachment;
import com.xm.model.AttachmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int countByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int deleteByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int deleteByPrimaryKey(Integer attachmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int insert(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int insertSelective(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    List<Attachment> selectByExample(AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    Attachment selectByPrimaryKey(Integer attachmentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int updateByExample(@Param("record") Attachment record, @Param("example") AttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int updateByPrimaryKeySelective(Attachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Sat Aug 11 10:55:45 CST 2018
     */
    int updateByPrimaryKey(Attachment record);
}