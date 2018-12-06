package com.balladares.microtareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class Microtask2c extends AppCompatActivity {

    Spinner spinner;
    TextView txtShowAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microtask2c);

        spinner = findViewById(R.id.spinnerAnimals);
        txtShowAnimal = findViewById(R.id.txtShowAnimal);
    }

    public void SaveAnimal(View view){
        txtShowAnimal.setText(spinner.getSelectedItem().toString());

    }
}
