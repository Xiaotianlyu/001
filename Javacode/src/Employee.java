/*
1.声明员工类别employee，
-包含属性：姓名、性别、年龄、电话，属性私有化
-提供get/set方法
-提供String getIngo()方法
 */
public class Employee {
    //设置属性
    private String name;
    private char gender;
    private int age;
    private String number;

    //设置方法get/set方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char g) {
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setNumber(String n) {
        number = n;
    }

    public String getNumber() {
        return number;
    }

    //设置String getInfo()方法
    public String getInfo() {
        return name + "\t" + gender + "\t" + age + "\t" + number;
    }

}
