package com.example.havenlyfashion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private RecyclerView rvHistory;
    private ArrayList<History> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        rvHistory = findViewById(R.id.rv_history);
        rvHistory.setHasFixedSize(true);

        list.add(new History("AB125FK9","Black High Waist Pleated Skirt", "Rp 269.000", R.drawable.black_skirt));
        list.add(new History("JD547LC2","Green Sleeveblouse", "Rp 379.000", R.drawable.blouse));
        list.add(new History("FC376EK0", "Signature Cream Sweater", "Rp 449.000", R.drawable.sweater ));
        list.add(new History("WX406VY1", "Taylor Swift T-Shirt", "Rp 229.000", R.drawable.taylor ));

        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHistory.setLayoutManager(new LinearLayoutManager(this));
        ListHistoryAdapter listHistoryAdapter = new ListHistoryAdapter(list);
        rvHistory.setAdapter(listHistoryAdapter);
    }

}