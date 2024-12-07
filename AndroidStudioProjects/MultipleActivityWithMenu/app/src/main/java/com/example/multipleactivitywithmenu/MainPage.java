package com.example.multipleactivitywithmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multipleactivitywithmenu.R;

public class MainPage extends AppCompatActivity {
    EditText txtResult;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.main_page);
        txtResult=findViewById(R.id.txtResult);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater i= getMenuInflater();
        i.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId()==R.id.mnuRegister){
            Intent i=new Intent(this,RegisterPage.class);
            startActivity(i);
        }
        else  if (item.getItemId()==R.id.mnuLogin){
            Intent i=new Intent(this,LoginPage.class);
            startActivityForResult(i,1001);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==1001){
            String name=data.getStringExtra("Name");
            String pass=data.getStringExtra("Password");
            txtResult.getText().append("Hello"+name+"your password is:"+pass);

        } else if (resultCode==1002) {
            txtResult.getText().append("You are registered");

        }
    }
}
