package 혼자공부하는자바;

public class 문제28 {

    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        // char c3 = c2 + 1; -> char변수가 산술 연산에서 사용되면 int 타입으로 변환되므로 연산 결과는 int 타입이 됨
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        // System.out.println("c3 : " + c3);
    }

}
