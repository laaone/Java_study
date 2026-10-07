package 이중클래스;

public class 매니저 {

    public void play(){
      A.sm();
      A.B.sibm();
      A a = new A();
      a.am();
      A.B b = a.new B();
      b.ibm();

     A.C.sicm();
     A.C c = new A.C();
     c.icm();
 //매소드안에있는 D클래스 실행하기
 a.cm();


    }




}
