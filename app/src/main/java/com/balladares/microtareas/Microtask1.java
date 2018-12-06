package com.balladares.microtareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class Microtask1 extends AppCompatActivity {

    RatingBar ratingBar;
    EditText txtInputComment;
    TextView txtShowRating;
    TextView txtShowComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microtask1);

        ratingBar       = findViewById(R.id.ratingBar);
        txtInputComment = findViewById(R.id.txtInputComment);
        txtShowRating   = findViewById(R.id.txtShowRating);
        txtShowComment  = findViewById(R.id.txtShowComment);


    }

    public void SendComment(View v){
        txtShowRating.setText(Float.toString(ratingBar.getRating()));
        txtShowComment.setText(txtInputComment.getText().toString());
    }
}
