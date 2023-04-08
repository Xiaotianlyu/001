public class personTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        //调用属性
        p1.age = 13;
        p1.name = "amy";
        p1.gender = '女';

        //调用方法
        p1.study();
        p1.addAge(3);
        int age = p1.showAge();

        System.out.println("age = " + age);

        Person p2 = new Person();
        System.out.println(p2.age);//0

        p2.addAge(10);

        System.out.println(p2.showAge());//10
        System.out.println(p1.showAge());//16


    }
}
