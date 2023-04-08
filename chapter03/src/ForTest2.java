/*
说明：输入两个正数m、n,求最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。
约数：12：1.2.3.4.6.12
     20：1.2.4.5.10.20
倍数：12：12.24.36.48.60.....
     20:20.40.60.....
 */
public class ForTest2 {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;

        //获取mn中的较小值
        int min = (m < n) ? m : n;

        //需求一：最大公约数
        //方式一：
        int result = 1;
        for (int i = 1; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                //System.out.println(i);
                result = i;
            }
        }
        System.out.println(result);

        //方式二：推荐
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }

        //需求2：最小公倍数
        int max = (m > n) ? m : n;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }

    }


}
