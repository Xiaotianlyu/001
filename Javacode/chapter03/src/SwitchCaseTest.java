/*
案例：编写程序：从键盘上输入2023年的"month"和"day",要求通过程序输出-输入的日期为2023年的第几天
 */

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        //1.使用scanner 从键盘获取2023年的month day
        Scanner input = new Scanner(System.in);

        System.out.println("请输入2023年的月份：");
        int month = input.nextInt();

        System.out.println("请输入2023年的天：");
        int day = input.nextInt();

        //2.使用switch-case实现分支结构
        int sumDays = 0;//记录天数
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;//28:二月份的天数
            case 2:
                sumDays += 31;//31:一月份的天数
            case 1:
                sumDays += day;
                break;
        }
        System.out.println("2023年" + month + "月" + day + "日是当前的第" + sumDays + "天");



        input.close();

    }
}
