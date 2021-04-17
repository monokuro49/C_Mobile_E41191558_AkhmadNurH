package com.akhmadnur.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
// Deklarasi variable
    private TextView tvdataintent;
    @Override
//    Method onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvdataintent = findViewById(R.id.tvdataintent);

        String nama = getIntent().getStringExtra("extra_name");
        int age = getIntent().getIntExtra("extra_age", 0);
        String text = "Nama: "+nama+", usia: "+age;
        tvdataintent.setText(text);
    }
}