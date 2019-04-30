package com.k.other;

public class Class1 extends ParentClass {

    private String str4;
    private String str5;
    private String str6;

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }

    public String getStr6() {
        return str6;
    }

    public void setStr6(String str6) {
        this.str6 = str6;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "str1='" + getStr1() + '\'' +
                "str2='" + getStr2() + '\'' +
                "str3='" + getStr3() + '\'' +
                "str4='" + str4 + '\'' +
                ", str5='" + str5 + '\'' +
                ", str6='" + str6 + '\'' +
                '}';
    }
}
