package com.puitiza.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.puitiza.dagger2.di.MotorApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Motor motor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MotorApplication)getApplication()).getMotorComponent().inject(this);
        Toast.makeText(MainActivity.this,motor.getTipoMotor(),Toast.LENGTH_SHORT).show();
    }
}
