/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输
入为 0 时结束程序。
 */

import java.util.Scanner;

public class ForWhileTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positiveCount = 0;//记录正数的个数
        int negativeCount = 0;//记录负数的个数

        while (true) {
            System.out.println("请输入一个整数（输入0时结束程序）");
            int num = scan.nextInt();//获取用户输入的整数

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                System.out.println("程序结束");
                break;
            }

        }
        System.out.println("正数的个数是：" + positiveCount);
        System.out.println("负数的个数是：" + negativeCount);

        scan.close();

    }
}
