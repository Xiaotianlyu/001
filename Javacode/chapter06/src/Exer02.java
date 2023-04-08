
public class Exer02 {
    public static void main(String[] args) {
        //创建exer02的对象
        Exer02 exer = new Exer02();
        //exer.method1();
        //int area = exer.method2();
        //System.out.println("面积为：" + area);

        int area1 = exer.method3(8, 3);
        System.out.println("面积为：" + area1);

    }

    public void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;

    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;

    }


}
