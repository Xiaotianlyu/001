
import java.util.Scanner;

/*
随机生成100以内的数字，猜这个数字是多少？
从键盘输入，如果数字大了，提示大了；如果数字小了，提示小了；如果对了就不再猜，并统计一共猜了多少次。
tips:生成一个【a,b】范围：(int)(Math.random()*(b-a+1)+a)
 */
public class WhileTest1 {
    public static void main(String[] args) {

        //1.随机生成100以内的数字
        int random = (int) (Math.random() * 100) + 1;

        //2.使用Scanner 从键盘获取数据
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入1-100范围内的整数");
        int guess = scan.nextInt();

        //4.声明一个变量，记录猜的次数
        int guessCount = 0;

        //3.使用循环结构对比获取数据

        while (random != guess) {
            if (guess > random) {
                System.out.println("你输入的数据大了");
            } else if (guess < random) {
                System.out.println("你输入的数据小了");
            } //else{
            //break;}
            System.out.println("请输入1-100范围内的整数");
            guess = scan.nextInt();
            guessCount++;

        }

        System.out.println("恭喜！猜对了！");
        System.out.println("共猜了" + guessCount + "次");

        scan.close();

    }
}
