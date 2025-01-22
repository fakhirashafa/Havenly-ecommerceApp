package com.example.havenlyfashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    private ImageButton productbtn, cartbtn, historybtn, mapbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        productbtn = findViewById(R.id.productbtn);
        mapbtn = findViewById(R.id.mapbtn);
        cartbtn = findViewById(R.id.cartbtn);
        historybtn = findViewById(R.id.historybtn);

        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, offlineStore.class);
                startActivity(intent);
            }
        });

        productbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, productActivity.class);
                startActivity(intent);
            }
        });

        cartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, Cart.class);
                startActivity(intent);
            }
        });

        historybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

    }

}