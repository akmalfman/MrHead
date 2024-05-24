package com.example.mrhead;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbHair, cbEyebrow, cbMoustache, cbBeard;
    private ImageView imageHair, imageEyebrow, imageEye, imageBeard, imageMoustache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CheckBoxes
        cbHair = findViewById(R.id.cbHair);
        cbEyebrow = findViewById(R.id.cbEyebrow);
        cbMoustache = findViewById(R.id.cbMoustache);
        cbBeard = findViewById(R.id.cbBeard);

        // Initialize ImageViews
        imageHair = findViewById(R.id.imageHair);
        imageEyebrow = findViewById(R.id.imageEyebrow);
        imageMoustache = findViewById(R.id.imageMoustache);
        imageBeard = findViewById(R.id.imageBeard);

        // Set up CheckBox listeners
        cbHair.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imageHair.setVisibility(View.VISIBLE);
            } else {
                imageHair.setVisibility(View.INVISIBLE);
            }
        });

        cbEyebrow.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imageEyebrow.setVisibility(View.VISIBLE);
            } else {
                imageEyebrow.setVisibility(View.INVISIBLE);
            }
        });

        cbMoustache.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imageMoustache.setVisibility(View.VISIBLE);
            } else {
                imageMoustache.setVisibility(View.INVISIBLE);
            }
        });

        cbBeard.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imageBeard.setVisibility(View.VISIBLE);
            } else {
                imageBeard.setVisibility(View.INVISIBLE);
            }
        });
    }
}
