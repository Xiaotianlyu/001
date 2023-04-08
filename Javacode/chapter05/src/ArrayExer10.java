import java.sql.SQLOutput;

public class ArrayExer10 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        int deleteIndex = 4;

        /*//方式一：不新建数组
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        //修改最后元素设置为默认值
        arr[arr.length - 1] = 0;

         */

        //方式二：新建数组，长度比原来的少1
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArr[i] = arr[i];
        }

        for (int i = deleteIndex; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        arr = newArr;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
