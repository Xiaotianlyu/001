//1.导包 import java.util.Scanner;
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {

        //2.提供或创建一个scanner类的实例
        Scanner scan = new Scanner(System.in);

        System.out.println("欢迎来到 交友网站");
        System.out.println("请输入你的网名");
        //3.调用scanner类中的方法，获取指定类型的变量
        String name = scan.next();

        System.out.println("请输入你的年龄");
        int age = scan.nextInt();

        System.out.println("请输入你的体重");
        double weight = scan.nextDouble();

        System.out.println("你是否单身？（单身：ture;不单身：false）");
        boolean isSingle = scan.nextBoolean();

        System.out.println("请输入你的性别");
        char gender = scan.next().charAt(0);

        System.out.println("网名" + name + ",年龄" + age + ",体重" + weight + ",是否单身" + isSingle
                + ",性别" + gender);
        System.out.println("注册完成");

        //4.关闭资源，调用scanner类的close（）
        scan.close();
    }

}
