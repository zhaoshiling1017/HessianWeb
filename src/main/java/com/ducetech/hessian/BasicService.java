package com.ducetech.hessian;

import com.caucho.hessian.server.HessianServlet;

/**
 * Created by lenzhao on 17-2-15.
 */
public class BasicService extends HessianServlet implements Basic {

    public String hello(String name) {
        return "Hello " + name;
    }

    public String say(String msg) {
        return "Say: " + msg;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
