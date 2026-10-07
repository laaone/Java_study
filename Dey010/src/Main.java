import Member.Member;
import Member.Calculator;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

  System.out.println("  학원명  ,  이름  ,  전화번호  ,  개월  ,  수강료  ");
  System.out.println("_______________________________________________");
        Member[] m = new Member[3];
       m[0] = new Member(  "이수민",  "010-123-4567 ",  2 );
        m[1] = new Member("김수연" , "010-898-5555" ,  1  );
        m[2] = new Member("박진영" , "010-999-7777" ,  3 );


        Calculator a = Calculator.getInstance();
        int[] 수강료 = new int[3];
        수강료[0] = a.수강료(m[0].getMonyh());
        수강료[1] = a.수강료(m[1].getMonyh());
        수강료[2] = a.수강료(m[2].getMonyh());

     System.out.println(Member.학원명 +"   "+m[0].getName() + m[0].getTel() + m[0].getMonyh() + 수강료[0]  );
        System.out.println(Member.학원명 +"   "+m[1].getName() + m[1].getTel() + m[1].getMonyh() + 수강료[1]  );
        System.out.println(Member.학원명 +"   "+m[2].getName() + m[2].getTel() + m[2].getMonyh() + 수강료[2]  );

    }
}//Main