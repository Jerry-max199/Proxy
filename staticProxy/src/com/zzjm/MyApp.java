package com.zzjm;

import com.zzjm.TaoBao.taobaosell;

public class MyApp {
    public static void main(String[] args) {
        taobaosell taobaosell=new taobaosell();
        float pirce=taobaosell.sell(10);
        System.out.println("需要支付的价格是"+pirce);
   }
}

