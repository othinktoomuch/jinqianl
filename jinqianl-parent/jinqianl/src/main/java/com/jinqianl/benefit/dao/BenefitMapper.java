package com.jinqianl.benefit.dao;

import com.jinqianl.benefit.domain.Benefit;
import com.jinqianl.benefit.domain.BenefitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BenefitMapper {
    int countByExample(BenefitExample example);

    int deleteByExample(BenefitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Benefit record);

    int insertSelective(Benefit record);

    List<Benefit> selectByExample(BenefitExample example);

    Benefit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Benefit record, @Param("example") BenefitExample example);

    int updateByExample(@Param("record") Benefit record, @Param("example") BenefitExample example);

    int updateByPrimaryKeySelective(Benefit record);

    int updateByPrimaryKey(Benefit record);
}