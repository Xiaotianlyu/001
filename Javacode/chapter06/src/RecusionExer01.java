/*例题1：
已知：f(20)=1,f(21)=4,f(n+2)=2*f(n+1)+f(n)
n大于0的整数 求f（10）的值
 */
public class RecusionExer01 {
    public static void main(String[] args) {
        RecusionExer01 sum = new RecusionExer01();
        System.out.println(sum.f(10));
    }

    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }

}
