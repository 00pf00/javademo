package com.company;

import com.company.single.StaticObject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args)  {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<Integer, Integer>();
        for(int i= 0 ; i < 100;i++){
            Integer in = new Integer(i);
            map.put(in,in);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getValue());
            map.remove(entry.getKey());
        }
        System.out.println("end");
    }
}
