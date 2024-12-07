package com.example.alertdialogexample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyActivity extends Activity {
    Button btnQuit,btnCalculator;//Create reference variable
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);//setcontentview le activity(layout file) ko sabai object call garxa
        btnQuit=findViewById(R.id.btnQuit);//link garna kaam garxa wa point garne kaam garxa
        btnCalculator=findViewById(R.id.btnCalculator);
        btnQuit.setOnClickListener(new View.OnClickListener() { //that will run
            @Override
            public void onClick(View v) {
                showMyDialog();

            }
        });
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMyCustomDialog();
            }
        });
    }
    protected void showMyCustomDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MyActivity.this);//AlertDialog.Builder vanne class le alert build gerxa
        builder.setTitle("Confirm Quit");//set box title
        builder.setCancelable(true);
        LayoutInflater inflater=getLayoutInflater();//create java object in terms of xml layout
        View v=inflater.inflate(R.layout.my_calculator,null);//object banera v naam lo view ma aayera basyo
        Button btnCancel=v.findViewById(R.id.btnCancel);
        Button btnAdd=v.findViewById(R.id.btnAdd);
        EditText editFirstNumber=v.findViewById(R.id.editFirstNumber);
        EditText editSecondNumber=v.findViewById(R.id.editSecondNumber);
        TextView txtResult=v.findViewById(R.id.txtResult);

        builder.setView(v);
        AlertDialog dialog=builder.create();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1=Float.parseFloat(editFirstNumber.getText().toString());
                float n2=Float.parseFloat(editSecondNumber.getText().toString());
                float sum=n1+n2;
                txtResult.setText(String.valueOf(sum));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
        dialog.show();

    }
    protected void showMyDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MyActivity.this);//AlertDialog.Builder vanne class le alert build gerxa
        builder.setTitle("Confirm Quit");//set box title
        builder.setMessage("Are You sure yo want to Quit this application");//set message or text youwant to show
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                finishAffinity(); //it will close all application
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();

            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
