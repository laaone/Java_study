import member.Audio;
import member.Television;
import member.비지니스;
import member.에어컨;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
   비지니스 m =new 비지니스();
   m.run( new Television(7));
   m.run( new Audio(8));
   m.run( new 에어컨(24));





    }
}