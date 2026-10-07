import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Consumer<String> c1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
               //코드작성



            }
        };
        Consumer<String> c2 =  s -> {
            System.out.println(s+ "소비한다");
        };
c2.accept(" 떡복이 ");
c2.accept(" 돈 ");

       ObjIntConsumer<Member> dbj = (Member m, int a)->{
           System.out.println( m.getName()+ " " + a);
       };
       dbj.accept( new Member( "홍길동",20),500);

        IntSupplier is =  ()-> { return 50; };
        System.out.println( is.getAsInt());

        IntToDoubleFunction itdf = (int value)->{
            return value; };
        System.out.println( itdf.applyAsDouble(100));

        IntFunction<String> ifu = (int value)->{
            return String.valueOf(value); };
        System.out.println( ifu.apply(80 )+"  " + 100);

      //~~~~~~~~

     double maleAvg = PredicateExample.avg( (Student t)-> t.getSex().equals( "남자") );
     System.out.println( "남자평균" + maleAvg);
   Predicate<Student> pr = (Student t)-> { return t.getSex().equals("남자"); };
   System.out.println( pr.test( new Student("홍길동", "남자", 90)));
  List<String> ss = PredicateExample.printName((Student t)-> t.getScore() >=92);
  System.out.println(ss);



    }



}