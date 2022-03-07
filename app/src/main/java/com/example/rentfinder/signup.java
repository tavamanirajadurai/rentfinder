package com.example.rentfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ImageView img = (ImageView) findViewById(R.id.imageView5);
        ImageView sign = (ImageView) findViewById(R.id.imageView4);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Signup successful..!",Toast.LENGTH_SHORT).show();
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(signup.this, login.class);
                startActivity(send);
            }
        });
    }
}