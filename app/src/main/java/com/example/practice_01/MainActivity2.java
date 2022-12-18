package com.example.practice_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editTextNumber , editTextNumber2 , editTextNumber3;
    Button button2 , button3 , button4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(editTextNumber.getText().toString());
                double y = x;
                x = (x*9/5) + 32;
                y = (y) + 273.15;
                String yy = String.valueOf(y);
                String xx = String.valueOf(x);
                editTextNumber2.setText(xx);
                editTextNumber3.setText(yy);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x  = Integer.parseInt(editTextNumber2.getText().toString());
                double y = x;
                y = (y-32)*5/9+273.15;
                x = (x-32)*5/9;
                String yy = String.valueOf(y);
                String xx = String.valueOf(x);
                editTextNumber3.setText(yy);
                editTextNumber.setText(xx);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(editTextNumber3.getText().toString());
                double y = x;
                x = x - 273.15;
                y = (y-273.15) * (9/5) + 32;
                String xx = String.valueOf(x);
                String yy = String.valueOf(y);
                editTextNumber.setText(xx);
                editTextNumber2.setText(yy);
            }
        });
    }
}