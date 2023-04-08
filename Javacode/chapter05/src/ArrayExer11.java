public class ArrayExer11 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        int target = 5;

        //查找方式一： 线性查找
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + ",对应的位置为：" + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("不好意思，没有找到此元素");
        }

        //方式二： 线性查找
        int i = 0;
        for (; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + ",对应的位置为：" + i);
                break;
            }

        }

        if (i == arr1.length) {
            System.out.println("没有找到此元素");
        }
    }
}
