package com.k.instantiation;
/**
 * class_name: BeanFactory
 * package: com.k.instantiation
 * describe: 通过静态方法实例化Bean
 * creat_date: 2019/4/29
 * creat_time: 16:43
 **/
public class BeanFactory {

    public static Bean createBean(){
        return new Bean();
    }

}
