package com.alipay;

/**
 * @author: Administrator
 * @date: 2020/9/6
 * @description:
 */
public class CglibProxy {


    public static void main(String[] args) {
        CglibUser cglibUser = new CglibUser();
        CglibUser cglibProxyUser = (CglibUser) new CglibProxyFactory(cglibUser).getProxyInstance();
        cglibProxyUser.save();
    }
}
