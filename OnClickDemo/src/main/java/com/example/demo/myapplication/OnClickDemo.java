package com.example.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OnClickDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click_demo);
    }

    public void pressBTN (View v) {
        switch (v.getId()){
            case R.id.button:
            Toast.makeText(OnClickDemo.this, "Button1", Toast.LENGTH_SHORT).show();
            break;
            case R.id.button2:
                Toast.makeText(OnClickDemo.this, "Button2", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
