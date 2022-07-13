package 혼자공부하는자바;

public class 문제9 {

    public static void main(String[] args) {
        char var1 = 'A'; // 유니코드 : 65
        char var2 = 'B'; // 유니코드 : 66
        char var3 = '가'; // 유니코드 : 44032
        char var4 = '각'; // 유니코드 : 44033

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        char c1 = 65; // 10진수
        char c2 = 0x0041; // 16진수

        System.out.println(c1);
        System.out.println(c2);

        char var5 = 'A';
        int var6 = 'A';

        System.out.println(var5);
        System.out.println(var6);
    }

}
