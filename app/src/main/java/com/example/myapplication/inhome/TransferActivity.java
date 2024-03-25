package com.example.myapplication.inhome;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.myapplication.HomeActivity;
import com.example.myapplication.R;

public class TransferActivity extends HomeActivity {
    private ImageButton troLai;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        troLai = findViewById(R.id.troLai);

        //Xử lý sự kiện click trở lại
        troLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
