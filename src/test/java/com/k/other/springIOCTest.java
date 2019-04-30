package com.k.other;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class_name: springIOCTest
 * package: com.k.instantiation
 * describe: 懒加载   创建销毁   Bean属性继承
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class springIOCTest {
    @Test
    public void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-other.xml");

//        System.out.println("=============  懒加载  =================");
//        System.out.println("context已经被创建");
//        Bean1 bean = context.getBean("bean", Bean1.class);
//        System.out.println("bean = " + bean);

//        System.out.println("=============  创建销毁  =================");
//        Bean1 bean1 = context.getBean("bean1", Bean1.class);
//        System.out.println("bean1 = " + bean1);
//        context.close();

        System.out.println("=============  Bean属性继承  =================");
//        Class1 class1 = context.getBean("class1", Class1.class);
//        System.out.println("class1 = " + class1);
//        Class2 class2 = context.getBean("class2", Class2.class);
//        System.out.println("class2 = " + class2);

        //继承没有Bean 的情况
        Class1 class3 = context.getBean("class3", Class1.class);
        System.out.println("class3 = " + class3);
        Class2 class4 = context.getBean("class4", Class2.class);
        System.out.println("class4 = " + class4);

    }
}
