package com.k.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/**
 * class_name: TestBean5
 * package: com.k.annotation
 * describe: 注解类型 创建注销
 * creat_date: 2019/4/30
 * creat_time: 15:28
 **/
//@Component("testBean11")
public class TestBean5 implements InitializingBean,DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("InitializingBean   TestBean5.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("DisposableBean   TestBean5.afterPropertiesSet");
    }
    @PostConstruct
    public void onInit(){
        System.out.println(" @PostConstruct   TestBean5.onInit");
    }
    @PreDestroy
    public void onDestory(){
        System.out.println(" @PreDestroy   TestBean5.onDestory");
    }

    public void onInit111(){
        System.out.println(" TestBean5.onInit111");
    }
    public void onDestory111(){
        System.out.println("  TestBean5.onDestory111");
    }
}
