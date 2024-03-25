package com.example.myapplication.inhome;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import com.example.myapplication.HomeActivity;
import com.example.myapplication.R;

public class AccountActivity extends HomeActivity {
    public ImageButton troLai;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        troLai = findViewById(R.id.troLai);

        troLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
