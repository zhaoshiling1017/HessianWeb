package com.ducetech.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * Created by lenzhao on 17-2-15.
 */
public class Client {
    public static void main(String[] args) throws MalformedURLException {
        //TODO 根据实际地址修改
        String url = "http://localhost:8080/HessianWeb/hello";
        HessianProxyFactory factory = new HessianProxyFactory();
        Hello basic = (Hello) factory.create(Hello.class, url);
        System.out.println(basic.hello(123));

        SumSay sumSay = (SumSay) factory.create(SumSay.class, url);
        System.out.println(sumSay.say("你好!"));

        System.out.println("10+20=" + sumSay.sum(10, 20));
    }
}
