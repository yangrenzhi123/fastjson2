package com.yang.test.java.fastjson;
import com.alibaba.fastjson2.JSONObject;
public class Test {
    public static void main(String[] args) {
        JSONObject o = new JSONObject();
        System.out.println(o.toJSONString());
    }
}
