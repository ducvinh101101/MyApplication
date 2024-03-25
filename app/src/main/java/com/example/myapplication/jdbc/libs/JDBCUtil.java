package com.example.myapplication.jdbc.libs;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection connection = null;

        try{
            // đăng ký mysql với driver manager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mySQL://127.0.0.1:3306/nganhang";
            String usename = "ducvinh101";
            String password = "vinh1012004";

            // Tạo kết nối
            connection = DriverManager.getConnection(url,usename,password);
        }
        catch (SQLException exception){
            exception.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection c){
        try{
            if(c!=null){
                c.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
