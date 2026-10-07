package ex1;

/*요구사항 명세서
1. 프로젝트명:진법 변환 프로그램


import java.util.Scanner;2.기능:정수형 숫자를 하나 입력받아 10진수, 16진수, 8진수로 출력하는 프로그램을 작성하시오.
        3.프로세스(처리(작업)순서)

변수 선언 → Scanner 객체 생성 → "정수를 입력하세요 ==>" 출력 → sc.nextInt()로 정수 입력 → System.out.printf("%d\n", 변수) 로 출력 (16진수 %x, 8진수 %o)
*/


import java.util.Scanner;

public class Ex1 {
    public void 진법변환(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 ==>");
        number = sc.nextInt();
        System.out.printf("10진수 %d\n", number);
        System.out.printf("8진수 %o\n", number);
        System.out.printf("16진수 %x\n", number);


    }
}

