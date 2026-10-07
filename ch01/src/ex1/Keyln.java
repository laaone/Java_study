package ex1;

import java.util.Scanner;

public class Keyln {
    public  void input(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("키보드로 입력된 값:"+number);

        double  number2 = sc.nextDouble();
        System.out.println("키보드로 입력된 실수값:" + number2);
        //홍깅동 입력해서 홍길동 출력하기

        String   name = sc.next();
        System.out.println("키보드로 입력된 문자값:" + name);
    }
}
