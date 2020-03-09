package com.company;

import com.company.single.StaticObject;

public class Main {

    public static void main(String[] args)  {
        for (int i = 0 ; i < 100 ; i ++) {
            StaticObject so = new StaticObject();
            System.out.println(so.getPbs());
        }
    }
}
