package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.TableDto;
import com.example.demo.service.CConsService;
import com.example.demo.service.FormatService;
import com.example.demo.vo.FormByPageVo;
import com.example.demo.vo.FormVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

/**
 * @author 王明杰
 */
@Controller
public class IndexController {

    @Autowired
    FormatService formatService;
    
    @Autowired(required = false)
    CConsService cConsService;

    //首页的跳转
    @GetMapping("/")
    public String jumpLayuiIndex(){
        return "layui";
    }

    //layui的异步请求处理
    @RequestMapping("/search")
    @ResponseBody
    public JSONObject index(@RequestParam(name = "cConsId")String cConsId, @RequestParam(name = "custId")String custId,
                            @RequestParam(name = "custQueryNo")String custQueryNo, @RequestParam(name = "buildDate")String buildDate,
                            @RequestParam(name = "chkCycle")String chkCycle, @RequestParam(name = "poweroffCode")String poweroffCode,
                            @RequestParam(name = "page")String page, @RequestParam(name = "limit")String limit
                         ) throws InterruptedException, ParseException {
        //创建FormVo实例,传递查询条件
        FormVo formVo = new FormVo(cConsId,custId,custQueryNo,poweroffCode,buildDate,chkCycle);
        FormByPageVo formByPageVo = new FormByPageVo(formVo,Integer.parseInt(page),Integer.parseInt(limit));

        //调用查询服务，获得返回数据集
        TableDto tableDto = cConsService.search(formByPageVo);
        //json格式转换
        return formatService.jsonFormat(tableDto);
    }


}


