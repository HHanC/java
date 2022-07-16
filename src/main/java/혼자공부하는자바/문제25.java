package 혼자공부하는자바;

public class 문제25 {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("-----------------------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("-----------------------");
        z = x++;
        System.out.println("Z=" + z);
        System.out.println("x=" + x);

        System.out.println("-----------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("X=" + x);

        System.out.println("-----------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

}
