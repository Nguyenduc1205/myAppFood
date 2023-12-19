package com.example.myappfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import model.account;

public class Loginlayout extends AppCompatActivity {

    Button btn_sigin;
    TextView signup;
    TextInputEditText txt_username, txt_pasword;
    private ArrayList<account> list_accounts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginlayout);
        Anhxa();

        btn_sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list_accounts = getIntent().getParcelableArrayListExtra("list_array_account");
                if(txt_username.getText().toString().isEmpty() || txt_pasword.getText().toString().isEmpty())
                {
                    Toast.makeText(Loginlayout.this, "vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                } else if (txt_username.getText().toString().equals("admin") && txt_pasword.getText().toString().equals("123")) {
                    Intent i = new Intent(Loginlayout.this, MainActivity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(Loginlayout.this, "Login successfully!", Toast.LENGTH_SHORT).show();
                }

                for(account list_account : list_accounts)
                {
                    if (list_accounts == null)
                    {
                        Toast.makeText(Loginlayout.this, "accoount in valid!", Toast.LENGTH_SHORT).show();
                    }
                    else if(list_account.getUsername().equals(txt_username.getText().toString()) && list_account.getPassword().equals(txt_pasword.getText().toString())) {

                        Intent i = new Intent(Loginlayout.this, MainActivity.class);
                        startActivity(i);
                        finish();
                        Toast.makeText(Loginlayout.this, "Login successfully!", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(Loginlayout.this, "Login not successfully!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginlayout.this, Register.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public void Anhxa(){
        btn_sigin = findViewById(R.id.buttonsigin);
        signup = findViewById(R.id.signUp);
        txt_username = findViewById(R.id.textUsername);
        txt_pasword = findViewById(R.id.textpassword);
    }
}