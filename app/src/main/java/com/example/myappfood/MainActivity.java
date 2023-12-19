package com.example.myappfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.AsiaFoodAdapter;
import adapter.PopularFoodAdapter;
import model.AsiaFood;
import model.PopularFood;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    AsiaFoodAdapter asiaFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       //truyền vào thông tin món ăn;

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka Stick", "$25.05", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);


        List<AsiaFood> asiaFoodList = new ArrayList<>();
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));
        asiaFoodList.add(new AsiaFood("Chicago Pizza", "$20", R.drawable.asiafood1, "4.5", "Briand Restaurant"));
        asiaFoodList.add(new AsiaFood("Straberry Cake", "$25", R.drawable.asiafood2, "4.2", "Friends Restaurant"));

        setAsiaRecycler(asiaFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList) {
        // Gán view của RecyclerView từ layout cho biến popularRecycler
        popularRecycler = findViewById(R.id.popular_recycler);

        // Tạo LayoutManager để quản lý giao diện của RecyclerView theo chiều ngang;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        // Đặt LayoutManager cho RecyclerView
        popularRecycler.setLayoutManager(layoutManager);

        // Tạo adapter và gán danh sách PopularFood vào
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);

        // Đặt adapter cho RecyclerView
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setAsiaRecycler(List<AsiaFood> asiaFoodList) {
        // Gán view của RecyclerView từ layout cho biến asiaRecycler
        asiaRecycler = findViewById(R.id.asia_recycler);

        // Tạo LayoutManager để quản lý giao diện của RecyclerView theo chiều dọc
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        // Đặt LayoutManager cho RecyclerView
        asiaRecycler.setLayoutManager(layoutManager);

        // Tạo adapter và gán danh sách AsiaFood vào
        asiaFoodAdapter = new AsiaFoodAdapter(this, asiaFoodList);

        // Đặt adapter cho RecyclerView
        asiaRecycler.setAdapter(asiaFoodAdapter);
    }
}