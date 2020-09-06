package com.alipay;

/**
 * @author: Administrator
 * @date: 2020/9/6
 * @description:
 */
public class DynamicProxy {

    public static void main(String[] args) {
        UserInterface userService = new UserServiceImpl();
        System.out.println(userService.getClass());
        UserInterface proxyService =(UserInterface) new ProxyFactory(userService).getProxyInstance();
        System.out.println(proxyService.getClass());
        proxyService.save();
    }
}
