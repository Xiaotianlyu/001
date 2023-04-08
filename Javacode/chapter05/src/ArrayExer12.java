//二分法查找：要求此数组必须是有序的。
public class ArrayExer12 {
    public static void main(String[] args) {
        int[] arr3 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int target = 5;//需要寻找的元素
        int head = 0;//默认首字母索引
        int end = arr3.length - 1;//默认尾字母索引

        boolean isFlag = false;//判断是否找到了指定元素

        while (head <= end) {
            int middle = (head + end) / 2;

            if (target == arr3[middle]) {
                System.out.println("找到了" + target + ",对应的位置为：" + middle);
                isFlag = true;
                break;
            } else if (target > arr3[middle]) {
                head = middle + 1;
            } else {//arget < arr3[middle]
                end = middle - 1;
            }
        }
        if(!isFlag){
            System.out.println("不好意思，没有找到元素");
        }

    }
}
