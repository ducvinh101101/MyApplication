package com.example.myapplication.inhome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.myapplication.HomeActivity;
import com.example.myapplication.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QRPayActivity extends HomeActivity {
    private Button buttonScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrpay);

        // Ánh xạ nút quét mã QR từ layout XML
        buttonScan = findViewById(R.id.buttonScan);

        // Đặt sự kiện click cho nút quét mã QR
        buttonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Khởi tạo IntentIntegrator cho việc quét mã QR
                IntentIntegrator integrator = new IntentIntegrator(QRPayActivity.this);
                integrator.setOrientationLocked(false);
                integrator.setPrompt("Đặt mã QR trong khung quét"); // Đặt thông báo hướng dẫn
                integrator.initiateScan(); // Bắt đầu quét
            }
        });
    }

    // Xử lý kết quả từ quét mã QR
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() == null) {
                // Nếu không có mã QR được tìm thấy
                Toast.makeText(this, "Không tìm thấy mã QR", Toast.LENGTH_SHORT).show();
            } else {
                // Nếu có mã QR được tìm thấy
                String qrContent = result.getContents();
                // Xử lý nội dung mã QR ở đây (ví dụ: hiển thị nội dung mã QR trong một Toast)
                Toast.makeText(this, "Nội dung mã QR: " + qrContent, Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
