public class BankAccount {

    String owner = "홍길동";
    int balance = 10000;

    void deposit(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");}
        balance += amount;
    }
    void withdraw(int amount) throws InsufficientBalanceException,IllegalArgumentException {
        if ( amount<0){ throw new IllegalArgumentException("출금액은 0보다 커야 합니다.");}
        if ( amount> balance ){ throw new InsufficientBalanceException("잔액이 부족합니다."); }
        balance -= amount;
    }


}