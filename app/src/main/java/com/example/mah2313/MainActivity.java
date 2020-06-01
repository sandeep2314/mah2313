package com.example.mah2313;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Product> productList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView = findViewById(R.id.recyclerView_activity_main);
       recyclerView.setHasFixedSize(true);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));

       productList = new ArrayList<>();
        productList.add(
                new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.cc));

        productList.add(
                new Product(
                        1,
                        "Sony PlayStation 4 Pro 1TB Console - Black (PS4 Pro)",
                        "20.3 inch, Silver, 5.35 kg",
                        4.3,
                        24000,
                        R.drawable.arju));



        productList.add(
                new Product(
                        1,
                        "PlayStation 4 Pro 1TB Limited Edition Console - Marvel's Spider-Man Bundle ",
                        "15.3 inch, red, 5.35 kg",
                        4.3,
                        5000,
                        R.drawable.arjun));


        productList.add(
                new Product(
                        1,
                        "Buy The Amazing Spider-Man 2 (PS4) Online at Low Prices in India ",
                        "19.3 inch, red, 2.35 kg",
                        4.3,
                        1034,
                        R.drawable.tasm2));





        productList.add(
                new Product(
                        1,
                        "Buy The Amazing Spider-Man  (PS3) Online at Low Prices in India ",
                        "19.3 inch, red, 2.35 kg",
                        4.3,
                        949,
                        R.drawable.tasm));





        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);



    }
}
