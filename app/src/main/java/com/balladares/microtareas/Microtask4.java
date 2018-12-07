package com.balladares.microtareas;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Microtask4 extends AppCompatActivity {

    TextView txtShowOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microtask4);

        txtShowOption = findViewById(R.id.txtShowOption);
    }


    public void openSelectDialog(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final String[] options = getResources().getStringArray(R.array.colors);

        builder .setTitle(R.string.SelectDialogTitle)
                .setItems(options, new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int option){
                        txtShowOption.setText(options[option]);
                    }
        });

        builder.show();

    }

    public void openProgressBarDialog(View view){
        final ProgressDialog progress;

        progress = ProgressDialog.show(this, getResources().getString(R.string.ProgressBarDialogTitle),
                getResources().getString(R.string.ProgressBarDialogMessage), true, true);


        new Thread(new Runnable() {
            @Override
            public void run() {
                android.os.SystemClock.sleep(3000); // The length to 'pause' for
                progress.dismiss();
            }
        }).start();


    }


}
