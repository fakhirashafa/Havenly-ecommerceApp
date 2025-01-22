package com.example.havenlyfashion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class productActivity extends AppCompatActivity {
    private RecyclerView rvProduct;
    private ArrayList<Product> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        rvProduct = findViewById(R.id.rv_product);
        rvProduct.setHasFixedSize(true);

        list.add(new Product("Black High Waist Pleated Skirt", "Rp 269.000", R.drawable.black_skirt));
        list.add(new Product("Blazer houndsthooth", "Rp 559.000", R.drawable.blazer ));
        list.add(new Product("Loose Straight High Jeans", "Rp 669.000", R.drawable.jeans ));
        list.add(new Product("Green Sleeveblouse", "Rp 379.000", R.drawable.blouse ));
        list.add(new Product("Signature Cream Sweater", "Rp 449.000", R.drawable.sweater ));
        list.add(new Product("Snake Shirt", "Rp 249.000", R.drawable.snake ));
        list.add(new Product("Taylor Swift T-Shirt", "Rp 229.000", R.drawable.taylor ));
        list.add(new Product("Minimalist Dress - Blue Sky", "Rp 299.000", R.drawable.dress ));
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
        ListProductAdapter listProductAdapter = new ListProductAdapter(list);
        rvProduct.setAdapter(listProductAdapter);
    }
}
