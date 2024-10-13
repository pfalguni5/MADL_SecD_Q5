package com.example.secd_q5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private TextView name, age;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("keyname");
        String Age = intent.getStringExtra("keyage");

        name = findViewById(R.id.name_text);
        age = findViewById(R.id.age_text);

        name.setText(Name);
        age.setText(Age);
    }
}
