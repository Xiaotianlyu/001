public class FloatDoubleExercise {
    public static void main(String[] args) {
        //定义圆周率变量
        double pi = 3.14;

        //定义三个圆的半径
        double r1 = 1.2;
        double r2 = 2.5;
        int r3 = 6;

        //计算面积
        double area1 = pi * r1 * r1;
        double area2 = pi * r2 * r2;
        double area3 = pi * r3 * r3;

        //计算面积
        System.out.println("圆1的半径为：" + r1 + "，面积为" + area1 );
        System.out.println("圆1的半径为：" + r2 + "，面积为" + area2 );
        System.out.println("圆1的半径为：" + r3 + "，面积为" + area3 );
    }
}

