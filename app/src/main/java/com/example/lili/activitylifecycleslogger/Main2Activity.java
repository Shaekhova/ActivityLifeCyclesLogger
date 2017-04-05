package com.example.lili.activitylifecycleslogger;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        System.out.println("OnCreateA2");
        TextView textView = (TextView) findViewById(R.id.textView1);

        Intent intent = getIntent();
        String textFieldValue = intent.getStringExtra(MainActivity.USER_TEXT);
        textView.setText(textFieldValue);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("OnStartA2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("OnResumeA2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("OnPauseA2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("OnStopA2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("OnDestroyA2");
    }
}
