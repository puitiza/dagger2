package com.puitiza.dagger2.di;


import com.puitiza.dagger2.Motor;

import dagger.Module;
import dagger.Provides;

/*El modulo se encarga de proveer a nuestra actividad todas las instancias necesarias
Creamos modulos para que sepa dagger como devolver los objetos*/
@Module
public class MotorModule {

    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("DIESEL");
    }
}
