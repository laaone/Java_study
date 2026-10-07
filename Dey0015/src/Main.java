//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        try {
        매니저 ma = new 매니저();
        BankAccount ba = new BankAccount();
        ma.title(ba);
        ma.input(ba);
        } catch (InsufficientBalanceException e) {
          System.out.println("[잔액이 부족한 에러]"+e.getMessage() );
        }catch (IllegalArgumentException e){
            System.out.println("[입/출금액이 0보다작은수 입력 에러]"+e.getMessage() );
        }finally {
            System.out.println("데이터베이스 닫기, 로그오프");
        }


    }

}//