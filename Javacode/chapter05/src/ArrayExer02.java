/*
用一个数组，保存星期一到星期天的 7 个英语单词，从键盘输入 1-7，显示对应的单词
{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayExer02 {
    public static void main(String[] args) {
        //定义7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //从键盘获取指定的数值，scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数值（1-7）：");
        int day = scan.nextInt();

        //针对获取的数据进行判断
        if (day < 1 || day > 7) {
            System.out.println("你输入的数据有误");
        } else {
            System.out.println(weeks[day - 1]);
        }

        scan.close();

    }
}