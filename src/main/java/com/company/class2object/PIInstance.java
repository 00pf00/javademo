package com.company.class2object;

public class PIInstance extends PInstance {
    private PIInstance(Integer iid,String n){
        super(iid,n);
    }
    public PIInstance(){
    }
    public void Say(){
        System.out.println("hello");
    }
}
