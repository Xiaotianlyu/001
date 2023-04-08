public class AriExercise1 {
    public static void main(String[] args) {

        int number1 = 153;
        int ge = number1 % 10;
        int shi = number1 % 100 / 10; //int shi = number1 / 10 % 10;
        int bai = number1 / 100;

        System.out.println("个位数是："+ge);
        System.out.println("十位数是："+shi);
        System.out.println("百位数是："+bai);
    }
}

