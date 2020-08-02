package com.example.demo.service;

import com.example.demo.bo.CCons;
import com.example.demo.dto.TableDto;
import com.example.demo.mapper.CConsExtMapper;
import com.example.demo.vo.FormByPageVo;
import com.example.demo.vo.FormVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王明杰
 */
@Service
public class CConsService {


    @Autowired(required = false)
    private CConsExtMapper cConsExtMapper;


    //通过传入的FormVo获取查询结果对应的展示dto
    public TableDto search(FormByPageVo formByPageVo){
        FormVo formVo =formByPageVo.getFormVo();
        //获得查询的返回集
        List<CCons> cCons = cConsExtMapper.selectByFormVo(formByPageVo);
        //获得查询的返回数
        Integer count = cConsExtMapper.countByFormVo(formVo);
        //创建返回的dto对象
        TableDto tableDto = new TableDto(count,cCons);
        return tableDto;

    }





}








