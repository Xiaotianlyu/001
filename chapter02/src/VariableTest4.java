public class VariableTest4 {
    public static void main(String[] args) {

        double d1 = 12;//自动类型提升

        //编译失败
        //int i1 = d1;

        int i2 = (int) d1;
        System.out.println(i2);

        long l1 = 123;

        //编译失败
        //short s1 = l1

        short s2 = (short) l1;
        System.out.println(s2);

        //练习
        int i3 = 12;
        float f1 = i3;//自动类型提升
        System.out.println(f1);

        //精度损失的例子1
        double d2 = 12.9;
        int i4 = (int) d2;
        System.out.println(i4);

        //精度损失的例子2
        int i5 = 128;
        byte b1 = (byte) i5;
        System.out.println(b1);

    }
}
