package com.k.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
/**
 * class_name: TestBean2
 * package: com.k.annotation
 * describe: 懒加载
 * creat_date: 2019/4/30
 * creat_time: 15:54
 **/
@Component("testBean8")
@Lazy
public class TestBean2 {
    public TestBean2() {
        System.out.println("TestBean2 init");
    }
}
