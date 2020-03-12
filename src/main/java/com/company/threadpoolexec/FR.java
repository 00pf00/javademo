package com.company.threadpoolexec;

public class FR implements Runnable{
    public int count;
    public FR(int c){
        count = c;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(count+"runnable end!\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
