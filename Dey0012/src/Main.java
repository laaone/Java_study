import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("   회사 DB 선택     ");
        System.out.println("===================");
        System.out.println();
        Scanner s = new Scanner(System.in);
        boolean run = true;
        Bussiness b = new Bussiness();

//while ( run ){
//    System.out.println(" 1. DB없음  | 2. mySQL | 3. Oracle | 4. 종료 ");
//    System.out.println("번호를 선택하기>");
//
//    int menu =s.nextInt();
//    switch (menu){
//        case 1: System.out.println("DB없이 실행합니다");break;
//        case 2: b.run( new Mysql() ); break;
//        case 3: b.run( new Oracle() ); break;
//        case 4: run = false; break;
//    }
//}

        Db a = new Mysql();
        Db a1 = new Oracle();

        System.out.println(a instanceof Mysql);//true
        System.out.println(a1 instanceof Oracle);//true
        System.out.println( a1 instanceof Mysql);//false
        System.out.println( a instanceof Oracle);//false

    }
}//end