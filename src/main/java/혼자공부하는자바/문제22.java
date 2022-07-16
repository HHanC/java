package 혼자공부하는자바;

public class 문제22 {

    public static void main(String[] args) throws Exception{
        int keyCode;

        while(true){
            keyCode = System.in.read();
            System.out.println("keyCode : " + keyCode);
            if(keyCode == 113){
                break;
            }
        }
        System.out.println("종료");
    }

}
