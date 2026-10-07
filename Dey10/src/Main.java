import com.A;
import com.my.B;

import java.util.Calendar;
import java.util.concurrent.Callable;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

A a = new A();
B b = new B();

a.im();
a.age = 10;
A.s =10;
A.sm();


//System.out.println(Calculator.p1);
// System.out.println(Calculator.plus(10,20));
//
// SingLeton .getInstance() {
//            Calendar.getInstance();
//        }

ShopService.getInstance();
ShopService.getInstance();
ShopService s = ShopService.getInstance();
s.m(1);

    }
} //class