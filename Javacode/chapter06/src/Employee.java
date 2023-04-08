public class Employee {
    //属性(成员变量）
    int id;
    String name;
    int age;
    double salary;

    //定义一个方法，用于显示员工的属性信息
    public void show(){
        System.out.println("id=" + id + ",name =" + name + ",age =" + age
                + ",salary =" + salary);
    }

}