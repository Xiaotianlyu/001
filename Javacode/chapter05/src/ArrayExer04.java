/*
案例：定义一个int一维数组,包含10个元素，分别随机赋予一些整数【10，99】，然后求出所有元素的最大值 最小值 总和 平均值 并输出。
 */

public class ArrayExer04 {
    public static void main(String[] args) {
        //动态初始化方式创建数组
        int[] arr = new int[10];

        //通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        //求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);

        //求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);

        //求平均值
        int avgValue = sum / arr.length;
        System.out.println("平均值为：" + avgValue);
    }
}
