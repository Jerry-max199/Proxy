package com.zzjm.Service;


//定义一个接口实现卖u盘的方法
//表示功能的，商家和厂家都要执行
public interface UsbSell {
    //定义参数方法，amount表示购买数量；返回值表示u盘价格；
    float sell(int amount);
}
