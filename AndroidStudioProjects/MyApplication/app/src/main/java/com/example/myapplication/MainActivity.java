package com.example.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends Activity {
    Button btnNew;
     RecyclerView myRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        btnNew = findViewById(R.id.btnNew);
        myRecyclerView = findViewById(R.id.myRecyclerView);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }
    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add New Student");
        builder.setCancelable(false);

        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.dialog_layout,null);

        AlertDialog dlg = builder.create();
        dlg.show();


    }
}
