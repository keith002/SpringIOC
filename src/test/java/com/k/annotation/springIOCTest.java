package com.k.annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class_name: springIOCTest
 * package: com.k.instantiation
 * describe: 注解型式
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class springIOCTest {
    @Test
    public void test(){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

//        System.out.println("============= 注解创建Bean ===============");
//        Bean1 bean1 = context.getBean("bean1", Bean1.class);
//        System.out.println("bean1 = " + bean1);

//        System.out.println("============= 注解创建Bean 别名方式 ===============");
//        Bean1 bean2 = context.getBean("bean3", Bean1.class);
//        System.out.println("bean2 = " + bean2);

//        System.out.println("============= 注解创建Bean 通过@ComponentScan 扫描 ===============");
//        Bean2 bean3 = context.getBean("bean2", Bean2.class);
//        System.out.println("bean3 = " + bean3);

//        System.out.println("============= 注解创建Bean 通过@ComponentScan 扫描 别名===============");
//        Bean2 bean4 = context.getBean("bean4", Bean2.class);
//        System.out.println("bean4 = " + bean4);

//        System.out.println("=============== xml配置文件 包扫描 ===============================");
//        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("spring-annotation.xml");
//        Bean2 bean5 = context1.getBean("bean4", Bean2.class);
//        System.out.println("bean5 = " + bean5);

//        System.out.println("=================  注解注入  ======================");
//        MyBean myBean = context.getBean("myBean", MyBean.class);
//        System.out.println("myBean = " + myBean);
//        AnotherBean anotherBean = myBean.getApplicationContext().getBean("anotherBean", AnotherBean.class);
//        System.out.println("anotherBean = " + anotherBean);

//        System.out.println("=================  注解作用域  ======================");
//        System.out.println("=================  类上加@Component 注解  ======================");
//        for (int i = 0; i < 10; i++) {
//            TestBean testBean = context.getBean("testBean", TestBean.class);
//            System.out.println("testBean = " + testBean);
//        }
//        System.out.println("=================   配置@Configuration 方式   ======================================");
//        for (int i = 0; i < 10; i++) {
//            TestBean testBean1 = context.getBean("testBean1", TestBean.class);
//            System.out.println("testBean1 = " + testBean1);
//        }
//        System.out.println("==================== 自定义作用域 ============================");
//        for (int i = 0; i < 10; i++) {
//            TestBean testBean2 = context.getBean("testBean2", TestBean.class);
//            System.out.println("testBean2 = " + testBean2);
//        }
//        System.out.println("================= TestBean1为单例  AnotherBean为多例的情况 =======================");
//        TestBean1 testBean5 = context.getBean("testBean5", TestBean1.class);
//        for (int i = 0; i < 10; i++) {
//            testBean5.printAnotherBean();
//        }

//        System.out.println("==================== 懒加载 ============================");
//        System.out.println("context init");
//        TestBean2 testBean8 = context.getBean("testBean8", TestBean2.class);
//        System.out.println("testBean8 = " + testBean8);
//        TestBean2 testBean9 = context.getBean("testBean9", TestBean2.class);
//        System.out.println("testBean9 = " + testBean9);

        System.out.println("==================== 创建销毁 ============================");
//        TestBean5 testBean11 = context.getBean("testBean11", TestBean5.class);
//        System.out.println("testBean11 = " + testBean11);
        TestBean5 testBean12 = context.getBean("testBean12", TestBean5.class);
        System.out.println("testBean12 = " + testBean12);

        context.close();
    }
}
