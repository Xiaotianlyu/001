public class IfElseTest1 {
    public static void main(String[] args) {

        int score = 63;

        if (score == 100) {
            System.out.println("奖励跑车");
        } else if (score > 80 && score <= 90) {
            System.out.println("奖励山地自行车");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }
    }

}