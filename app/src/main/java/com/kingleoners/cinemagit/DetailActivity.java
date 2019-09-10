package com.kingleoners.cinemagit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgCover;
    TextView txtName, txtDescription;

    public static final String EXTRA_FILM = "extra_film";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgCover = findViewById(R.id.img_coverview);
        txtName = findViewById(R.id.txt_name_detail);
        txtDescription = findViewById(R.id.txt_description_detail);

        Film film = getIntent().getParcelableExtra(EXTRA_FILM);
        int cover = film.getCover();
        String name = film.getName();
        String description = film.getDescription();

        imgCover.setImageResource(cover);
        txtName.setText(name);
        txtDescription.setText(description);

    }
}
