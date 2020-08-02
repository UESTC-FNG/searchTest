package com.example.demo.mapper;

import com.example.demo.bo.CCons;
import com.example.demo.vo.FormByPageVo;
import com.example.demo.vo.FormVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CConsExtMapper {
    List<CCons> selectByFormVo(FormByPageVo formByPageVo);

    Integer countByFormVo(FormVo formVo);
}
