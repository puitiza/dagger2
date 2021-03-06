package com.puitiza.dagger2.di;

import android.app.Application;

public class MotorApplication extends Application {
    private MotorComponent motorComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //Lo que hace dagger es que a la interfaz "MotorComponent" le pone la anotación Dagger
        motorComponent = DaggerMotorComponent.builder().motorModule(new MotorModule()).build();
    }

    public MotorComponent getMotorComponent(){
        return motorComponent;
    }
}
