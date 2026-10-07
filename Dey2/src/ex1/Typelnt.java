package ex1;

public class Typelnt {
    public void  정수출력(){
        byte var1 = 10;
        short var2 = 20;
        int var3 = 30;
        long var4 = 40L;
        System.out.printf("%d %d %d %d ",var1,var2,var3,var4);

        String name = "홍길동";
        float avg = 10.12345678f;
        double x = 10.012345678901234567;
        System.out.printf("%s %.2f %.16f", name, avg, x );
    }
}
