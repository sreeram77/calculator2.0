package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calcDisplay;
    Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0;
    Button btnAdd, btnEquals, btnMul, btnSub, btnDiv;
    Calc calc = new Calc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcDisplay = findViewById(R.id.calcDisplay);
        btnNum1 = findViewById(R.id.buttonNum1);
        btnNum2 = findViewById(R.id.buttonNum2);
        btnNum3 = findViewById(R.id.buttonNum3);
        btnNum4 = findViewById(R.id.buttonNum4);
        btnNum5 = findViewById(R.id.buttonNum5);
        btnNum6 = findViewById(R.id.buttonNum6);
        btnNum7 = findViewById(R.id.buttonNum7);
        btnNum8 = findViewById(R.id.buttonNum8);
        btnNum9 = findViewById(R.id.buttonNum9);
        btnNum0 = findViewById(R.id.buttonNum0);
        btnAdd = findViewById(R.id.buttonAdd);
        btnSub = findViewById(R.id.buttonSub);
        btnDiv = findViewById(R.id.buttonDiv);
        btnMul = findViewById(R.id.buttonMul);
        btnEquals = findViewById(R.id.buttonEqual);

        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(1)));
            }
        });

        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(2)));
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(3)));
            }
        });

        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(4)));
            }
        });

        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(5)));
            }
        });

        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(6)));
            }
        });

        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(7)));
            }
        });

        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(8)));
            }
        });

        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(9)));
            }
        });

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcDisplay.setText(Double.toString(getDisplayNumber(0)));
            }
        });

    }

    public double getDisplayNumber(double num){

        if (calc.getDispNum() != 0) {
            num = (calc.getDispNum() * 10) + num;
        }
        calc.setDispNum(num);
        return num;
    }
}
