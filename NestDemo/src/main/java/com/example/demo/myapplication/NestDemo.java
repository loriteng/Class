package com.example.demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NestDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_demo);

        Outer obj1 = new Outer();
        obj1.ShowInner();

        Outer.Inner obj2=obj1.new Inner();
        obj2.show();
    }


    public class Outer {
        int value=7;

        class Inner {
            public void show() {
                System.out.println("value=" + value);
            }
        }

        public void ShowInner() {
            Inner in = new Inner();
            in.show();
    }
  }
}
