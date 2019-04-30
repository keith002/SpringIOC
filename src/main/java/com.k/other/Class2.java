package com.k.other;

public class Class2 extends ParentClass {

    private String str7;
    private String str8;
    private String str9;

    public String getStr7() {
        return str7;
    }

    public void setStr7(String str7) {
        this.str7 = str7;
    }

    public String getStr8() {
        return str8;
    }

    public void setStr8(String str8) {
        this.str8 = str8;
    }

    public String getStr9() {
        return str9;
    }

    public void setStr9(String str9) {
        this.str9 = str9;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "str1='" + getStr1() + '\'' +
                "str2='" + getStr2() + '\'' +
                "str3='" + getStr3() + '\'' +
                "str7='" + str7 + '\'' +
                ", str8='" + str8 + '\'' +
                ", str9='" + str9 + '\'' +
                '}';
    }
}
