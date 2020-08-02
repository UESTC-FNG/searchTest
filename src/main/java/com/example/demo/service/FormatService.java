package com.example.demo.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.TableDto;
import org.springframework.stereotype.Service;

@Service
public class FormatService {

    //将tableDTO转为layui所需要的json数据格式
    public JSONObject jsonFormat(TableDto tableDto) {
        JSONObject jsonObject = new JSONObject(true);

        jsonObject.put("code", 0);
        jsonObject.put("msg", "");
        jsonObject.put("count", tableDto.getCount());
        JSONArray jsonArray = new JSONArray();
        jsonArray.addAll(tableDto.getcCons());
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }
}

