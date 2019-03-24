package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView calcDisplay;
    Button btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0;
    Button btnAdd, btnEquals, btnMul, btnSub, btnDiv;

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

    }
}
