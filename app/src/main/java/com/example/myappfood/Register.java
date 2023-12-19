package com.example.myappfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import model.account;

public class Register extends AppCompatActivity {

    Button btn_register;
    TextInputEditText txt_Username, txt_password;
    TextView signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Anhxa();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<account> list_array_account = new ArrayList<>();
                String userName = txt_Username.getText().toString();
                String passWord = txt_password.getText().toString();

                if(userName.toString().isEmpty() || passWord.toString().isEmpty())
                {
                    Toast.makeText(Register.this, "vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                } else {
                    account acc = new account(userName, passWord);
                    list_array_account.add(acc);
                    Toast.makeText(Register.this, "Sign up successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Register.this, Loginlayout.class);
                    intent.putParcelableArrayListExtra("list_array_account", list_array_account);
                    startActivity(intent);
                    finish();
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Register.this, Loginlayout.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void Anhxa(){
         btn_register = findViewById(R.id.buttonRegister);
         txt_Username = findViewById(R.id.txtUsername);
         txt_password = findViewById(R.id.txtpassword);
         signin = findViewById(R.id.signUp);
    }
}