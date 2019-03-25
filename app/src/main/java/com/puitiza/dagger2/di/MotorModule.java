package com.puitiza.dagger2.di;


import com.puitiza.dagger2.Coche;
import com.puitiza.dagger2.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*El modulo se encarga de proveer a nuestra actividad todas las instancias necesarias
Creamos modulos para que sepa dagger como devolver los objetos*/
@Module
public class MotorModule {

    @Named("diesel")//Esto es para instanciar 1 sola vez en vez de crear muchas veces el mismo objeto
    @Provides
    public Motor providesMotorDiesel(){
        return new Motor("DIESEL");
    }

    @Named("Gasolina")
    @Provides
    public Motor providesMotorGasolina(){
        return new Motor("GASOLINA");
    }

    @Provides
    public Coche providesCoche(@Named("diesel")Motor motor){
        return new Coche(motor);
    }
}
