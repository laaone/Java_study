import java.util.Scanner;

public class Personlnfo {

    public void 몸무게키(){
        int 몸무게;
        double 키;
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게 ==>");
        몸무게 = sc.nextInt();
        System.out.print("키 ==>");
       키 = sc.nextDouble();
       System.out.printf("%d %f", 몸무게,키);
    }
}

