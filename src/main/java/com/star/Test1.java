package com.star;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test1 {
    public static void main(String[] ages) throws ParseException {
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

//        字符串 比较用equals:比较的是内容
        String x1 = new String("abc");
        String x2 = new String("abc");
        System.out.println(x1.equals(x2));

//        日期处理
        SimpleDateFormat data1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String now = data1.format(new Date());
        System.out.println(now + "---------------");
        String data2 = "2021-2-7 16:00:10:100";
        SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println(date2.format(new Date()));
        Date s = date2.parse(data2); // 需要抛异常

//        数字格式化
//        NumberFormat num = new NumberFormat.getInstance();
        DecimalFormat num1 = new DecimalFormat("###,###.##");
        String numf = num1.format(2312.12);
        System.out.println(numf);
        BigDecimal num2 =  new BigDecimal(100);
        BigDecimal num3 =  new BigDecimal(200);
        BigDecimal num4 = num2.add(num3);
        System.out.println(num4);
//        随机数
        Random random = new Random();
        int random1 = random.nextInt(6);
        System.out.println(random1);

//        arrayList
        List newList = new ArrayList();
        List<String> sites = new ArrayList<>();
        sites.add("zhangsan");
        sites.add("lisi");
        System.out.println(sites.toString());
        List<Number> myNumber = new ArrayList<>();
        myNumber.add(3);
        myNumber.add(5);
        System.out.println(myNumber.toString());

//        linkedList
        LinkedList<String> myLink = new LinkedList<>();
        myLink.add("1");
        myLink.add("2");
        myLink.add("3");
        myLink.add("3");
        myLink.addFirst("0");
        System.out.println(myLink);
        Iterator it = myLink.iterator();
        while (it.hasNext()) {
            Object item = it.next();
            System.out.println(item + "ii");
        }
        LinkedList<Boolean> myBoolean = new LinkedList<>();
        myBoolean.add(false);
        myBoolean.add(false);
        myBoolean.add(false);
        myBoolean.add(1,true);
        System.out.println(myBoolean.toString());

//        hashSet 值的唯一性
        HashSet<String> myhush = new HashSet<>();
        myhush.add("hash");
        myhush.add("hash2");
        myhush.add("hash3");
        myhush.add("hash2");
        System.out.println(myhush);

//        hashMap 键值唯一性
        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "j11j");
        myHashMap.put(2, "j22j");
        myHashMap.put(4, "j2jj");
        System.out.println(myHashMap);

//        增加线程方法一
        MyThread myThread  = new MyThread();
//        myThread.run();// 单线程
//        myThread.start();//开启多线程，执行后瞬就结束
        System.out.println("主线程执行");
//        增加线程方法二
        MyRunnable myRunnable = new MyRunnable();
        Thread testRun = new Thread(myRunnable);
//        testRun.start();

//        模拟二个线程对同一个账户去取钱，创建一个账户
        Account act = new Account("act-001",1800);
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
//       线程设置name
        t1.setName("t1");
        t2.setName("t2");
//        启动线程
        t1.start();
        t2.start();
    }
}
