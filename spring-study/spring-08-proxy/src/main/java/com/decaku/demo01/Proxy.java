package com.decaku.demo01;

public class Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }
}
