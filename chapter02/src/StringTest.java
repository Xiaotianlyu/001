public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";
        String str3 = "a";

        //测试连接运算
        int num1 = 10;
        boolean b1 = true;
        String str4 = "Hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num1;
        System.out.println(str6);

        int number2 = 10;
        String str9 = number2 + "";

        /*编译不能通过
        String str7 = b1 + num1 + st4;
        System.out.println(str7);
        */

        int number3 = Integer.parseInt(str9);
        System.out.println(number3);
    }
}
