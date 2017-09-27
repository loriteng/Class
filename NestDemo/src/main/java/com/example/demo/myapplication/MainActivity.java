package com.example.demo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Myclick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //設定一個按鈕連到第二頁
        //有寫super是指定從父類別開始找，若沒有寫，
        //就會從自己開始找，找不到才會到父類別找
        Button b2 = (Button)super.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent().setClass(MainActivity.this, Main2Activity.class));
            }
        });

        //設定一個按鈕可執行上面寫的class MyClick
        Button b1 = (Button)super.findViewById(R.id.b1);
        b1.setOnClickListener(new Myclick());
    }
}
