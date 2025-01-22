package com.example.havenlyfashion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class offlineStore extends AppCompatActivity implements View.OnClickListener {

    private ImageButton backbtn, mapabtn, mapbbtn, mapcbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        mapabtn = findViewById(R.id.mapabtn);
        mapbbtn = findViewById(R.id.mapbbtn);
        mapcbtn = findViewById(R.id.mapcbtn);
        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(this);
        mapabtn.setOnClickListener(this);
        mapbbtn.setOnClickListener(this);
        mapcbtn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backbtn:
                // back to dashboard
                onBackPressed();
                break;
            case R.id.mapabtn:
                //MapA
                Intent mapAIntent = new Intent(offlineStore.this, MapA.class);
                startActivity(mapAIntent);
                break;
            case R.id.mapbbtn:
                // MapB
                Intent mapBIntent = new Intent(offlineStore.this, mapB.class);
                startActivity(mapBIntent);
                break;
            case R.id.mapcbtn:
                // MapC
                Intent mapCIntent = new Intent(offlineStore.this, mapC.class);
                startActivity(mapCIntent);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
