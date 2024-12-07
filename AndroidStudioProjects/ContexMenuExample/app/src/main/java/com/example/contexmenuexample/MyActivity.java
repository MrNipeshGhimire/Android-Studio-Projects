package com.example.contexmenuexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {
    EditText editFirstNumber,editSecondNumber;
Button btnCalcualte;
//TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        editFirstNumber=findViewById(R.id.editFirstNumber);
        editSecondNumber=findViewById(R.id.editSecondNumber);
        //txtResult=findViewById(R.id.txtResult);
        btnCalcualte=findViewById(R.id.btnCalculate);
        registerForContextMenu(btnCalcualte);//attach the context menu to button(Button click garda context view ko kur dekhauxa)
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater(); //inflator ko kaam hamile design gare aanusar ko object create garne hoo
        inflater.inflate(R.menu.my_contex_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        float firstNumber,secondNumber,result;
        firstNumber=Float.valueOf(editFirstNumber.getText().toString());
        secondNumber=Float.valueOf(editSecondNumber.getText().toString());

        if (item.getItemId()==R.id.mnuAdd){
            result=firstNumber+secondNumber;
            showResult("Sum:"+String.valueOf(result));

        } else if (item.getItemId()==R.id.mnuSub) {
            result=firstNumber-secondNumber;
            showResult("Difference:"+String.valueOf(result));

        } else if (item.getItemId()==R.id.mnuMul) {
            result=firstNumber*secondNumber;
            showResult("Product:"+String.valueOf(result));

        } else {
            if(secondNumber!=0.0){
                result=firstNumber/secondNumber;
                showResult("Quotient"+String.valueOf(result));
            }else {
                result = 0;
            }

        }
       // txtResult.setText(String.valueOf(result));
        return super.onContextItemSelected(item);
    }
    public void showResult(String msg){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Result!!");
        builder.setCancelable(true);
        builder.setMessage(msg);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        AlertDialog dlg=builder.create();
        dlg.show();
    }
}
