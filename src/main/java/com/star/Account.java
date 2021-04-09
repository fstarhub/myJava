package com.star;

public class Account {
//    账户名
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double money) {
//      取款之前的余额（t1 t2并发这个方法，t1和t2是二个栈，同时操作堆中的同一个对象）
        double before = this.getBalance();
//      取款之后的余额
        double after = before - money;
        /* 更新余额 */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}