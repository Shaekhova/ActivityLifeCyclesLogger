package com.example.lili.activitylifecycleslogger;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView = null;
    Button button = null;
    EditText editText = null;
    static final String USER_TEXT = "textField2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("OnCreateA1");
        textView = (TextView) findViewById(R.id.mainText);
        editText = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.MainButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(USER_TEXT, editText.getText().toString());
                startActivity(intent);
            }
        });



    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        System.out.println("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        System.out.println("onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("OnStartA1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("OnResumeA1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("OnPauseA1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("OnStopA1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("OnDestroyA1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");
    }
}

