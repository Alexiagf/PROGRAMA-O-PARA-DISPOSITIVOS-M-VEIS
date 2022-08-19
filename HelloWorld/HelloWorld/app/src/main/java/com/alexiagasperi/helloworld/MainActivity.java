package com.alexiagasperi.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int   i = 0;
    TextView t = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t.setText(R.string.teste);

        Button b = findViewById(R.id.button);
        b.setText(R.string.buttonclick);


    }
        public void contaClick(View v){
            i++;
            t.setText(Integer.toString(i));
        }
    }