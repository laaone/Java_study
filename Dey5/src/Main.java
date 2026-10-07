import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.


//        int score = 80;
//
//        if ((score >= 90)) {
//            System.out.println("점수가 90보다 큽니다.");
//            System.out.println("등급은 A입니다.");
//
//        }
//        if (score < 90) {
//            System.out.println("점수가 90보다 작습니다.");
//            System.out.println("등급은 B입니다.");
//        }
//
//
//        int num = (int) ((Math.random()) * 6) + 1;
//
//        if (num == 1) {
//            System.out.println("1번이 나왔습니다.");
//        } else if (num == 2) {
//            System.out.println("2번이 나왔습니다.");
//        } else if (num == 3) {
//            System.out.println("3번이 나왔습니다.");
//
//        } else if (num == 4) {
//            System.out.println("4번이 나왔습니다.");
//        } else if (num == 5) {
//            System.out.println("5번이 나왔습니다.");
//        } else {
//            System.out.println("6번이 나왔습니다.");
//
//        }
//
//
//        int height = 175;
//        double weoght = 55.2;
//
//        if (weoght <= (height - 100) * 0.9) {
//            System.out.println("정상");
//
//        } else {
//            System.out.println("비만");
//
//        }
//
//        System.out.println("어떤 혜택을 원하세요?");
//        char grade = 'K';
//        switch (grade) {
//            case 'A':
//                System.out.println("VVIP 혜택을 받으실 수 있습니다.");
//            case 'B':
//                System.out.println("VIP 혜택을 받으실 수 있습니다.");
//                break;
//            case 'C':
//                System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
//            case 'D':
//                System.out.println("일반 횐원 혜택을 받으실 수 있습니다.");
//                break;
//            default:
//                System.out.println("혜택이 없습니다.");
//        }
//        System.out.println("감사합니다.");

//        int i=0, sum=0;
//        while (i< 10 ){
//            System.out.print(i + " ");
//            i++;
//            sum = sum +i;
//
//        }
//        System.out.print(sum + " ");

//        int j = 10;
//        while (j >= 1) {
//            System.out.print(j + " ");
//            j--;
//
//
//        }
//
//
//     System.out.println("..................");
//        int k=0;
//        while ( k <= 30) {
//            System.out.print(k + " ");
//            if (k == 20) break;
//
//      int j =10;
//      while ( j >= 1){
//
//          j--;
//          if ( j==4 ) continue;
//          System.out.print(j + "   ");
//
//
//         int sum =0;
//        for (int i= 1; i<= 100 ; i++){
//           if (i% 3==0) sum += i;
//
//        }
//     System.out.println( sum);

//        while (true) {
//            int n1 = (int) (Math.random() * 6) + 1;
//            int n2 = (int) (Math.random() * 6) + 1;
//            System.out.println(n1 + "던진 주사위 눈의 수 =" + n2);
//
//            if (n1 + n2 == 5) {
//                System.out.println(n1 + " 두 눈의 합이 5입니다." + n2);
//                break;
//            }
//        }
//
//
//        int n1 = (int) (Math.random() * 6) + 1;
//        int n2 = (int) (Math.random() * 6) + 1;
//
//        while (n1 + n2 != 5) {
//            n1 = (int) (Math.random() * 6) + 1;
//            n2 = (int) (Math.random() * 6) + 1;
//
//            System.out.println(n1 + "  " + n2);
//
//
//        }
//
//
//        int n3 =(int)(Math.random()  * 6 ) +1;
//        int n4 =(int)(Math.random() *6 ) +1;
//
//        while(n3 + n4 != 5 ){
//            n3 = (int)(Math.random() *6 ) +1;
//            n4 = (int)(Math.random() *6 ) + 1;
//            System.out.println( n3 + "  " + n4);
//
//        }
//
//System.out.println( "두눈의 합이 5입니다." + n3 +"  " + n4);


//      for (int x=1; x <= 10; x++){
//          for ( int y=1 ; y <= 10; y++){
//              if (4*x +5*y ==60 ) System.out.println( "(" + x + " ," + y + " )" );
//
//              }
//          }
//      boolean run = true;
//      int balance = 0;
//             Scanner scanner = new Scanner(System.in);
//
//
//     while (run){
//         System.out.println("--------------------");
//         System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//         System.out.println("---------------------");
//
//         int menu = scanner.nextInt();
//         switch (menu){
//             case 1: //예금액 입력받기
//                     {System.out.println("예금액>");
//                         int money = scanner.nextInt();
//                         balance += money;
//                         break;
//                     }
//             case 2://출금액 입력받기
//                     {
//                         System.out.print("출금액> ");
//                         int money = scanner.nextInt();
//                         if (balance >= money) {
//                             System.out.println("출금액" + money);
//                             balance -= money;
//                         } else {
//                             System.out.println(" 당신의 잔고는 " + balance + "입니다.잔고가 부족합니다");
//                         }
//                         break;
//                     }
//             case 3://잔고 출력
//                    {System.out.println("잔고> " + balance);break;}
//             case 4: { run=false; break;}
//             default: System.out.println( "1~4사이의 숫자를 입력하세요");
//         }
//     }
//
//        System.out.println( "프로그램 종료");


 boolean run = true;
 int balance = 0;
 Scanner scanner =new Scanner(System.in);
  while (run){System.out.println( "-----------");
  System.out.println( "1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
  System.out.println( "-------------");

  int menu = scanner.nextInt();
  switch ( menu){
      case 1:                                                       
  }




    }
}

