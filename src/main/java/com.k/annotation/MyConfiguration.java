package com.k.annotation;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * class_name: MyConfiguration
 * package: com.k.annotation
 * describe: 注解方式配置
 * creat_date: 2019/4/30
 * creat_time: 15:53
 **/
@Configuration
@ComponentScan(value = "com.k.annotation")
@Lazy
public class MyConfiguration {

//    @Bean
//    public Bean1 bean1(){
//        return new Bean1();
//    }
//
//    @Bean("bean3")
//    public Bean1 bean2(){
//        return new Bean1();
//    }

    /**
     * 注入string集合类型
     */
//    @Bean("stringList")
//    public List<String> stringList(){
//        List<String> lst = new ArrayList<>();
//        lst.add("111");
//        lst.add("222");
//        return lst;
//    }
//    @Bean
//    @Order(5)
//    public String string1(){
//        return "333";
//    }
//    @Bean
//    @Order(0)
//    public String string2(){
//        return "555";
//    }

    /** 注入Map类型*/
//    @Bean
//    public Map<String,Integer> integerMap(){
//        Map<String, Integer> map = new HashMap<>();
//        map.put("aaa", 111);
//        map.put("bbb", 222);
//        return map;
//    }
//    @Bean("int1")
//    public Integer integer1(){
//        return 333;
//    }
//    @Bean("int2")
//    public Integer integer2(){
//        return 444;
//    }
    /** Bean作用域*/
//    @Bean("testBean1")
//    @Scope("prototype")
//    public TestBean testBean(){
//        return new TestBean();
//    }

    /** 自定义作用域*/
//    @Bean
//    public MyScope myScope(){
//        return new MyScope();
//    }
//    @Bean
//    public CustomScopeConfigurer customScopeConfigurer(){
//        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
//        configurer.addScope("myScope", myScope());
//        return configurer;
//    }
//    @Bean("testBean2")
//    @Scope("myScope")
//    public TestBean testBean2(){
//        return new TestBean();
//    }
    /** 懒加载*/
//    @Bean("testBean9")
//    @Lazy
//    public TestBean2 testBean2(){
//        return new TestBean2();
//    }

    /** 创建于销毁*/
    @Bean(value = "testBean12", initMethod = "onInit111", destroyMethod = "onDestory111")
    public TestBean5 testBean5(){
        return new TestBean5();
    }
}
