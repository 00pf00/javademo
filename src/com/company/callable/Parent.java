package com.company.callable;

import java.util.concurrent.Callable;

public abstract class Parent implements Callable {
    public String uuid;
    public Parent(String uid){
        uuid = uid;
    }
}
