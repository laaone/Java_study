import java.util.Scanner;

public class 매니저 {

    void title( BankAccount ba){
        System.out.println("  예금 출금  ");
        System.out.println("예금주:" + ba.owner);
        System.out.println("초기잔액:" + ba.balance);
        System.out.println("1: 예금 2: 출금 3: 잔액 4: 종료");

    }
    void input(BankAccount ba) throws InsufficientBalanceException,IllegalArgumentException{
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int menu = 4;

        while( run ){
            System.out.println("1: 예금  2: 출금  3: 잔액 4: 종료");
            menu = sc.nextInt();
            switch (menu){
                case 1: {System.out.println("[입금]");
                int money = sc.nextInt();
                ba.deposit(money);
                break;}
                case 2: {
                    System.out.println("[출금]");
                    int money = sc.nextInt();
                    ba.withdraw(money);
                    break;
                }
                case 3:{ System.out.println("[현재잔액]:"+ ba.balance);}
                case 4: run=false; break;
            }
        }
    }
}
