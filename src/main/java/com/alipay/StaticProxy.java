package com.alipay;

/**
 * @author: Administrator
 * @date: 2020/9/6
 * @description:
 */
public class StaticProxy {


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserProxy userProxy = new UserProxy(userService);
        userProxy.save();
    }
}
