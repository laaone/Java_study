//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {


        public static void main(String[] args) {

              Button button = new Button();
              button.setListener( new CallListener());
              button.touch();
              button.setListener( new MessageListener());
              button.touch();



//            A a = new A();
//            A.B.sbm();
//            A.B b = a.new B();
//            b.bm();
//            a.am();
//            a.amd();
//
//
//            A.C.scm();
//           A.C c = new A.C();
//           c.cm();
//
//           AA aa = new AA();
//           AA.BB bb = aa.new BB();
//
//            AA.CC cc = new AA.CC();
//
//            aa.aam();


        }
}

//    private static A.B ;

//    public static void main(String[] args) {
//
//    A a = new A();
//
//    A.B b  = a.new B();
//    b.field1 =3;
//    b.method1();
//
//    A.C c = new A.C();
//    c.field1 =3;
//    c.method1()
//






