package es.esy.mobilehost.android.myapplication;

/**
 * Created by Administrator on 2017/9/22.
 */
public class Check extends Account{
    int credit;
    public Check(String n, int p, int c){
        super(n, p);
        credit =c;
    }

    @Override
    public void withdraw(int w) {
        if (balance +credit >= w)
            balance -=w;
        else
            System.out.println("存款不足");
    }
}
