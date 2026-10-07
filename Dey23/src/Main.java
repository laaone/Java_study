import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1단계 컬렉션 만들기(덩어리 자료)
      ArrayList<Integer> list1 = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();

        list1.add(1); list1.add(2); list1.add(3); list1.add(4);
        set1.add(10); set1.add(20); set1.add(30); set1.add(40);
       //2단계 오리지널 스트림 만들기(한줄 자료).stream(), of() IntStream.range() 여러개 메소드
        //3단계 최동 스트림 만들기 .toList() 여러개
        System.out.println( list1.stream().toList() );
        System.out.println( set1.stream().toList());

      Stream<Integer> ls = list1.stream();
      System.out.println(ls.toList());
        ls = list1.stream();
      System.out.println(ls.toList());


        int[] a = {1,2,3};
        System.out.println(Arrays.stream( a ).sum());
      //1~10까지의 합
       System.out.println ( IntStream.range(1,11).sum());
               System.out.println( Stream.of(3,8,1,6,3,10,5,8,2,7).count());

        List<Integer> numbers = List.of(3,8,1,6,3,10,5,8,2,7);
        List<Integer> result = numbers
                              .stream()
                .map(n->n*n)
                              .distinct()
                               .sorted(Comparator.reverseOrder())
                           // .map(n->n+10)
                           // .filter(n->n%2==0)
                              .toList();
       System.out.println( result);





    }
}//