package com.xm.mapper;

import com.xm.model.PurSysUserRole;
import com.xm.model.PurSysUserRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PurSysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int countByExample(PurSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int deleteByExample(PurSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int insert(PurSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int insertSelective(PurSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    List<PurSysUserRole> selectByExample(PurSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    PurSysUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int updateByExampleSelective(@Param("record") PurSysUserRole record, @Param("example") PurSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int updateByExample(@Param("record") PurSysUserRole record, @Param("example") PurSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int updateByPrimaryKeySelective(PurSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pur_sys_user_role
     *
     * @mbggenerated Sat Aug 11 10:55:46 CST 2018
     */
    int updateByPrimaryKey(PurSysUserRole record);
}