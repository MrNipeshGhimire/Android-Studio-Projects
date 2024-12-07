package com.example.activitytest2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    EditText editName,editPassword,editPhone;
    Button btnSubmit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        editName=findViewById(R.id.editName);
        editPassword=findViewById(R.id.editPassword);
        editPhone=findViewById(R.id.editPhone);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getIntent();//duita class ya object ko bich ma communicate garauxa
                i.putExtra("Name",editName.getText().toString());
                //PutExtra le data intent le lane bokxa
                i.putExtra("Password",editPassword.getText().toString());
                i.putExtra("Phone",editPhone.getText().toString());
                setResult(101,i);
                finish();
            }
        });
    }


}
