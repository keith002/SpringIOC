package com.k.annotation;

import org.springframework.stereotype.Component;

@Component("bean4")
public class Bean2 {
    public Bean2() {
        System.out.println("Bean2已经被创建");
    }
}
