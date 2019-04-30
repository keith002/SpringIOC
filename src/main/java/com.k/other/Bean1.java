package com.k.other;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean1 implements InitializingBean, DisposableBean {

    public Bean1() {
        System.out.println("Bean已经被创建");
    }

    public void onInit(){
        System.out.println("Bean1.onInit");
    }

    public void onDestroy(){
        System.out.println("Bean1.onDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean1.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean1.afterPropertiesSet");
    }
}
