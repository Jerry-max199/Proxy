package com.zzjm.factory;

import com.zzjm.Service.UsbSell;
//表示商家的价格
//厂家继承接口的方法实现卖u盘的方法
public class SanUsb implements UsbSell {
//参数表示卖出优盘的数量
    //返回值是总价
    @Override
    public float sell(int amount) {
        float pire = 0;
        if (amount<100) {
             pire = amount * 85.0f;//表示如果购买数量小于100商家卖出一个是85元
        }else if(amount>=100){
            pire = amount * 75.0f;//表示如果购买数量大于100商家卖出一个是75元
        }
        return pire;//返回的价格是购买u盘的总价
    }
}
