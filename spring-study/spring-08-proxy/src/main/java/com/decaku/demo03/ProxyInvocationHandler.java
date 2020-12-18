package com.decaku.demo03;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 等会我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();

        // 动态代理的本质就是使用反射实现
        Object result = method.invoke(rent, args);

        fare();
        return result;
    }

    // 额外逻辑
    public void seeHouse() {
        System.out.println("中介带看房子");
    }

    public void fare() {
        System.out.println("收中介费");
    }
}
