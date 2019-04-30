package com.k.instantiation;
/**
 * class_name: BeanFactory1
 * package: com.k.instantiation
 * describe: 通过实例方法实例化Bean
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class BeanFactory1 {
    public Bean createBean(){
        return new Bean();
    }
}
