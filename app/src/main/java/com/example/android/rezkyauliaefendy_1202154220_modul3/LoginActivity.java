package com.example.android.rezkyauliaefendy_1202154220_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {
        //inisiasi dari EditText
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        String message;
        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")) {
            //jika berhasil melakukan login
            message = "Anda Berhasil Login..!";
            startActivity(new Intent(this, MainActivity.class));
        } else {
            //jika gagal melakukan login
            message = "Anda Gagal Melakukan Login, Mohon Login Kembali";
            finish();
            startActivity(getIntent());
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
