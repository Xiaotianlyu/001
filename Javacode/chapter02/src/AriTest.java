public class AriTest {
    public static void main(String[] args) {

        //除法
        int m1 = 12;
        int m2 = 5;
        int k1 = m1 / m2;
        System.out.println(k1);
        System.out.println(m1 / m2 * m1);

        //取模：%
        int j1 = 12;
        int j2 = 5;
        System.out.println(j1 / j2);

        //前++：先自增+1，再赋值运算
        //后++：先赋值运算。再自增+1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1=" + a1 + "b1=" + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2=" + a2 + "b2=" + b2);

        //练习
        short s1 = 10;
        //编译不通过 s1 = s1 + 1;

        //方式一
        //s1 = (short) (s1 + 1);
        //System.out.println(s1);

        //方式二
        s1++;
        System.out.println(s1);

    }
}
