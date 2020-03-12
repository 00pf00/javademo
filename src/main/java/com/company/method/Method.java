package com.company.method;

import com.company.anotate.Handler;

public class Method {
    @Handler(path = "/root")
    public void Say(){
        System.out.println("hello world");
    }
}
