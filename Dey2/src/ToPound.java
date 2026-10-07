import java.util.Scanner;

public class ToPound {
    public void kg(){
        double kg;
        Scanner sc = new Scanner(System.in);
        System.out.print(" kg ==>");
        kg = sc.nextDouble();
        System.out.printf(" %f",kg*2.2);

    }
}
