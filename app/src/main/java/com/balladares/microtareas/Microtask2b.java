package com.balladares.microtareas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Microtask2b extends AppCompatActivity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microtask2b);

        browser = findViewById(R.id.webView);

        browser.loadUrl("http://www.espol.edu.ec");
    }
}
