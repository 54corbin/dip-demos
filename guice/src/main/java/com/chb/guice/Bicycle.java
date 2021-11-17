package com.chb.guice;

import com.google.inject.*;


/**
 * Bicycle
 */
@Singleton
public class Bicycle implements Vehicle {

    private int speed = 0;

    @Inject
    private Wheel wheel;

    public Bicycle() {

    }

    public Bicycle(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        System.out.println("A bicycle is running!!!");
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public Wheel getWheel() {
        return this.wheel;
    }

}
