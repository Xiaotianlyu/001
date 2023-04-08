package constructor;

/*
练习 1：编写两个类，TriAngle 和 TriAngleTest，其中 TriAngle 类中声明私有的
底边长 base 和高 height，同时声明公共方法访问私有变量。此外，提供类必要
的构造器。另一个类中使用这些公共方法，计算三角形的面积
 */
public class TriAngle {
    private double base;//底
    private double height;//高

    //声明公共方法访问私有变量
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public TriAngle() {

    }
    //构造器
    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //方法，计算三角形的面积
    public double findArea() {
        return base * height / 2;

    }


}
