package com.decaku.demo01;

public class Client {
    public static void main(String[] args) {
        // 房东要租房子
        Host host = new Host();
        // 代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}

/*
公共业务可以交给代理来做，真实角色只需要去关注自身的逻辑，方便公共业务的扩展
 */
