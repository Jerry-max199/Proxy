package com.zzjm.TaoBao;

import com.zzjm.Service.UsbSell;
import com.zzjm.factory.SanUsb;

public class taobaosell implements UsbSell {
    private UsbSell usbSell=new SanUsb();//实例化厂家（目标类）向厂家进货
    @Override
    public float sell(int amount) {
        //卖给用户
       float pire= usbSell.sell(amount);
             pire=pire+amount*10;//没见商品加价10元
        return pire;
    }
}
