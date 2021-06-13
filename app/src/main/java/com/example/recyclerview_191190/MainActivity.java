package com.example.recyclerview_191190;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<CountryData> countryData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countryData.add(new CountryData(12,"PAKISTAN","Urdu"));
        countryData.add(new CountryData(42,"INDIA","Hindi"));
        countryData.add(new CountryData(92,"AUSTRALIA","English"));
        countryData.add(new CountryData(38,"USA","English"));
        countryData.add(new CountryData(99,"ALBANIA","Dutch"));
        countryData.add(new CountryData(24,"AMERICA","English"));
        countryData.add(new CountryData(65,"SWITZERLAND","English"));
        countryData.add(new CountryData(67,"TURKEY","Turkish"));

        recyclerView = findViewById(R.id.rv_country);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerAdapter = new RecyclerAdapter(countryData,this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}