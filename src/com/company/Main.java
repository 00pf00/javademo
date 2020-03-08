package com.company;

import com.company.threadpoolexec.*;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);
        TF tf = new TF();
        ExecutorService thp = new TPE(2, 4, 10, TimeUnit.SECONDS, queue,tf,new RH());
        ArrayList<Future> fl = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int finalI = i;
            Runnable r = new FR(i);
            FT ft = new FT(r,null);
            thp.execute(ft);
            fl.add(ft);
            //System.out.println(i+"\n");
//            if (i == 0 || i == 1){
//                tf.cancel(true);
//            }

        }
//        for (int i = 1; i < 103; i++) {
//            int finalI = i;
//            Runnable r = new FR(i);
//            FT ft = new FT(r,null);
//            queue.add(ft);
//            fl.add(ft);
//        }
        Thread.sleep(1000);
        for (int i = 0; i < 100; i++) {
            boolean flag = fl.get(i).cancel(true);
            System.out.println("flag-" + i + " = " + flag + "\n");
        }
//        while (queue.size() != 0 ){
//            Thread.sleep(1000);
//        }
//        for (int i = 100; i < 102; i++) {
//            int finalI = i;
//            Runnable r = new FR(i);
//            FT ft = new FT(r,null);
//            thp.execute(ft);
//            fl.add(ft);
//        }
        Thread.sleep(2000);
        System.out.println("main end \n");
        System.out.println(tf.getCount());

    }
}
