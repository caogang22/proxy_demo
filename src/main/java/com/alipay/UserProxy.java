package com.alipay;

/**
 * @author: Administrator
 * @date: 2020/9/6
 * @description:
 */
public class UserProxy implements UserInterface{

    private UserInterface userService;

    public UserProxy(UserInterface userService){
        this.userService = userService;
    }

    public void save() {
        System.out.println("增强一波..........");
        userService.save();
    }
}
