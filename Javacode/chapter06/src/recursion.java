/*
举例 1：计算 1 ~ 100 的和
 */
public class recursion {
    public static void main(String[] args) {
        recursion demo = new recursion();
        int n = 5;
        int sum = demo.getSum1(n);
        System.out.println(sum);

        int sum2 = demo.getMul(n);
        System.out.println(sum2);
    }

    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getSum1(num - 1) + num;
        }

    }

    //举例 2：递归方法计算 n!
    public int getMul(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getMul(num - 1) * num;
        }
    }

}
