package com.star;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i ++) {
            System.out.println("分线程Myrunnable" + i);
        }
    }
}
