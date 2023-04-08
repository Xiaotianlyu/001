import java.sql.SQLOutput;

public class AriExercise2 {
    public static void main(String[] args) {

        //练习：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？

        int hours = 89;
        int day = hours / 24;
        int hour = hours % 24;

        System.out.println("共奋战：" + day + "天" + hour + "小时");
    }
}
