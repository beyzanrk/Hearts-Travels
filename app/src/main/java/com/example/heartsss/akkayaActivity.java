package com.example.heartsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akkayaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akkaya);
    }
    public void geri (View view){
        Intent intent = new Intent(akkayaActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}