package com.company.thread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class ParentTask implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        final ParentThread p = (ParentThread) t;
        final String[] child = p.getChains();
        child[0] = "child";
        p.setChains(child);
        System.out.println("child uuid = " + p.getUuid() + "/n");
        Callable ct = new Callable<String[]>(){

            public String[] call() throws Exception {
                String[] gradeChild = p.getChains();
                child[1] = "gradeChild";
                p.setChains(gradeChild);
                System.out.println("gradeChild uuid = " + p.getUuid() + "/n");
                return new String[0];
            }
        };

        ParentFtask ft = new ParentFtask(ct);
        new Thread(ft).start();
        try {
            ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
