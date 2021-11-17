package com.chb;

import com.google.inject.*;


/**
 * Bicycle
 */
public class Bicycle {

    private String color ;

    private int speed;


    public Bicycle() {

    }


    public Bicycle(String color,int speed) {
        this.color = color;
        this.speed = speed;
    }


    public Bicycle(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println("A bicycle is running!!!");
    }

    public int getSpeed() {
        return this.speed;
    }



}
