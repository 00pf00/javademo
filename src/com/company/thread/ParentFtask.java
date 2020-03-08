package com.company.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ParentFtask extends FutureTask<String[]> {
    public ParentFtask(Callable<String[]> callable) {
        super(callable);
    }
    @Override
    public String[] get() throws InterruptedException, ExecutionException {
        String [] res = super.get();
        Thread t = Thread.currentThread();
        ParentThread pt = (ParentThread)t;
        String[] chains = pt.getChains();
        chains[2] = "response";
        return res;
    }




}
