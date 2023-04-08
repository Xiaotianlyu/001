public class WhileTest {
    public static void main(String[] args) {
        //需求一：遍历50次 HelloWorld
        int i = 1;
        while (i <= 50) {
            System.out.println("HelloWorld");
            i++;
        }
        //需求二：遍历1-100以内的偶数，并获取偶数个数。获取所有偶数的和
        int j = 1;
        int count = 0;//记录偶数个数
        int sum = 0;//记录偶数之和
        while (j <= 100) {
            if (j % 2 == 0) {
                System.out.println(j);
                count++;
                sum +=j;
            }

            j++;
        }
        System.out.println("偶数个数是"+count);
        System.out.println("偶数之和是"+sum);
    }
}
