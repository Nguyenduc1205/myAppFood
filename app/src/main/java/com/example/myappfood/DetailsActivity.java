package com.example.myappfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailsActivity extends AppCompatActivity {


    ImageButton btn_nextTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        btn_nextTab = findViewById(R.id.imageView5);
        btn_nextTab.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}