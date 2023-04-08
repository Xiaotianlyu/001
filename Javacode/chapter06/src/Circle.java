public class Circle {
    //属性
    double radius;

    //方法
    public void findArea() {
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }

    //或者
    public double findArea2() {
        return 3.14 * radius * radius;
    }
}
