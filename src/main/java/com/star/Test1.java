package com.star;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test1 {
    public static void main(String[] ages) {
        System.out.println(Arrays.asList(ages));
        System.out.println(Arrays.toString(ages));
        Master petLove = new Master();
//        System.out.println(petLove);
        Cat xiaohei = new Cat();
        System.out.println(xiaohei.voice());
        Dog jinmao = new Dog();

        petLove.feed(xiaohei);
        petLove.feed(jinmao);
        Dog erha = new Dog();
        erha.doMath(new double[]{2.2, 2.1, 2.0});
        Realiza realizaInterFace = new Realiza();
        System.out.println(realizaInterFace.getFace());

        FlyAble f = new EarlyBird("a","b","c","d");
        FlyAble f1 = new EarlyBird();
        f.fly();
        String[] arr2 = {"zhangshan", "lisi"};
        String[] arr5 = {"zhangshan", "lisi"};
//        Arrays.toString() 与 变量.toString()区别
        System.out.println(arr2.toString().equals(arr5.toString()));
        boolean a = Arrays.toString(arr2).equals(Arrays.toString(arr5));
        System.out.println(arr2.toString());
        System.out.println("cat: "+xiaohei);
        System.out.println(Arrays.toString(arr2));
        System.out.println(a);
        System.out.println(arr2==arr5);
        System.out.println(arr2[1]);
        int[] arr3 = new int[4];
        arr3[2] = 100;
        float[] arr4;
        arr4 = new float[3];
//        1 for循环
        for (int i = 0; i < arr3.length ; i++) {
            System.out.println(i);
        }
//        2 foreach循环
        for (int i: arr3) {
            System.out.println(i + "jaja");
        }
//        3 foreach循环 final修饰不可改变元素
//        for (循环变量类型 循环变量名称 : 被遍历的对象)  循环体
        for (final int j: arr3) {
//            j++; 报错  fina 修饰不能更改变量值
            System.out.println(j + "jaja");
        }
        LikeMusic singer = LikeMusic.歌手0;
        System.out.println(singer.getName() + singer.getAge());
//        冒泡排序
        int[] sortArr = {3, 7, 5, 14, 18, 6, 0};
        for (int i = sortArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortArr[j] > sortArr[j + 1]){
                    int temp = 0;
                    temp = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortArr));
//        选择排序
        int[] selectArr = {2, 4, 9, 5, 1, 6, 3};
        for (int i = 0; i < selectArr.length - 1; i ++) {
            int min = i;
            for (int j = i + 1; j < selectArr.length; j++) {
                if (selectArr[j] < selectArr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = selectArr[min];
                selectArr[min] = selectArr[i];
                selectArr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(selectArr));
//        for (int k: selectArr) {
//            System.out.println(k);
//        }
//        插入排序(从第二项开始比较)
        int[] insetArr = {3, 5, 2, 8, 4, 7};
        for (int i = 1; i < insetArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (insetArr[j] < insetArr[j-1]) {
                    int temp;
                    temp = insetArr[j-1];
                    insetArr[j-1] = insetArr[j];
                    insetArr[j] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(insetArr));

//        日期处理
        SimpleDateFormat data1 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String now = data1.format(new Date());
        System.out.println(now);
        String data2 = "2021-2-7 16:00:100";
        SimpleDateFormat date2 = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss:SSS");
//         Date s = date2.parse(data2);
    }
}
