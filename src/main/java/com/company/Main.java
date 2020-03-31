package com.company;

import com.alibaba.fastjson.JSONArray;
import jsonarray.DPojo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<DPojo> dl = new ArrayList<>();
        DPojo d1 = new DPojo();
        d1.setId(1);
        d1.setName("A");
        dl.add(d1);
        DPojo d2 = new DPojo();
        d2.setId(2);
        d2.setName("B");
        dl.add(d2);
        byte[] bs = JSONArray.toJSONBytes(dl);
        Object obj = JSONArray.parse(bs);
        if (obj instanceof JSONArray) {
            System.out.println(obj);
        }
    }
}
