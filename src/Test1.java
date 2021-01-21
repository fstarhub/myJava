import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] ages) {
        System.out.println(Arrays.asList(ages));
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]);
        Master petLove = new Master();
        Cat xiaohei = new Cat();
        System.out.println(xiaohei.voice());
        Dog jinmao = new Dog();

        petLove.feed(xiaohei);
        petLove.feed(jinmao);
        Dog erha = new Dog();
        erha.doMath(new double[]{2.2, 2.1, 2.0});
        Realiza realizaInterFace = new Realiza();
        System.out.println(realizaInterFace.getFace());

        FlyAble f = new EarlyBird();
        f.fly();
        int[] arr1 = {2, 3, 34};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println(arr1[2]);
        String[] arr2 = {"zhangshan", "lisi"};
        System.out.println(arr2[1]);
        int[] arr3 = new int[9];
        arr3[2] = 100;
        float[] arr4;
        arr4 = new float[3];
//        for (int a =0; a<9; a++) {
//            System.out.println(arr4[a]);
//        }
    }
}
