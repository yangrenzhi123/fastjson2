package com.yang.test.java.fastjson;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;

public class Test {
    public static void main(String[] args) {
        JSONObject o = new JSONObject();
        o.put("name", "yang");
        o.put("age", 18);
        String source = o.toJSONString();

        JSONPath path = JSONPath.of("$.name");

        JSONReader reader = JSONReader.of(source);

        System.out.println(path.extract(reader));
    }
}
