package com.k.scope;



public abstract class Bean3 {

    public abstract Bean2 createBean2();

    public void pringtBean2(){
        System.out.println("Bean2 " + createBean2());
    }

    @Override
    public String toString() {
        return "Bean3{}";
    }
}
