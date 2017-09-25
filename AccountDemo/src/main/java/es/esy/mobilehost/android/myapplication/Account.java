package es.esy.mobilehost.android.myapplication;

/**
 * Created by Administrator on 2017/9/22.
 */
public class Account {
    String id, name;
    int balance;
     int count=1000;

    public Account(String n, int b){
        id = "A"+ count++;
        name = n;
        balance =b;
    }

    public void  withdraw (int w){
        if (balance >= w)
            balance -= w;
        else
            System.out.println("存款不足"+ (w-balance));
    }

    public void deposit (int d){
        balance +=d;
    }

    public String detail(){
        return "帳號：" +id+
                "姓名：" +name+
                "存款：" +balance;
    }


}
