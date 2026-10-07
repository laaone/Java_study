import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("a", "2601");
        Student s2 = new Student("b", "2603");
        Student s3 = new Student("ab", "2601");
        Student s4 = new Student("c", "2601");

System.out.println(s1.toString()+"@@");

Member m1 = new Member("blue");
System.out.println( m1.toString() + "@@@");

        if (s1.equals(s2)) System.out.println("s1" + "s2");
            if (s1.equals(s3)) System.out.println("s1" + "s3");
            if (s2.equals(s4)) System.out.println("s1" + "s4");
            if (s2.equals(s3)) System.out.println("s2" + "s3");
            if (s3.equals(s4)) System.out.println("s2" + "s4");
            if (s1.equals(s4)) System.out.println("s3" + "s4");

     HashMap<Key,String> hashMap = new HashMap<>();
     System.out.println( hashMap + "~~~~");
      hashMap.put(new Key(1),"홍길동");
//
//       String value = hashMap.get(new Key(1));
//       System.out.println(value);
//
//
//       HashMap<Member,String> hashMap2 = new HashMap<>();
//       hashMap2.put( new Member("blue"),"파란색");
//       String value2 = hashMap2.get( new Member("blue"));
//       System.out.println(value2);
        }
    }

// if (obj4.equals(obj5)) {
//        System.out.println("obj4과 obj5는 동갑입니다.");
//        } else {
//                System.out.println("obj4과 obj5는 동갑이 아닙니다.");
//        }
//                if (obj4.equals(obj6)) {
//        System.out.println("obj4과 obj3는 동갑입니다.");
//        } else {
//                System.out.println("obj4과 obj6는 동갑이 아닙니다.");
//        }
//Member obj1 = new Member("blue");
//Member obj2 = new Member("blue");
//Member obj3 = new Member("red");
//
//Member obj4 = new Member(30);
//Member obj5 = new Member(20);
//Member obj6 = new Member(30);
//
//String n1 = new String("홍길동");
//String n2 = new String("홍길동");
