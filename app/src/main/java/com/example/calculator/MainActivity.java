package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etTextNumber1,etTextNumber2;
    TextView tv_result;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTextNumber1 = findViewById(R.id.editTextNumber1);
        etTextNumber2 = findViewById(R.id.editTextNumber2);
        tv_result = findViewById(R.id.textView_result);


    }

    public boolean getNumber()
    {
        String s1,s2;
        s1 = etTextNumber1.getText().toString();
        s2 = etTextNumber2.getText().toString();
        if(s1.equals(null)||s2.equals(null)||s1.equals("")||s2.equals(""))
        {
            tv_result.setText("please enter the number");
            return false;
        }
        else
        {

            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
            return true;
        }


    }

    public void Addition(View view) {
        if(getNumber()){
            int result = num1 + num2;
            tv_result.setText(String.valueOf(result));

        }
    }
    public void Subtraction(View view) {
        if(getNumber()){
            int result = num1 - num2;
            tv_result.setText(String.valueOf(result));

        }
    }
    public void Multiplication(View view) {
        if(getNumber()){
            int result = num1 * num2;
            tv_result.setText(String.valueOf(result));

        }
    }
    public void Divison(View view) {
        if(getNumber())
        {
            if (num2 != 0)
            {
                int result = num1 / num2;
                tv_result.setText(String.valueOf(result));

            }

            else
            {
                tv_result.setText("Infinity");
            }

        }
    }
}