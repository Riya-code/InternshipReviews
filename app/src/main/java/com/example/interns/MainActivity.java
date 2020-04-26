package com.example.interns;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CityInfo> data;
    RecyclerView recyclerView;
    CityAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);

        data = new ArrayList<>();

        data.add(new CityInfo("Student1", "info"));
        data.add(new CityInfo("Student2", "info"));
        data.add(new CityInfo("Student3", "info"));
        data.add(new CityInfo("Student4", "info"));
        data.add(new CityInfo("Student5", "info"));
        data.add(new CityInfo("Student6", "info"));
        data.add(new CityInfo("Student7", "info"));
        data.add(new CityInfo("Student8", "info"));
        data.add(new CityInfo("Student9", "info"));
        data.add(new CityInfo("Student10", "info"));
        data.add(new CityInfo("Student11", "info"));
        data.add(new CityInfo("Student12", "info"));
        data.add(new CityInfo("Student13", "info"));
        data.add(new CityInfo("Student14", "info"));
        data.add(new CityInfo("Student15", "info"));
        data.add(new CityInfo("Student16", "info"));
        data.add(new CityInfo("Student17", "info"));
        data.add(new CityInfo("Student18", "info"));
        data.add(new CityInfo("Student19", "info"));
        data.add(new CityInfo("Student20", "info"));



        cityAdapter = new CityAdapter(data);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(cityAdapter);
    }
}
