package com.example.rentfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ImageView img = (ImageView) findViewById(R.id.imageView11);
        ImageView imga = (ImageView) findViewById(R.id.imageView13);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(dashboard.this, housedetail.class);
                startActivity(send);
            }
        });
        imga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent send = new Intent(dashboard.this, housedetail.class);
                startActivity(send);
            }
        });
    }
}