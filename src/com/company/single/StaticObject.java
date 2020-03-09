package com.company.single;

import java.util.UUID;

public class StaticObject {
    private static String prs = UUID.randomUUID().toString();
    public static String Pbs = UUID.randomUUID().toString();

    public  String getPrs() {
        return prs;
    }

    public  void setPrs(String prs) {
        StaticObject.prs = prs;
    }

    public  String getPbs() {
        return Pbs;
    }

    public  void setPbs(String pbs) {
        Pbs = pbs;
    }
}
