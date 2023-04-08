/*
去掉最高分和最低分，累加总分，
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        //声明三个特征值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];//累加总分
            if (max < scores[i]) {
                max = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }

        }
        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分和最低分之后，平均值为：" + avg);


    }
}
