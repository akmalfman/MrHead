package com.example.mrhead;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MrheadActivity extends AppCompatActivity {

    private CheckBox cbHair, cbEyebrow, cbMoustache, cbBeard;
    private ImageView imageHair, imageEyebrow, imageEye, imageBeard, imageMoustache;

    private TextView email;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mrhead);

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

        // Initialize TextView
        email = findViewById(R.id.textView);
        Intent intent = getIntent();
        email.setText("Welcome, "+intent.getStringExtra("email_key"));

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
