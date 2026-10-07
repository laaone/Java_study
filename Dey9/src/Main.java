import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Member member = new Member();
        member.setName("최햐얀");
        member.setAge(23);
        System.out.println(member.getName() + " " + member.getAge());


        // 1 배열
        Member[] ma = new Member[5];
        //2. 5명의 객체를 생성해서 배열 인덱스 순서대로 넣는다.
        ma[0] = new Member("최하얀", "a100", "1234", 23);
        ma[1] = new Member("김동수", "a200", "2345", 24);
        ma[2] = new Member("홍수진", "a300", "5678", 30);
        ma[3] = new Member("이미영", "a400", "7777", 15);
        ma[4] = new Member("박주명", "a500", "8888", 40);

        ma[0].printTitle();
        for (int i = 0; i < ma.length; i++) {
            ma[i].printAll();
        }

//        String idFind = ma[0].idInput();
//       Member okMa = ma[0].idSearch(ma,idFind);
//       if ( okMa == null ) System.out.println( idFind + "이름이 없슴니다.");
//       else System.out.println( " 이름 :"+okMa.getName() + "아이디:" +okMa.getId());

//이름을 입력하면 아S
        System.out.println("========================================");
        System.out.println("      회원 관리 프로그램                   ");
        System.out.println("========================================");
        System.out.println("    개발자     :    임라원");
        System.out.println("    버젼       :         ");
        System.out.println("");

        boolean run = true;
        while (run) {
            System.out.println("1. 전체회원 | 2. 아이디 찾기 | 3. 비밀번호 찾기 | 4. 비밀번호 수정 | 5. 종료");
            Scanner scanner = new Scanner(System.in);
            System.out.print("메뉴선택 > ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    ma[0].printTitle();
                    for (int i = 0; i < ma.length; i++) { //i=0 1 2 3 4
                        ma[i].printAll();
                    }

                    break;
                case 2:
                    String nameinput = ma[0].nameInput();
                    Member okna = ma[0].n(ma, nameinput);
                    if (okna == null) System.out.println(nameinput + "그런 이름이 없습니다");
                    else System.out.println("아이디:" + okna.getId());
                    break;

                case 3:
                    String idFind = ma[0].idInput(); //키보드로 아이디 입력받기
                    Member okMa = ma[0].idSearch(ma, idFind);
                    if (okMa == null) System.out.println(idFind + " 아이디가 없습니다.");
                    else System.out.println("아이디 :" + okMa.getId() + " 비밀번호 : " + okMa.getPassword());
                    break;

                case 4:
                    System.out.println("  << 비밀번호 바꾸기 >> ");
                    idFind = ma[0].idInput();
                    okMa = ma[0].idSearch(ma, idFind);
                    if (okMa == null) System.out.println(idFind + " 아이디가 없습니다.");
                    else System.out.println("현재 비밀번호는  " + okMa.getPassword() + "입니다");

                    String pw1 = ma[0].passwordInput("바꿀 비밀번호는? ");
                    String pw2 = ma[0].passwordInput("바꿀 비밀번호는 한번 더 입력?");
                    if (pw1.equals(pw2)) {
                        okMa.setPassword(pw1);
                        System.out.println("바뀐 비밀번호는 " + okMa.getPassword() + "입니다");
                    } else {
                        System.out.println("새로 입력한 두개의 비밀번호가 서로 다릅니다. ");
                        break;
                    }
                case 5:
                    run = false;
                    break;

            }

        }
    }

}




