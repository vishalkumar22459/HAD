package com.example.practice_01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView edittext1 , edittext2 , edittext3 ;
    Button btn1 , btn2 , btn3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edittext1 = findViewById(R.id.editTextNumberDecimal4);
        edittext2 = findViewById(R.id.editTextNumberDecimal5);
        edittext3 = findViewById(R.id.editTextNumberDecimal6);

        btn1 = findViewById(R.id.button14);
        btn2 = findViewById(R.id.button15);
        btn3 = findViewById(R.id.button16);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(edittext1.getText().toString());
                double y = x;
                x = x/1000;
                y = y * 0.0022;
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
                y = y * 2.2;
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
                x = x * 453.592;
                y = y * 0.454;
                String xx = String.valueOf(x);
                String yy = String.valueOf(y);
                edittext1.setText(xx);
                edittext2.setText(yy);
            }
        });
    }
}