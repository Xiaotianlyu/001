import java.sql.SQLOutput;
import java.util.Scanner;

/*
1.声明员工类别employee，
-包含属性：姓名、性别、年龄、电话，属性私有化
-提供get/set方法
-提供String getIngo()方法
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //创建employee的数组
        Employee[] employees = new Employee[2];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("----------添加第" + (i + 1) + "个员工-------------");

            System.out.print("姓名：");
            String name = scan.next();

            System.out.print("性别：");
            char gender = scan.next().charAt(0);

            System.out.print("年龄：");
            int age = scan.nextInt();

            System.out.print("电话");
            String number = scan.next();

            //给指定对象各个属性赋值
            employees[i].setAge(age);
            employees[i].setGender(gender);
            employees[i].setName(name);
            employees[i].setNumber(number);

        }

        //遍历员工列表
        System.out.println("----------员工列表------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");

        for (int i = 0; i < employees.length; i++) {

            System.out.print(i + 1);
            System.out.println("\t"+employees[i].getInfo());

        }

        System.out.println("----------员工列表完成------------");
    }

}
