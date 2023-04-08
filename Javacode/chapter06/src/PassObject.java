/*
（1）定义一个 Circle 类，包含一个 double 型的 radius 属性代表圆的半径，一
个 findArea()方法返回圆的面积。 （2）定义一个类 PassObject，在类中定义一
个方法 printAreas()，该方法的定义如下：public void printAreas(Circle c, int
time)，在 printAreas 方法中打印输出 1 到 time 之间的每个整数半径值，以及对
应的面积。例如，times 为 5，则输出半径 1，2，3，4，5，以及对应的圆面
积。 （3）在 main 方法中调用 printAreas()方法，调用完毕后输出当前半径
值。程序运行结果如图所示。
 */
public class PassObject {
    public void printAreas(Circle2 c, int time) {
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.r = i;
            System.out.println(c.r + "\t\t" + c.findArea());
        }

        c.r = i;

    }

    public static void main(String[] args) {
        PassObject object = new PassObject();
        Circle2 circle = new Circle2();

        object.printAreas(circle, 5);

        System.out.println("now circle is " + circle.r);
    }
}
