package com.example.heartsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class golActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gol);
    }
    public void geri (View view){
        Intent intent = new Intent(golActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}