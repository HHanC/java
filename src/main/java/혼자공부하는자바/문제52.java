package 혼자공부하는자바;

public class 문제52 {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }

}
