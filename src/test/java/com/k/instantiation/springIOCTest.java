package com.k.instantiation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * class_name: springIOCTest
 * package: com.k.instantiation
 * describe: 测试spring实例化
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class springIOCTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-instantiation.xml");
        System.out.println("============= 通过构造方法实例化Bean ============");
        Bean bean = context.getBean("bean",Bean.class);
        System.out.println("bean == " + bean);

        System.out.println("============= 通过静态方法实例化Bean ============");
        Bean bean1 = context.getBean("bean1", Bean.class);
        System.out.println("bean1 == " + bean1);

        System.out.println("============= 通过实例方法实例化Bean ============");
        Bean bean3 = context.getBean("bean3", Bean.class);
        System.out.println("bean3 == " + bean3);

        System.out.println("============= Bean的别名 ============");
        Bean bean5_1 = context.getBean("bean5_1", Bean.class);
        System.out.println("bean5_1 == " + bean5_1);
        Bean bean5_2 = context.getBean("bean5_2", Bean.class);
        System.out.println("bean5_2 == " + bean5_2);
        Bean bean5_3 = context.getBean("bean5_3", Bean.class);
        System.out.println("bean5_3 == " + bean5_3);
    }
}
