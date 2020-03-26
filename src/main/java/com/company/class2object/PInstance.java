package com.company.class2object;

public class PInstance {
    private Integer id;
    private String name;

    protected PInstance(Integer iid,String n){
        this.id = iid;
        this.name = n;
    }
    public PInstance(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
