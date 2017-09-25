package es.esy.mobilehost.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NumberDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_demo);

        int x=25;
        int y=025;
        int z=0x25;
        int z1=0b00011001;

        Toast.makeText(NumberDemo.this, "X ="+x + ",Y="+y + ",z=" +z+ ",z1="+z1, Toast.LENGTH_SHORT).show();
    }
}
