package com.metacoders.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView name;
    private TextView description;
    private TextView rating;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        name = (TextView) findViewById(R.id.title_tv);
        description = (TextView) findViewById(R.id.description_tv);
        rating = (TextView) findViewById(R.id.rating_tv);

        if (extras != null) {
            name.setText(extras.getString("Name"));
            description.setText(extras.getString("Description"));
            rating.setText(extras.getString("Rating"));
        }


    }
}
