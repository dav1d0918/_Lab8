package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.CustomList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Declare the variables so that you will be able to reference it later.
    ListView cityList;
    ArrayAdapter<com.example.myapplication.City> cityAdapter;
    ArrayList<com.example.myapplication.City> cityDataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);
        cityDataList = new ArrayList<>();

        cityDataList.add(new com.example.myapplication.City("Edmonton","AB"));
        cityDataList.add(new com.example.myapplication.City("Vancouver","BC"));
        cityDataList.add(new com.example.myapplication.City("Toronto","ON"));
        cityDataList.add(new com.example.myapplication.City("Hamilton","ON"));
        cityDataList.add(new com.example.myapplication.City("Calgary","AB"));
        cityDataList.add(new com.example.myapplication.City("Waterloo","ON"));


        cityAdapter = new CustomList(this,cityDataList);
        cityList.setAdapter(cityAdapter);

    }
}