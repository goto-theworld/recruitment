package com.it.mapper;

import com.it.pojo.Honor;
import com.it.pojo.HonorExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HonorMapper {
    /**
     * This method corresponds to the database table honor
     */
    int countByExample(HonorExample example);

    /**
     * This method corresponds to the database table honor
     */
    int deleteByExample(HonorExample example);

    /**
     * This method corresponds to the database table honor
     */
    int deleteByPrimaryKey(Integer honorId);

    /**
     * This method corresponds to the database table honor
     */
    int insert(Honor record);

    /**
     * This method corresponds to the database table honor
     */
    int insertSelective(Honor record);

    /**
     * This method corresponds to the database table honor
     */
    List<Honor> selectByExample(HonorExample example);

    /**
     * This method corresponds to the database table honor
     */
    Honor selectByPrimaryKey(Integer honorId);

    /**
     * This method corresponds to the database table honor
     */
    int updateByExampleSelective(@Param("record") Honor record, @Param("example") HonorExample example);

    /**
     * This method corresponds to the database table honor
     */
    int updateByExample(@Param("record") Honor record, @Param("example") HonorExample example);

    /**
     * This method corresponds to the database table honor
     */
    int updateByPrimaryKeySelective(Honor record);

    /**
     * This method corresponds to the database table honor
     */
    int updateByPrimaryKey(Honor record);
}