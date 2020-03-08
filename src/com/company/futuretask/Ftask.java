package com.company.futuretask;

import java.util.concurrent.Callable;

public class Ftask implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(10*1000);
        return "Come On";
    }
}
