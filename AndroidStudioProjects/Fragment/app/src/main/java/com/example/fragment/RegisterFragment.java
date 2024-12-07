package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class RegisterFragment extends Fragment {
    Button btnRegisterClear,btnRegisterNow;
    EditText editRegisterName,editRegisterPhone,editRegisterPassword;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.register_fragment,container,false);
        btnRegisterClear=v.findViewById(R.id.btnRegisterClear);
        btnRegisterNow=v.findViewById(R.id.btnRegisterNow);
        editRegisterName=v.findViewById(R.id.editRegisterName);
        editRegisterPhone=v.findViewById(R.id.editRegisterPhone);
        editRegisterPassword=v.findViewById(R.id.editRegisterPassword);
        btnRegisterClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editRegisterName.setText("");
                editRegisterPassword.setText("");
                editRegisterPhone.setText("");
            }
        });
        return v;
    }
}
