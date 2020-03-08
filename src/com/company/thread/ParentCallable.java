package com.company.thread;

import java.util.concurrent.Callable;

public class ParentCallable implements Callable<String[]> {
    private String[] cchain;
    private String uuid;
    public ParentCallable(){
        Thread t = Thread.currentThread();
        ParentThread pt = (ParentThread)t;
        String[] chains = pt.getChains();
        chains[1] = "gradeChild";
        cchain = chains;
        uuid = pt.getUuid();

    }
    @Override
    public String[] call() throws Exception {
        System.out.println("gradeChild uuid = " + this.uuid + "/n");
        return this.cchain;
    }
}
