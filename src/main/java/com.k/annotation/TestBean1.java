package com.k.annotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * class_name: TestBean1
 * package: com.k.annotation
 * describe: 单例Bean AnotherBean1 多例  AnotherBean1生成多次
 * creat_date: 2019/4/30
 * creat_time: 15:54
 **/
@Component("testBean5")
@Scope("singleton")
public abstract class TestBean1 {
    @Lookup
    public abstract AnotherBean1 anotherBean1();

    public void printAnotherBean(){
        System.out.println("anotherBean1 = " + anotherBean1());
    }
}
