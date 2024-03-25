package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.inhome.AccountActivity;
import com.example.myapplication.inhome.QRPayActivity;
import com.example.myapplication.inhome.TransferActivity;

public class HomeActivity extends AppCompatActivity {
    private ImageButton taiKhoan;
    private ImageButton qrPay;
    private ImageButton chuyenTien;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        taiKhoan = findViewById(R.id.taiKhoan);
        qrPay = findViewById(R.id.qrPay);
        chuyenTien = findViewById(R.id.chuyenTien);
        //Xử lý sự kiện click vào tài khoản
        taiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
        //Xử lý sự kiện click vào qr pay
        qrPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, QRPayActivity.class);
                startActivity(intent);
            }
        });
        //xu lý sự kiện click vào Chuyển Tiền
        chuyenTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TransferActivity.class);
                startActivity(intent);
            }
        });
    }
}
