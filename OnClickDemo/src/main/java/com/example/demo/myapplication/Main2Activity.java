package com.example.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button3 = (Button)super.findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button)super.findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button3:
                Toast.makeText(this,"button3",Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"button4",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
