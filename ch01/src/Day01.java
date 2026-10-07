import ex1.Keyln;
import ex1.MyFirst;
import ex1.MySecond;

import java.security.Key;

public class Day01{
    public static void main(String[] args) {
        int x=10;
        int y=15;
        int z=5;
        int result =  z*20;
        System.out.println(result);

       MyFirst myFirst = new MyFirst();
        myFirst.printMyFirst();

       MySecond mySecond = new MySecond();
       mySecond.printJava();

       Keyln keyln = new Keyln();
       keyln.input();



    }

}