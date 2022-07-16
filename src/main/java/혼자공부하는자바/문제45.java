package 혼자공부하는자바;

public class 문제45 {

    public static void main(String[] args) {
        int sum = 0;

        int i = 0;
        for(i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("i~" + (i-1) + "합 : " + sum);
    }

}
