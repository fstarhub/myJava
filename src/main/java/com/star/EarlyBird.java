package com.star;


class EarlyBird extends Pet implements FlyAble {
    public void fly() {
        System.out.println("小鸟飞翔了");
    }
    private String a = "abc";
    private String b = "abc";

    private String x = new String("abc");
    private String y = new String("abc");

    public EarlyBird(String a, String b, String x, String y) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        System.out.println(a == b);
        System.out.println(x == y);
    }

    public EarlyBird() {
        System.out.println("=====");
        System.out.println(a == b);
        System.out.println(x == y);
    }
    //    public void seeOut() {
//         String a = "abc";
//         String b = "abc";
//
//         String x = new String("abc");
//         String y = new String("abc");
//    }
}
