package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");
        int flag = intent.getIntExtra("flag", 0);
        String description = intent.getStringExtra("description");

        TextView nameTextView = findViewById(R.id.details_name);
        TextView capitalTextView = findViewById(R.id.details_capital);
        ImageView flagImageView = findViewById(R.id.details_flag);
        TextView descriptionTextView = findViewById(R.id.details_description);

        nameTextView.setText(name);
        capitalTextView.setText(capital);
        flagImageView.setImageResource(flag);
        descriptionTextView.setText(description);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
