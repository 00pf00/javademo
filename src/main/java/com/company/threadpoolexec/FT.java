package com.company.threadpoolexec;

import java.util.concurrent.FutureTask;

public class FT extends FutureTask<Void> {
    public FR fr;
    public FT(Runnable runnable, Void result) {
        super(runnable, result);
        if (runnable instanceof FR){
            fr = (FR)runnable;
        }

    }
}
