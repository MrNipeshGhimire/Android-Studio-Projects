package com.example.activitytest2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FirstActivity extends Activity {
    Button btnNew;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        btnNew=findViewById(R.id.btnNew);//R means resource id assigned that item
        txtResult=findViewById(R.id.txtResult);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FirstActivity.this,SecondActivity.class);
                startActivityForResult(i,101);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==101){
            String name=data.getStringExtra("Name");//getStringExtra le put extra ko content get garxa
            String pass=data.getStringExtra("Password");
            String phone=data.getStringExtra("Phone");
            String result=txtResult.getText().toString()+"Result from Second activity\n"+"Name:"+name+"\nPassword"+pass+"\nPhone"+phone;
            txtResult.setText(result);
        }
    }
}
