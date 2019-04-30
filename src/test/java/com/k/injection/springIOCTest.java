package com.k.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class_name: springIOCTest
 * package: com.k.instantiation
 * describe: 注入Bean方式介绍
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class springIOCTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-injection.xml");
        System.out.println("============= 注入Bean方式介绍 ============");
        Bean bean = context.getBean("bean",Bean.class);
        System.out.println("bean == " + bean);

        System.out.println("============= 注入Bean方式介绍简便写法 ============");
        Bean bean1 = context.getBean("bean1",Bean.class);
        System.out.println("bean1 == " + bean1);

        System.out.println("============= 注入集合类型 ============");
        Bean bean3 = context.getBean("bean3",Bean.class);
        System.out.println("bean3.getStringList() == " + bean3.getStringList());
        System.out.println("bean3.getAnotherBeanList() == " + bean3.getAnotherBeanList());
        System.out.println("bean3.getStringSet() == " + bean3.getStringSet());
        System.out.println("bean3.getAnotherBeanSet() == " + bean3.getAnotherBeanSet());
        System.out.println("bean3.getStringMap() == " + bean3.getStringMap());
        System.out.println("bean3.getAnotherBeanMap() == " + bean3.getAnotherBeanMap());
        System.out.println("bean3.getProperties() == " + bean3.getProperties());
    }
}
