/*
案例 3：从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
• 成绩>=最高分-10 等级为’A’
• 成绩>=最高分-20 等级为’B’
• 成绩>=最高分-30 等级为’C’
• 其余 等级为’D’
提示：先读入学生人数，根据人数创建 int 数组，存放学生成绩。
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayExer03 {
    public static void main(String[] args) {
        //1.从键盘输入学生的人数,根据人数创建动态数组（初始化）
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int count = scan.nextInt();

        int[] score = new int[count];

        //2.根据提示，依次输入学生成绩，并保存在数组元素中
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();
        }

        //3.获取学生成绩的最大值
        int maxScore = score[0];
        for (int i = 0; i < score.length; i++) {
            if (maxScore < score[i]) {
                maxScore = score[i];
            }
        }
        System.out.println("最高分是：" + maxScore);

        //4.遍历数组根据学生成绩与最高分的差值，得到每个学生成绩的等级，并输出成绩和等级
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= maxScore - 10) {
                System.out.println("student" + i + "score is" + score[i] + "grade is A");
            }else if (score[i] >= maxScore - 20) {
                System.out.println("student" + i + "score is" + score[i] + "grade is B");
            }else if (score[i] >= maxScore - 30) {
                System.out.println("student" + i + "score is" + score[i] + "grade is C");
            }else {
                System.out.println("student" + i + "score is" + score[i] + "grade is D");
            }

        }scan.close();

    }
}
