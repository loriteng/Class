package es.esy.mobilehost.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class GuessDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_demo);

        int x=(int)(Math.random()*10)+1;
        int y=(int)(Math.random()*10)+1;

        String msg;
        if (x>y)
            msg =x+">"+y;
        else
            msg = x+"<="+y;

        System.out.println(msg);

        Toast.makeText(GuessDemo.this, msg, Toast.LENGTH_SHORT).show();
    }
}
