package com.company.threadpoolexec;

import java.util.concurrent.*;

public class TPE extends ThreadPoolExecutor {
    public TPE(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }
    public TPE(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    protected void beforeExecute(Thread t, Runnable r) {
        if (r instanceof FutureTask){
            FT ft = (FT)r;
            System.out.println(ft.fr.count +"will run!\n");
        }
    }
}
