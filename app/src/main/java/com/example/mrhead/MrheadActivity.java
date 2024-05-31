package com.example.mrhead;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MrheadActivity extends AppCompatActivity {

    private CheckBox cbHair, cbEyebrow, cbMoustache, cbBeard;
    private ImageView imageHair, imageEyebrow, imageEye, imageBeard, imageMoustache;
    private TextView email, pass;
    private Button btnCall;

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
        pass = findViewById(R.id.textView2);
        Intent intent = getIntent();
        email.setText(intent.getStringExtra("email_key"));
        pass.setText(intent.getStringExtra("pass_key"));

        // Initialize Button
        btnCall = findViewById(R.id.btn_call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MrheadActivity.this, ContactUsActivity.class);
                startActivity(intent);
//                Intent callIntent = new Intent(Intent.ACTION_DIAL);
//                callIntent.setData(Uri.parse("tel:+6285156760830"));
//                startActivity(callIntent);
            }
        });

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
