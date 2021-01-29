package com.star;

public abstract class AbstractClass { // 只能单继承，可以有成员变量，构造方法，抽象类
    String interesting = "basketball";
    public String color = "pink";
    public abstract String doSome();
    public void doOther(){
        System.out.println("抽象内中的方法");
    }; // 也可有方法
}
