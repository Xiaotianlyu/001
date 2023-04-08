/*
举例 2：使用简单数组
(1)创建一个名为 ArrayTest 的类，在 main()方法中声明 array1 和 array2 两个变
量，他们是 int[]类型的数组。
(2)使用大括号{}，把 array1 初始化为 8 个素数：2,3,5,7,11,13,17,19。
(3)显示 array1 的内容。
(4)赋值 array2 变量等于 array1，修改 array2 中的偶索引元素，使其等于索引值
(如 array[0]=0,array[2]=2)。打印出 array1。 array2 = array1;
 */
public class ArrayExer07 {
    public static void main(String[] args) {
        //main()方法中声明 array1 和 array2
        int[] array1, array2;

        //使用大括号{}，把 array1 初始化为 8 个素数：2,3,5,7,11,13,17,19。
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //显示 array1 的内容
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        //赋值 array2 变量等于 array1，修改 array2 中的偶索引元素，使其等于索引值
        array2 = array1;
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0){
                array2[i] = i;
            }

        }
        System.out.println();

        /*复制array2 等于 array1
         array2 = new int[array1.length];
        for (int i = 0; i <array1.length ; i++) {
            array2[i] = array1[i];
        }
         */

        //打印array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }


    }
}
