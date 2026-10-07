import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
//     byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
//
//     String str1 = new String(bytes);
//     System.out.println(str1);
//        String str2 = new String(bytes,2,3);
//        System.out.println(str2);
//
//
//       byte[] bytes1 = new byte[100];
//       System.out.print("입력 : ");
//       int readByteNo = System.in.read(bytes1);
//       System.out.println(readByteNo);
//       String str = new String(bytes1,0,readByteNo-2);
//       System.out.println(str);
//       System.out.println("=================");

//      String ssn = "010627-4230123";
//      char sex = ssn.charAt(7);
//      switch (sex){
//          case '1':
//          case '3':
//          System.out.println("남자");
//          break;
//          case '2':
//          case '4':
//          System.out.println("여자");
//          break;

        String 과목 = "국어 a 수학 A 영어 국어 체육";
        System.out.println(" 수강할 과목은? ");
        String 수강과목 = "국어";
        int 과목길이글자수 = 과목.length();
        System.out.println(과목길이글자수);
        int s = 과목.indexOf(65);//65는 아스키 코드값 65인 A를 찾으세요
        if ( s == -1) {
            System.out.println(수강과목 + "개설되지 않았어요");
        }else {
            System.out.println(수강과목 +" 의 인덱스는 " + s);
        }
        System.out.println(s);


        String a ="abcdef";
        String au = a.toUpperCase();
        System.out.println(a);

        String b = "AbEfG12";
        String bl = b.toLowerCase();
       System.out.println(bl);

       String c = "자바 프로그래밍 자바문법 자바응용";
       String pc = c.replace("자바","파이썬");
       System.out.println(pc);

        String c1 = "파이썬 프로그래밍 파이썬문법 파이썬응용";
        String pc1 = c1.replace("파이썬","인공지능");
        System.out.println(pc1);
//c문다열에 있는"프로그래밍" 출력
        String sc = c.substring(3,8);
        System.out.println(sc);
//c문다열에 있는 응용 출력
        String sc1 = c.substring(16,18);
        System.out.println(sc1);
  //tc의 문다열의 길이 문자갯수는?
        String tc = "    앞뒤 공백 지우기    ";
        int tl = tc.length();
        System.out.println(tl);
        String tt = tc.trim();
        tl = tt.length();
        System.out.println(tl);



      }



    }
