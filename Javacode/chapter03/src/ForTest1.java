/*
题目：输出所有水仙花数
例如：152 = 1*1*1 + 3*3*3 + 5*5*5
 */
public class ForTest1 {
    public static void main(String[] args) {
        //遍历所有的三位数
        for (int i = 100; i <= 999; i++) {

            //针对每一个三位数i 获取其各个位数上的数值
            int ge = i % 10;
            int shi = i % 100 / 10; //shi = i / 10 % 10
            int bai = i / 100;

            //判断是否满足水仙花数
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
                System.out.println(i);
            }

        }

    }
}
