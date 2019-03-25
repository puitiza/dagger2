package com.puitiza.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.puitiza.dagger2.di.MotorApplication;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {


    @Named("Gasolina")
    @Inject
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MotorApplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this,motor.getTipoMotor(),Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this,coche.getMotor(),Toast.LENGTH_SHORT).show();
    }
}
