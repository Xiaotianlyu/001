public class ArrayExer09 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        //扩容一倍
        //int[] newArr = new int[arr.length * 2];
        //或
        int[] newArr = new int[arr.length << 1];

        //将原有数组中的元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];

        }
        //将10，20，30添加到新数组中去
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        //将新数组中的地址赋值给原有数组变量
        arr = newArr;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }

    }
}
