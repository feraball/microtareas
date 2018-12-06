package com.balladares.microtareas;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class Microtask2a extends AppCompatActivity {

    TimePicker timePicker;
    TextView txtShowTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microtask2a);

        timePicker = findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);

        txtShowTime = findViewById(R.id.txtShowTime);
    }

    public void SaveTime (View v){
        String hour;
        String minute;

        if (Build.VERSION.SDK_INT >= 23 ){
            hour = Integer.toString(timePicker.getHour());
            minute = Integer.toString(timePicker.getMinute());
        }
        else {
            hour = Integer.toString(timePicker.getCurrentHour());
            minute = Integer.toString(timePicker.getCurrentMinute());
        }

        txtShowTime.setText(hour + ":" + minute);
    }
}
