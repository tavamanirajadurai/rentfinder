package com.example.rentfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        ImageView signin = (ImageView) findViewById(R.id.imageView4);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(login.this, dashboard.class);
                startActivity(send);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(login.this, signup.class);
                startActivity(send);
            }
        });
    }
}