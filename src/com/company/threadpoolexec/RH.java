package com.company.threadpoolexec;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RH implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        if (r instanceof FT){
            FT ft = (FT)r;
            System.out.println("task-"+ft.fr.count+"reject\n");

        }
    }
}
