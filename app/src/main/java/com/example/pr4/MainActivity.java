package com.example.pr4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStepAge(View view) {
        setContentView(R.layout.step_2);
    }

    public void onStepSex(View view) {
        setContentView(R.layout.step_3);
    }

    public void onStepEmail(View view) {
        setContentView(R.layout.step_4);
    }
}