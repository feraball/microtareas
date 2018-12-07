package com.balladares.microtareas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//        Button btnMicrotask1 = (Button) findViewById(R.id.btnMicrotask1);
//        Button btnMicrotask2 = (Button) findViewById(R.id.btnMicrotask2);
//        Button btnMicrotask3 = (Button) findViewById(R.id.btnMicrotask3);
//        Button btnMicrotask4 = (Button) findViewById(R.id.btnMicrotask4);


    }

    public void StartMicrotask1 (View v){
        Intent intent = new Intent(this, Microtask1.class);
        startActivity(intent);
    }

    public void StartMicrotask2a (View v){
        Intent intent = new Intent(this, Microtask2a.class);
        startActivity(intent);
    }

    public void StartMicrotask2b (View v){
        Intent intent = new Intent(this, Microtask2b.class);
        startActivity(intent);
    }

    public void StartMicrotask2c (View v){
        Intent intent = new Intent(this, Microtask2c.class);
        startActivity(intent);
    }

    public void StartMicrotask3 (View v){
        Intent intent = new Intent(this, Microtask3.class);
        startActivity(intent);
    }

    public void StartMicrotask4 (View v){
        Intent intent = new Intent(this, Microtask4.class);
        startActivity(intent);
    }
}

