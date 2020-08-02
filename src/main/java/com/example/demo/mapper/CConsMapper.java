package com.example.demo.mapper;

import com.example.demo.bo.CCons;
import com.example.demo.bo.CConsExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CConsMapper {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int countByExample(CConsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int deleteByExample(CConsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int deleteByPrimaryKey(String consId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int insert(CCons record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int insertSelective(CCons record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    List<CCons> selectByExample(CConsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    CCons selectByPrimaryKey(String consId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int updateByPrimaryKeySelective(CCons record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_cons
     *
     * @mbggenerated Sun Aug 02 13:08:17 CST 2020
     */
    int updateByPrimaryKey(CCons record);
}