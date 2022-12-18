package com.example.practice_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView edittext1 , edittext2 , edittext3 ;
    Button btn1 , btn2 , btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edittext1 = findViewById(R.id.editTextNumberDecimal);
        edittext2 = findViewById(R.id.editTextNumberDecimal2);
        edittext3 = findViewById(R.id.editTextNumberDecimal3);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button10);
        btn3 = findViewById(R.id.button12);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(edittext1.getText().toString());
                double y = x;
                x = x/1000;
                y = y/1609.344;
                String yy = String.valueOf(y);
                String xx = String.valueOf(x);
                edittext2.setText(xx);
                edittext3.setText(yy);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(edittext2.getText().toString());
                double y = x;
                x = x*1000;
                y = y * 0.6214;
                String xx = String.valueOf(x);
                String yy = String.valueOf(y);
                edittext1.setText(xx);
                edittext3.setText(yy);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(edittext3.getText().toString());
                double y = x;
                x = x * 1609.344;
                y = y * 1.609344;
                String xx = String.valueOf(x);
                String yy = String.valueOf(y);
                edittext1.setText(xx);
                edittext2.setText(yy);
            }
        });
    }
}