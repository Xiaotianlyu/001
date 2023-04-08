import java.awt.image.ImageFilter;
import java.lang.management.PlatformLoggingMXBean;

/**
 * ClassName:MyArrays
 * Description:
 * 自定义一个操作int[]的工具类
 * 涉及到的方法有：求最大值、最小值、总和、平均树、遍历数组、
 * 复制数组、数组反转、数组排序（从小到大）、查找等
 *
 * @author tianlyu
 * @version 1.0
 */

public class MyArrays {
    /**
     * 获取最大数值
     *
     * @param arr 要获取的数组
     * @return 数组中的最大值
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr) {

        return getSum(arr) / arr.length;
    }

    public void print(int[] arr) {

    }

    public int[] copy(int[] arr) {
        return null;
    }

    public void reverse(int[] arr) {

    }

    public void sort(int[] arr) {

    }

    public int linearSearch(int[] arr) {
        return 0;
    }
}
