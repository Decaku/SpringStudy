package com.decaku.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService((UserServiceImpl) userService);
        proxy.add();

        //公共逻辑抽出来， 改动原有的代码在项目开发中是大忌
        proxy.log();
    }
}
