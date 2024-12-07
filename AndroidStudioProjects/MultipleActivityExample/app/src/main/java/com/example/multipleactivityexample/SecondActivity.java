package com.example.multipleactivityexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    TextView txtResult;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.second_activity);
        txtResult=findViewById(R.id.textResult);
        Intent i=getIntent();
        String name=i.getStringExtra("LoginName");
        String pass=i.getStringExtra("LoginPassword");
        txtResult.setText("Hello"+name +"your password is"+ pass);

    }

}
