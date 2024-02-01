package com.example.milksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class customerLogin extends AppCompatActivity {
    EditText edUser, edPass;
    Button bLogin, bReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPass);
        bLogin = findViewById(R.id.bLogin);
        bReset = findViewById(R.id.bReset);

    }

    public void userLogin(View view) {
        Toast.makeText(this, "Login ho gya", Toast.LENGTH_SHORT).show();
    }

    public void resetPage(View view) {
        edUser.setText("");
        edPass.setText("");
        edUser.requestFocus();
        Toast.makeText(this, "Reset ho gya", Toast.LENGTH_SHORT).show();
    }
}