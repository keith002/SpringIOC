package com.k.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * class_name: AnotherBean1
 * package: com.k.annotation
 * describe: 注解类型  作用域
 * creat_date: 2019/4/30
 * creat_time: 15:28
 **/
@Component
@Scope("prototype")
public class AnotherBean1 {
}
