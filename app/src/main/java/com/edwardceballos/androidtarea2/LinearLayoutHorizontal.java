package com.edwardceballos.androidtarea2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class LinearLayoutHorizontal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_horizontal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.BLACK);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.RED);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            }
        });
    }

}
