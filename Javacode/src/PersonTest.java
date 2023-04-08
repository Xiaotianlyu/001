/*
练习 1：
创建程序：在其中定义两个类：Person 和 PersonTest 类。定义如下：
用 setAge()设置人的合法年龄(0~130)，用 getAge()返回人的年龄。在
PersonTest 类中实例化 Person 类的对象 b，调用 setAge()和 getAge()方法，体
会 Java 的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.getAge());

    }

}
