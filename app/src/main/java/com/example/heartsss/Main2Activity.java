package com.example.heartsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void yedi (View view){
        Intent intent = new Intent(Main2Activity.this,yediActivity.class);
        startActivity(intent);
    }
    public void gol (View view){
        Intent intent = new Intent(Main2Activity.this,golActivity.class);
        startActivity(intent);
    }
    public void abant (View view){
        Intent intent = new Intent(Main2Activity.this,abantActivity.class);
        startActivity(intent);
    }
    public void akkaya (View view){
        Intent intent = new Intent(Main2Activity.this,akkayaActivity.class);
        startActivity(intent);
    }
    public void izzet (View view){
        Intent intent = new Intent(Main2Activity.this,izzetActivity.class);
        startActivity(intent);
    }
    public void geri (View view){
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}