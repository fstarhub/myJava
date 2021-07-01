package com.star;

public class Plan implements A {
    @Override
    public void flySky() {

    }

    @Override
    public String getFace() {
        return "飞机的";
    }
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
        System.out.println("2222222222"+str);
    }
}
