package com.example.test.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText1;
    EditText editText2;

    Button PlusButton;
    Button Minusbutton;
    Button MultiplyButton;
    Button DivideButton;

    TextView textView;

    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        PlusButton = (Button) findViewById(R.id.PlusButton);
        Minusbutton = (Button) findViewById(R.id.Minusbutton);
        MultiplyButton = (Button) findViewById(R.id.MultiplyButton);
        DivideButton = (Button) findViewById(R.id.DivideButton);

        textView = (TextView) findViewById(R.id.textView);


        //обработчик

        PlusButton.setOnClickListener(this);
        Minusbutton.setOnClickListener(this);
        MultiplyButton.setOnClickListener(this);
        DivideButton.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        float firstNumber = 0;
        float secondNumber = 0;
        float resultNumber = 0;

        if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty((editText2.getText().toString()))){

            return;
        }

        firstNumber = Float.parseFloat(editText1.getText().toString());
        secondNumber = Float.parseFloat(editText2.getText().toString());


        switch (v.getId()) {
            case R.id.PlusButton:
                operation = "+";
                resultNumber = firstNumber + secondNumber;
                break;

            case R.id.Minusbutton:
                operation = "-";
                resultNumber = firstNumber - secondNumber;
                break;

            case R.id.MultiplyButton:
                operation = "*";
                resultNumber = firstNumber * secondNumber;
                break;

            case R.id.DivideButton:
                operation = "/";
                resultNumber = firstNumber / secondNumber;
                break;
            default:
                break;

        }


        textView.setText(firstNumber + " " + operation + " " + secondNumber + " = " + resultNumber);


        }

    }

