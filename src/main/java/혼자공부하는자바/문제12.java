package 혼자공부하는자바;

public class 문제12 {

    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("inValue : " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);
    }

}
