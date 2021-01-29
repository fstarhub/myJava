package com.star;

public interface InterfaceAll { // 接口中只能有final和static常量，支持多继承
    final static double PI = 3.14;
    static final double PI1 = 3.14;

    double g = 9.8;
    public final int floor = 3;
    public String getFace();
//    public void doOther(){}; 报错
    default void doInterface(){
        System.out.println("接口中，jdk1.8后可支持方法");
    }
}
