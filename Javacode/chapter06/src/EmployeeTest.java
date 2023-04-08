public class EmployeeTest {
    public static void main(String[] args) {

        //创建一个实例
        Employee emp1 = new Employee();

        System.out.println(emp1);//地址值

        emp1.id = 10001;
        emp1.age = 20;
        emp1.salary = 1900000;

        //System.out.println("id=" + emp1.id + ",name =" + emp1.name + ",age =" + emp1.age
        //                + ",salary =" + emp1.salary);

        //替换成方法
        emp1.show();

        //创建第二个实例
        Employee emp2 = new Employee();

        emp2.salary = 180000;
        emp2.id = 20;

        /*System.out.println("id=" + emp2.id + ",name =" + emp2.name + ",age =" + emp2.age
                + ",salary =" + emp2.salary);

         */
        emp2.show();

    }
}
