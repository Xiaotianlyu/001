public class ConditionTest {
    public static void main(String[] args) {

        //练习1 获取较大值
        int m = 10;
        int n = 20;

        int max = (m > n) ? m : n;
        System.out.println("较大值为：" + max);


        //练习2 获取较大值
        int i = 20;
        int j = 30;
        int k = 23;
        int tempMax = (i > j) ? i : j;
        int finalMax = (tempMax > k) ? tempMax : k;
        System.out.println(finalMax);
        
    }
}
