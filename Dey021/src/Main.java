import java.util.Iterator;
import java.util.TreeSet;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TreeSet 장점 정력 검색 빠름
        //          단점
     TreeSet<Integer> set1 = new TreeSet<Integer>();
     set1.add( 93 );
     set1.add( 100 );
     set1.add( 85 );
     set1.add( 63 );
     set1.add( 74 );
      Iterator<Integer> it1 = set1.iterator();
    while (it1.hasNext()){
       Integer n = it1.next();
       System.out.println(n);
        System.out.println( set1.last());
        System.out.println( set1.first());
        System.out.println( set1.higher(90));


    }
TreeSet<String> set2 = new TreeSet<String>();
    set2.add("김");
    set2.add("이");
    set2.add("서");
    set2.add("홍");
    Iterator<String> it2 = set2.iterator();
    while (it2.hasNext()){
        String s =it2.next();
        System.out.println(s);

    }
 TreeSet<Member> member2 = new TreeSet<Member>();
   member2.add(new Member("김",100));
   member2.add(new Member("이",80));
   member2.add(new Member("서",98));
   member2.add(new Member("홍",60));
   Iterator<Member> it3 = member2.iterator();
   while (it3.hasNext()){
      Member m = it3.next();
      System.out.println(m);
      System.out.println(m.getName() + " " + m.getNumber());
   }
    }

    }
