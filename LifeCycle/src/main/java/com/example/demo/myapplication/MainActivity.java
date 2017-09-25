package com.example.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("LifeCycle","onCreate");

        EditText et1 = (EditText)super.findViewById(R.id.editText);
        EditText et2 = (EditText)super.findViewById(R.id.editText2);

        et1.setText("JJJJJ");
        et2.setText("55555");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycle","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifeCycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycle","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycle","onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("LifeCycle","onRestart");
    }


}
