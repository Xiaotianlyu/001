public class ForTest {
    public static void main(String[] args) {
        //1.输出5行HelloWorld
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }

        System.out.println();//换行

        //2.遍历1-100内的偶数，并获取偶数个数，获取所有偶数的和
        int count = 0;//记录偶数个数
        int sum = 0;//记录偶数之和

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的和=" + sum);
    }
}
