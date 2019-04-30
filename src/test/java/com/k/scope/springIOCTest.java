package com.k.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * class_name: springIOCTest
 * package: com.k.instantiation
 * describe: Bean1 作用域
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class springIOCTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-scope.xml");
//        System.out.println("============= Bean2 单例模式 ============");
//        Bean2 bean2_1= context.getBean("bean2",Bean2.class);
//        System.out.println("bean2_1 == " + bean2_1);
//        Bean2 bean2_2= context.getBean("bean2",Bean2.class);
//        System.out.println("bean2_2 == " + bean2_2);
//        Bean1 bean1= context.getBean("bean1",Bean1.class);
//        System.out.println("bean1 == " + bean1);
//
//        System.out.println("============= Bean2  单例模式 其他上下文 ============");
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-scope.xml");
//        Bean2 bean3_1= context2.getBean("bean2",Bean2.class);
//        System.out.println("bean3_1 == " + bean3_1);
//        Bean2 bean3_2= context2.getBean("bean2",Bean2.class);
//        System.out.println("bean3_2 == " + bean3_2);
//        Bean1 bean3= context2.getBean("bean1",Bean1.class);
//        System.out.println("bean3 == " + bean3);

//        System.out.println("============= Bean2 多例模式 ============");
//        Bean2 bean4_1= context.getBean("bean3",Bean2.class);
//        System.out.println("bean4_1 == " + bean4_1);
//        Bean2 bean4_2= context.getBean("bean3",Bean2.class);
//        System.out.println("bean4_2 == " + bean4_2);
//        Bean1 bean4= context.getBean("bean4",Bean1.class);
//        System.out.println("bean4 == " + bean4);

//        System.out.println("============= Bean1 单例模式 Bean2 单例模式 ============");
//        Bean1 bean5_1= context.getBean("bean01",Bean1.class);
//        System.out.println("bean5_1 == " + bean5_1);
//        Bean1 bean5_2= context.getBean("bean01",Bean1.class);
//        System.out.println("bean5_2 == " + bean5_2);
//        System.out.println("（bean5_1 == bean5_2）=  " + (bean5_1 == bean5_2));

//        System.out.println("============= Bean1 单例模式 Bean2 多例模式 ============");
//        Bean1 bean6_1= context.getBean("bean05",Bean1.class);
//        System.out.println("bean6_1 == " + bean6_1);
//        Bean1 bean6_2= context.getBean("bean05",Bean1.class);
//        System.out.println("bean6_2 == " + bean6_2);
//        System.out.println("（bean6_1 == bean6_2）=   " + (bean6_1 == bean6_2));

//        System.out.println("============= Bean1 多例模式 Bean2 单例模式 ============");
//        Bean1 bean7_1= context.getBean("bean07",Bean1.class);
//        System.out.println("bean7_1 == " + bean7_1);
//        Bean1 bean7_2= context.getBean("bean07",Bean1.class);
//        System.out.println("bean7_2 == " + bean7_2);
//        System.out.println("（bean7_1 == bean7_2）=   " + (bean7_1 == bean7_2));

//        System.out.println("============= Bean1 多例模式 Bean2 多例模式 ============");
//        Bean1 bean8_1= context.getBean("bean09",Bean1.class);
//        System.out.println("bean8_1 == " + bean8_1);
//        Bean1 bean8_2= context.getBean("bean09",Bean1.class);
//        System.out.println("bean8_2 == " + bean8_2);
//        System.out.println("（bean8_1 == bean7_2）=   " + (bean8_1 == bean8_2));

//        System.out.println("============= 解决Bean2为多例  Bean1为单例 时Bean2只创建一次 ============");
//        Bean3 bean9_1= context.getBean("bean11",Bean3.class);
//        bean9_1.pringtBean2();
//        bean9_1.pringtBean2();
//        bean9_1.pringtBean2();
//        bean9_1.pringtBean2();

        System.out.println("============= 自定义作用域 ============");
//        for (int i = 0; i < 10; i++) {
//            Bean2 bean10_1 = context.getBean("bean15",Bean2.class);
//            System.out.println(bean10_1);
//        }
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Bean2 bean10_1 = context.getBean("bean16",Bean2.class);
                    System.out.println(bean10_1);
                }
            }).start();
        }



    }
}
