package com.k.annotation;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
/**
 * class_name: MyScope
 * package: com.k.annotation
 * describe: 自定义作用域
 * creat_date: 2019/4/30
 * creat_time: 15:53
 **/
public class MyScope implements Scope {

    private Map<String, Object> map1 = new ConcurrentHashMap<>();
    private Map<String, Object> map2 = new ConcurrentHashMap<>();

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        if(!map1.containsKey(s)){
            Object o = objectFactory.getObject();
            map1.put(s, o);
            return o;
        }
        if(!map2.containsKey(s)){
            Object o = objectFactory.getObject();
            map2.put(s, o);
            return o;
        }
        int i = new Random().nextInt(2);
        if(0 == i){
            return map1.get(s);
        } else {
            return map2.get(s);
        }
    }

    @Override
    public Object remove(String s) {
        if(!map1.containsKey(s)){
            Object o = map1.get(s);
            map1.remove(s);
            return o;
        }
        if(!map2.containsKey(s)){
            Object o = map2.get(s);
            map2.remove(s);
            return o;
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
