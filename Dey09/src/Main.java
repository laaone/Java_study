import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        Member member = new Member();
        Member[ ] ma = new Member[5];

        ma[0] = new Member("최하얀", "a100", "1234", 23);
        ma[1] = new Member("김동수", "a200", "2345", 24);
        ma[2] = new Member("홍수진", "a300", "5678", 30);
        ma[3] = new Member("이미영", "a400", "7777", 15);
        ma[4] = new Member("박주명", "a500", "8888", 40);


        System.out.println();

        System.out.println("========================================");
        System.out.println("      회원 관리 프로그램                   ");
        System.out.println("========================================");
        System.out.println("    개발자     :    임라원");
        System.out.println("    버젼       :     2.0    ");
        System.out.println("");

        boolean run = true;
        while (run) {
            System.out.println("1. 전체회원 | 2. 아이디 찾기 | 3. 비밀번호 찾기 | 4. 비밀번호 수정 | 5. 종료");
            Scanner scanner = new Scanner(System.in);
            System.out.println("메뉴선택 >");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1: ma[0].printTitle();
                    for (int i = 0; i < ma.length; i++) { //i=0 1 2 3 4
                        ma[i].printAll();
                    }
                    break;

                case 2:
                  String nameinpt = ma[0].nameInput();
                  Member okna =[0].n(ma, nameinpt);

                case 3:



                case 4:

                case 5:run = false;
                    break;
            }


        } //end while

    } //end main
}// end class