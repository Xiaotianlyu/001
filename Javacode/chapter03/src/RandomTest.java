/*获得一个随机整数
 1.使用Java提供的API：Math类的random（）
 2.random调用后会返回一个【0.0,1.0)范围的double随机数

 3.需求1：获取一个[0,100]的随机整数
   需求2：获取一个[0,100]的随机整数

 4.获取一个[a,b]的随机数
  (int)(Math.random()*(b-a+1))+a
 */

public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println("d1=" + d1);

        int number1 = (int) (Math.random() * 101);
        //[0.0,1.0)  [0,101)  [0,100]
        System.out.println("num1=" + number1);

        int number2 = (int) (Math.random() * 100) + 1;
        //[0.0,1.0)  [0,100)  [0,99]  [1,100]
        System.out.println("num2=" + number2);

    }

}
