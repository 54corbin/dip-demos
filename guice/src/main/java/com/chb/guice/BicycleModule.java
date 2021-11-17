package com.chb.guice;

import com.google.inject.*;

/**
 * BicycleModule
 */
public class BicycleModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(Vehicle.class).to(Bicycle.class);

    }

    // @Provides
    // static Bicycle provideBicycle(){
    //     return new Bicycle(23);
    // }

}
