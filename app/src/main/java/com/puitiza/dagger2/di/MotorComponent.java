package com.puitiza.dagger2.di;

import com.puitiza.dagger2.MainActivity;
import dagger.Component;

/*Este es el puente entre el modulo de dagger y los objetos soliticitados, recuerda además que
puede tener más de un modulo*/
@Component(modules = {MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
}
