package com.example.demo.service;

import com.example.demo.bo.CCons;
import com.example.demo.bo.CConsExample;
import com.example.demo.bo.CConsExtExample;
import com.example.demo.dto.TableDto;
import com.example.demo.mapper.CConsExtMapper;
import com.example.demo.mapper.CConsMapper;
import com.example.demo.vo.FormByPageVo;
import com.example.demo.vo.FormVo;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author 王明杰
 */
@Service
public class CConsService {


    @Autowired(required = false)
    private CConsExtMapper cConsExtMapper;

    @Autowired(required = false)
    private CConsMapper cConsMapper;


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


    public int countByPoweroffCode(String poweroffCode){
        CConsExample cConsExample = new CConsExample();
        cConsExample.createCriteria().andPoweroffCodeEqualTo(poweroffCode);
        return cConsMapper.countByExample(cConsExample);
    }


    public TableDto searchByExample(FormByPageVo formByPageVo) throws ParseException {
        CConsExtExample cConsExtExample = new CConsExtExample();
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getcConsId())){
            cConsExtExample.createCriteria().andConsIdLike(formByPageVo.getFormVo().getcConsId()+"%");
        }
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getCustId())){
            cConsExtExample.createCriteria().andCustIdLike(formByPageVo.getFormVo().getCustId()+"%");
        }
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getCustQueryNo())){
            cConsExtExample.createCriteria().andCustQueryNoEqualTo(formByPageVo.getFormVo().getCustQueryNo());
        }
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getPoweroffCode())){
            cConsExtExample.createCriteria().andPoweroffCodeEqualTo(formByPageVo.getFormVo().getPoweroffCode());
        }
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getBuildDate())){
            cConsExtExample.createCriteria().andBuildDateEqualTo(new SimpleDateFormat("yyyy/MM/dd").parse(formByPageVo.getFormVo().getBuildDate()));
        }
        if (!StringUtils.isNullOrEmpty(formByPageVo.getFormVo().getChkCycle())){
            cConsExtExample.createCriteria().andChkCycleEqualTo(formByPageVo.getFormVo().getChkCycle());
        }
        cConsExtExample.setStartRow(String.valueOf(formByPageVo.getPage()));
        cConsExtExample.setPageSize(String.valueOf(formByPageVo.getLimit()));
        List<CCons> cCons = cConsExtMapper.selectByExample(cConsExtExample);
        return new TableDto(cCons.size(),cCons);
        }


}








