package com.learning;

import java.util.Scanner;

public class Robots {

    private String name;
    private int hight;
    private boolean warm;

    public Robots(String n, int x) {
        name = n;
        hight = x;
    }

    public void setName(String x) {
        name = x;
    }

    public void setHight(int x) {
        hight = x;
    }

    public void setWarm(boolean x) {
        warm = x;
    }

    public void PrintParament() {
        System.out.println(name);
        System.out.println(hight);
    }
}

