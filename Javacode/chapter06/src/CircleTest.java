public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.findArea();

        System.out.println("面积为："+c1.findArea2());
    }
}
