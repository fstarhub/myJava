import java.util.Scanner;

public class Cat extends Pet {
    public void eat() {
        System.out.println("猫池猫");
    }
    public String jump() {
//        static int aa = 12; 类变量独立于方法体之外
//        public init aa = 23; 访问修饰符不能用于局部变量
//        int a ; 局部变量必须初始化
//        System.out.println("jump is height" );
        return "猫跳高";
    }
    public String voice() {
        char[] sayMiao = {'m','i','a','o'};
        String name = "小猫";
        String miaomiao = new String(sayMiao);
//        System.out.println(name + miaomiao+ " " + miaomiao.length());
        return miaomiao;
    }
    public String outPut() {
        Scanner out = new Scanner(System.in);
        return "out" + out;
    }
}
