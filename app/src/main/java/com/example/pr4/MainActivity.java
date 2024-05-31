package com.example.pr4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onStepAge(View view) {
        EditText _name = findViewById(R.id.editText);
        String strName = _name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv = findViewById(R.id.textView2);
        tv.setText("Очень приятно познакомиться " +strName+".\nМеня зовут Споти.\n Сколько тебе лет?");
    }

    public void onStepSex(View view) {
        EditText age = findViewById(R.id.editText2);
        String strAge = age.getText().toString();
        setContentView(R.layout.step_3);
        TextView tv = findViewById(R.id.textView3);
        tv.setText("Ничего себе ты большой, целых " +strAge+ "лет\nnКакого ты пола?");
    }

    public void onStepEmail(View view) {
        setContentView(R.layout.step_4);
    }

    public void onStep5(View view) {
        setContentView(R.layout.step_5);
    }

    public void onStep6(View view ) {
        setContentView(R.layout.step_6);
    }
    public void onMessage(View view) {
        Toast.makeText(this, "Передал данные куда надо.", Toast.LENGTH_SHORT).show();
    }
}