package com.star.myThread;

import com.star.myThread.Account;

public class AccountThread extends Thread {
//    线程共享一个账户
    private Account act;
//    构造方法传递账户对象
    public AccountThread(Account act) {
        this.act = act;
    }
//    run方法取款操作
    public void run() {
        double money = 500;
        act.withDraw(money);
        System.out.println("线程" + Thread.currentThread().getName() + "对账户"+ act.getActno() + "取款" + money + "余额" + act.getBalance());
    }
}
