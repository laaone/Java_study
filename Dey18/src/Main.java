import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {


        List<Person> personList = new LinkedList<Person>();
        personList.add( new Person("박수진",25));
        personList.add( new Person("이수진",20));
        personList.add( new Person("최수진",23));
        personList.add( new Person("김수진",24));
        personList.add( new Person("박수진",25));
        personList.add( new Person("최수진",23));
    //최수진 출력
        System.out.println(personList.get(2).getNeme());
        //나이모두 더하기
        int  ageSum = personList.get(0).getAge() + personList.get(1).getAge()+personList.get(2).getAge()+personList.get(3).getAge()+personList.get(4).getAge();
        System.out.println( ageSum);
        //3번 인덱스에 new Person("정수진",20)삽입하기
        personList.add(3,new Person("정수진",20));

        //1번 인덱스 를 수정하기 "홍수진",28
        personList.set(1,new Person("홍수진",28));
        //4번 인덱스 삭제
        personList.remove(4);

        //동인한 사람 출력

       for (int i=0; i<personList.size(); i++){
           for (int j=0; j<personList.size(); j++){
               if (i==j)continue;
               if (personList.get(i).equals(personList.get(j))){
                   System.out.println("같은 사람"+ personList.get(i).getNeme());


               }
           }
       }
       for (int i=0; i<personList.size(); i++){
           System.out.println( personList.get(i).getNeme()+ "  " + personList.get(i).getAge());
       }
        System.out.println("=====================================");





        int[] a = new int[10];//한번 크기를 만들면 크기변경이 안됨


       List<Member> memberList = new Vector<Member>();
       memberList.add(new Member("홍길동","2601"));
        memberList.add(new Member("홍길수","2602"));
        memberList.add(new Member("홍미동","2603"));
        memberList.add(new Member("홍길동","2601"));
//홍길동 2601과 홍길수 2602학번이 같은가?

        if (memberList.get(0).equals(memberList.get(3))){

           System.out.println("같은 사람");
        }else{
            System.out.println("다른 사람");
        }

        // 홍미동 출력하기
        System.out.println( memberList.get(2).getName() );
        // 2602 출력하기
        System.out.println( memberList.get(1).getHakbun() );
        // 1번인덱스에 "이수진", "2501" 삽입하기
        memberList.add(1, new Member("이수진", "2501"));
        // 3번인덱스의 값을 "홍미동"이름을 "홍동미"로 수정하기
        memberList.set(3, new Member("홍동미", "2603") );

        memberList.remove("2602");

        System.out.println( memberList.size());
       Member m = null;
        for (int i=0; i<memberList.size(); i++) {
            if (memberList.get(i).getName().equals("이순신") ){
                m = memberList.get(i);
            }

        }
      System.out.println( memberList.contains(m) +"@@");






        List<Board> list2 = new ArrayList<Board>();

     list2.add( new Board("제목1","내용1","이순신"));
     list2.add( new Board("제목2","내용2","이순진"));
     list2.add( new Board("제목3","내용3","이순미"));
     list2.add( new Board("제목4","내용4","이순신"));
     list2.add( new Board("제목5","내용5","이순미"));


        System.out.println("=====================================");

        System.out.println(list2.get(0).equals( list2.get(3)));

      for (int i=0; i<list2.size(); i++){
          if (list2.get(0).equals(list2.get(i))){
              System.out.println( list2.get(i).getSubject() + "~~~~~");
          }
      }

        System.out.println(list2.get(0).equals( list2.get(3)));


        System.out.println( list2.get(0).getSubject());
        System.out.println( list2.get(2).getContent());

        Board b = null;
        for (int i=0; i<list2.size(); i++) {
            if (list2.get(i).getSubject().equals("제목5")) {
                b = list2.get(i);
                break;
            }
        }
        System.out.println( list2.contains(b));


        Board b1 = null;
        for (int i=0; i<list2.size(); i++) {
            if (list2.get(i).getWriter().equals("이순미")) {
                b1 = list2.get(i);
                break;
            }
        }
        System.out.println( list2.contains(b1));
        System.out.println("========================" );
      System.out.println(list2.get(0).getWriter().equals( list2.get(3).getWriter()));
    }
}
