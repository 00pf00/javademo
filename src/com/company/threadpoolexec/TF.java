package com.company.threadpoolexec;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class TF implements ThreadFactory {
    public static ConcurrentHashMap tm = new ConcurrentHashMap();
    public static AtomicInteger count = new AtomicInteger(0);
    @Override
    public Thread newThread(Runnable r) {
        int i = count.getAndIncrement();
        System.out.println("creat thread-"+i+"\n");
        return new Thread(r);
    }
    public int getCount(){
        return count.get();
    }
}
