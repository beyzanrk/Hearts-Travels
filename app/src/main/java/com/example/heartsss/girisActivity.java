package com.example.heartsss;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.heartsss.databinding.ActivityGirisBinding;

public class girisActivity extends AppCompatActivity {
    private ActivityGirisBinding binding;
    EditText username;
    EditText sifre;
    Button button;
    SQLiteDatabase database;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_giris);
        binding =ActivityGirisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        username=findViewById(R.id.username);
        sifre=findViewById(R.id.sifre);
        button=findViewById(R.id.button);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.username.getText().toString();
                String sifre = binding.sifre.getText().toString();
                boolean checkCredentials = false;
                if (username.equals("") || sifre.equals(""))
                    Toast.makeText(girisActivity.this, "Lütfen giriş yapınız ", Toast.LENGTH_SHORT).show();
                else {
                    checkCredentials = true;
                    Toast.makeText(girisActivity.this, "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }


    public void giris(View view) {
        Intent intent = new Intent(girisActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

        String username = binding.username.getText().toString();
        String sifre = binding.sifre.getText().toString();

            try{
            database = this.openOrCreateDatabase("user", MODE_PRIVATE, null);
            database.execSQL("CREATE TABLE İF NOT EXISTS user (id INTEGER PRIMARY KEY, username VARCHAR, sifre VARCHAR)");
            String sqlstring = "INSERT INTO user(username, sifre) VALUES(?, ?)";
            SQLiteStatement sqLiteStatement = database.compileStatement(sqlstring);
            sqLiteStatement.bindString(1, username);
            sqLiteStatement.bindString(2, sifre);
            sqLiteStatement.execute();
            }catch (Exception e){
             e.printStackTrace();         }
    }}

