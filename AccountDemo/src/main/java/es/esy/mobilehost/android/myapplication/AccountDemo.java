package es.esy.mobilehost.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AccountDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_demo);

        Account[] acct = new Account[2];
        acct[0] = new Account("John", 1000);
        acct[1] = new Check("Mary", 1000, 5000);

        for (Account a:acct){
            a.withdraw(1500);
            System.out.println(a.detail());
            Toast.makeText(AccountDemo.this, a.detail(), Toast.LENGTH_LONG).show();
        }
    }
}
