package com.star;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Dog extends Pet {
    public void eat() {
        System.out.println("狗上述");
    }
    public String jump() {
        System.out.println("狗跳");
        return "狗跳";
    }
    public void doMath(double[] array) {
        System.out.println(Arrays.toString(array));
//        double[] list = {12, 23,34,32};
        for (double element: array) {
            System.out.println(element);
        }
        Date nowTime = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("现在时刻" + ft.format(nowTime));
        Calendar timeNow = Calendar.getInstance();
        timeNow.set(2021,1,1);
//        System.out.println(timeNow.getWeekYear());
        timeNow.add(Calendar.DATE, 10);
        int month = timeNow.get(Calendar.MONTH) + 1;
        int hour = timeNow.get(Calendar.HOUR);
//        System.out.println(timeNow.getTime());
        System.out.println(month + " " + hour);
        double[] numArr = new double[3];
//        numArr[0] = 0.342;
//        numArr[1] = 8.34;
//        numArr[2] = 80.3;
        double total = 0;
        for (int i = 0; i < numArr.length; i ++) {
            total += numArr[i];
        }
        double a = Math.sin(Math.PI/2);
        System.out.println(total);

    }
}
