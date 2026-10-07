package ex1;

public class Ex2 {


    public  void 데이터형크기(){
        byte var1 = 10;
        short var2 = 29;
        int var3 = 38;
        long var4 = 48L;
        float var5 = 1.2f;
        double var6 = 1.2;
        char var7 = 'a';
        System.out.println("byte형의 크기 ===>" + Byte.SIZE);
        System.out.println("Short형의 크기 ===>" + Short.SIZE);
        System.out.println("Integer형의 크기 ===>" + Integer.SIZE);
        System.out.println("byte형의 크기 ===>" + Long.SIZE);
        System.out.println("byte형의 크기 ===>" + Float.SIZE);
        System.out.println("byte형의 크기 ===>" + Double.SIZE);
        System.out.println("byte형의 크기 ===>" + Character.SIZE);
    }
}
/*
1.프로젝트명:데이터형 크기 확인 프로그램
2. 처리내용:각 데이터형의 크기를 확인하는 프로그램을 작성하시오. (힌트: Byte.SIZE 등 활용)
3. 프로세스 (처리순서)
각 변수를 선언하고 값을 넣은다-> 힌트를 보면서 크기를 구하서 출력한다.
4.결과화면
byte형의 크기 ===> 8
short형의 크기 ===> 16
int형의 크기 ===> 32
long형의 크기 ===> 64
float형의 크기 ===> 32
double형의 크기 ===> 64
char형의 크기 ===> 16
 */
