import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        Integer b = 20;
//        double c = 3.5;
//        Double d = 3.5;

        //기본형이 자료들 객체형으로 만들어준 클래스:Wrapper 클래스 포장
        //박싱 : 숫자를 객체에 넣기
        //언박싱: 객체에 있는 숫자를 기본형 숫자로 만들기

//      String s = "100";
//      int sa = Integer.parseInt(s);
//      int aa = 300;
//     String aas =String.valueOf(aa);
//
//     //true boolran(논리형) 바꾸기
//     String bb = "true";
//     Boolean bbb = Boolean.valueOf(bb);
//
//     //수학 Math클래스
//      System.out.println(Math.max(10,20));
//        System.out.println(Math.min(10,20));
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.round(3.1234));

//현재 날짜를 출력하기 아주 중요한 코드입니다.
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);

        sdf = new SimpleDateFormat("일년중 w주 ");
         strNow2 = sdf.format(now);
        System.out.println(strNow2);


        sdf = new SimpleDateFormat("한달중 W ");
        strNow2 = sdf.format(now);
        System.out.println(strNow2);

        sdf = new SimpleDateFormat("365일 중 D일 ");
        strNow2 = sdf.format(now);
        System.out.println(strNow2);



        Calendar now1 = Calendar.getInstance();

        int year = now1.get(Calendar.YEAR);//(1)
        System.out.println(year);

        int month = now1.get(Calendar.MONTH);
        System.out.println(month);//0월로 출력됨 예를들어 1월이면 0월로 나오니까 +1을 해주세요

     //16일 출력

        int day = now1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //Wednesdey
        int week = now1.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        String we = "일";
        if (week == 1 ) we="일";
        else if (week == 2 ) we="월";
        else if (week == 3 ) we="화";
        else if (week == 4 ) we="수";
        else if (week == 5 ) we="목";
        else if (week == 6 ) we="금";
        else if (week == 7 ) we="토";
        System.out.println( we + "요일");




    }
}//