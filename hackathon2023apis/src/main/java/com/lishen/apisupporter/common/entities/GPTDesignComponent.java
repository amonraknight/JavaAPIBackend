package com.lishen.apisupporter.common.entities;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class GPTDesignComponent {
    private String type;
    private JSONObject parameters;
}
