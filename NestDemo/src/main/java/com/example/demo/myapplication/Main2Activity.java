package com.example.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    class Myclick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Toast.makeText(Main2Activity.this, "Button Click", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);

        //用程式碼設定layout
        LinearLayout layout = new LinearLayout(Main2Activity.this);
        layout.setOrientation(LinearLayout.HORIZONTAL); //由左而右排

        Button bx = new Button(Main2Activity.this);
        bx.setText("button1");
        layout.addView(bx);
        bx.setOnClickListener(new Myclick());

        Button bx2 = new Button(Main2Activity.this);
        bx2.setText("button2");
        layout.addView(bx2);
        bx2.setOnClickListener(new Myclick());

        setContentView(layout);
    }
}
