package constructor;


/*
练习 1：编写两个类，TriAngle 和 TriAngleTest，其中 TriAngle 类中声明私有的
底边长 base 和高 height，同时声明公共方法访问私有变量。此外，提供类必要
的构造器。另一个类中使用这些公共方法，计算三角形的面积
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.findArea();
    }

}
