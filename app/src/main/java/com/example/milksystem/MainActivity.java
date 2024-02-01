package com.example.milksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bUser, bAdmin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bUser = findViewById(R.id.bUser);
        bAdmin = findViewById(R.id.bAdmin);
    }

    public void userLoginPage(View view) {
        Intent i = new Intent(this,customerLogin.class);
        startActivity(i);
    }
    public void adminLoginPage(View view) {
        Toast.makeText(this,"Admin button clicked", Toast.LENGTH_SHORT).show();
    }

}