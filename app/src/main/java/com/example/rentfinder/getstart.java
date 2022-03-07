package com.example.rentfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class getstart extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstart);
        ImageView img = (ImageView) findViewById(R.id.getbut);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(getstart.this, login.class);
                startActivity(send);
            }
        });
    }
}