package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    public static String EXTRA_DATA = "extra_data";
    private ImageView ivPhoto;
    private TextView tvName, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivPhoto = findViewById(R.id.iv_photoDetail);
        tvName = findViewById(R.id.tv_namaDetail);
        tvDescription = findViewById(R.id.tv_deskripsiDetail);

        HeroModel pahlawan = getIntent().getParcelableExtra(EXTRA_DATA);
        int image = pahlawan.getHeroesImages();
        String name = pahlawan.getHeroNames();
        String description = pahlawan.getHeroDetails();

        if (pahlawan!=null){
            Glide.with(this).load(image).into(ivPhoto);
            tvName.setText(name);
            tvDescription.setText(description);
        }

    }
}
