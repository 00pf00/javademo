package com.company;

import com.company.class2object.PIInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        PIInstance pi = new PIInstance();
        Constructor c0 = null;
        try {
            c0 = pi.getClass().getDeclaredConstructor(Integer.class, String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        c0.setAccessible(true);
        Object obj = null;
        try {
            obj = c0.newInstance(2, "b");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (obj instanceof PIInstance) {
            PIInstance pii = (PIInstance) obj;
            pii.Say();
        }
    }

}
