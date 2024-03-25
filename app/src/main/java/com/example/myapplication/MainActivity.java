package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtUserName;
    private EditText edtPassword;
    private Button bntLogin;
    private Button bntRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Khoi tao cac thanh phan giao dien
        edtPassword = findViewById(R.id.edtPassword);
        edtUserName = findViewById(R.id.edtUsername);
        bntLogin = findViewById(R.id.btnLogin);
        bntRegister = findViewById(R.id.btnRegister);
        // Xu ly su kien dang nhap
        bntLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xac thuc nguoi dung
                String username = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();
                if(validateLogin(username,password)){
                    //chuyen den man hinh Home neu dang nhap thanh cong
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    //hien thi thong bao loi
                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bntRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
    private boolean validateLogin(String username, String password) {
        // Thực hiện xác thực người dùng ở đây
        return "abcdef".equals(username) && "123456".equals(password);
        // Mã giả định rằng xác thực thành công
    }
}

