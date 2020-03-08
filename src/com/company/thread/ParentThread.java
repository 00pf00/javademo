package com.company.thread;

import java.util.ArrayList;
import java.util.UUID;

public class ParentThread extends Thread {
    private  String[] chains ;
    private  String uuid ;
    private  Runnable tr;

    public ParentThread(Runnable r){
        chains = new String[3];
        uuid = UUID.randomUUID().toString();
        tr = r;
    }

    @Override
    public void run() {
        tr.run();
    }

    public String[] getChains() {
        return chains;
    }

    public void setChains(String[] chains) {
        this.chains = chains;
    }

    public  String getUuid() {
        return uuid;
    }

    public  void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
