package com.k.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * class_name: MyBean
 * package: com.k.annotation
 * describe: 构造方法
 * creat_date: 2019/4/30
 * creat_time: 15:29
 **/
//@Component
public class MyBean {
    /** 构造方法注入*/
    private AnotherBean anotherBean;
    @Autowired
    public MyBean(AnotherBean anotherBean){
        this.anotherBean = anotherBean;
    }
    /** set方法注入*/
    private AnotherBean anotherBean2;
    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }
    /** 属性名注入*/
    @Autowired
    private AnotherBean anotherBean3;
    /** 注入Stirng集合*/
    private List<String> stringList;
    @Autowired
//    @Qualifier("stringList")
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
    /** 注入Map 类型*/
    private Map<String, Integer> map = new HashMap<>();
    @Autowired
    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }
    /** 注入简单类型*/
    private String string;
    @Value("666")
    public void setString(String string) {
        this.string = string;
    }
    /** 注入Spring 上下文*/
    private ApplicationContext applicationContext;
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "anotherBean=" + anotherBean +
                ", anotherBean2=" + anotherBean2 +
                ", anotherBean3=" + anotherBean3 +
                ", stringList=" + stringList +
                ", map=" + map +
                ", string='" + string + '\'' +
                '}';
    }
}
