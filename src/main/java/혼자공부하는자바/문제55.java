package 혼자공부하는자바;

public class 문제55 {

    public static void main(String[] args) {
        int[] sores = {83, 90, 87};

        System.out.println("scores[0] : " + sores[0]);
        System.out.println("scores[1] : " + sores[1]);

        System.out.println("scores[2] : " + sores[2]);

        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += sores[i];
        }

        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }

}
