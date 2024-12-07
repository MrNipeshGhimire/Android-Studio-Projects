package com.example.multipleactivitywithmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    EditText editName,editPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.login_page);
        editName=findViewById(R.id.editName);
        editPassword=findViewById(R.id.editPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=getIntent();
                i.putExtra("Name",editName.getText().toString());
                i.putExtra("Password",editPassword.getText().toString());
                setResult(1001,i);
                finish();
            }
        });
    }
}
