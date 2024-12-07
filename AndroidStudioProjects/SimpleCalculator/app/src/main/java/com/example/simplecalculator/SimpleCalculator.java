package com.example.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class SimpleCalculator extends Activity {
    EditText firstNumber,secondNumber;
    TextView result;
    Button btnAdd,btnclear;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.simple_calculator);
        firstNumber=findViewById(R.id.editFirst);
        secondNumber=findViewById(R.id.editSecond);
        result=findViewById(R.id.textView2);
        btnAdd=findViewById(R.id.btnAdd);
        btnclear=findViewById(R.id.btnClear);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first,second,sum;
                first= Integer.parseInt(firstNumber.getText().toString());
                second= Integer.parseInt(secondNumber.getText().toString());
                sum=first+second;
                result.setText(String.valueOf(sum));

            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber.setText("");
                secondNumber.setText("");
                result.setText("");
            }
        });

    }
}
