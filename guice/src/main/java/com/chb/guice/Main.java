package com.chb.guice;

import com.google.inject.*;

public class Main{

    public static void main(String[] args){
        System.out.println("hello !!!");

        Injector injector = Guice.createInjector(new BicycleModule());
        Vehicle v = injector.getInstance(Vehicle.class);
        v.run();
        System.out.println("speed="+v.getSpeed()+"   wheel.size="+v.getWheel().getSize() );

    }
}
