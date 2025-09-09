package com.example.landmarkbookjava;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.example.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

 //       setContentView(R.layout.activity_main);

        landmarkArrayList = new ArrayList<>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffiel = new Landmark("Eiffiel","France",R.drawable.eiffiel);
        Landmark colesseum = new Landmark("Colesseum", "Italy",R.drawable.colesseum);
        Landmark londonBridge = new Landmark("London Bridge","UK",R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffiel);
        landmarkArrayList.add(colesseum);
        landmarkArrayList.add(londonBridge);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}