package com.company.threadpool;

import com.company.thread.ParentThread;

import java.util.concurrent.ThreadFactory;

public class TFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        return new ParentThread(r);
    }
}
