package com.company.runnable;

public class frunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1*10);
            System.out.println("Go Back");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
