package com.example.landmarkbookjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark selectedLandmark = (Landmark) getIntent().getSerializableExtra("landmark");

        if (selectedLandmark != null) {
            binding.nameText.setText(selectedLandmark.name);
            binding.countryText.setText(selectedLandmark.country);
            binding.imageView.setImageResource(selectedLandmark.image);
        }
    }
}
