import java.util.*;

public class Main {
    public static void main(String[] args) {


        new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);//입력
        set1.add(20);
        set1.add(5);
        set1.add(10);
        //출력
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            Integer a = it.next();
            System.out.println(a);
        }

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("신용권", 85);
        map1.put("홍길동", 90);
        map1.put("동장군", 80);
        map1.put("홍길동", 95);

        System.out.println(map1.size());
        //출력방법 get()
        System.out.println(map1.get("신용권"));
        System.out.println(map1.get("홍길동"));
// 1 80, 2 100 3 85

        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        map2.put(1, 80);
        map2.put(2, 100);
        map2.put(3, 85);

        System.out.println(map2.get(1));
        System.out.println(map2.get(2));
        System.out.println(map2.get(3));

        Set<String> keys = map1.keySet();
        Iterator<String> it1 = keys.iterator();
        while (it1.hasNext()) {
            String name = it1.next();
            System.out.println(name + "  " + map1.get(name));
        }


        Set<Integer> keys1 = map2.keySet();
        Iterator<Integer> it2 = keys1.iterator();
        while (it2.hasNext()) {
            Integer name2 = it2.next();
            System.out.println(name2 + "  " + map2.get(name2));
        }
        Map<Integer,Member> memberMap = new HashMap<Integer,Member>();
       memberMap.put(1,new Member("홍길동",20));
       memberMap.put(2,new Member("이순신",25));
       memberMap.put(3,new Member("장미연",23));

       Set<Integer> keys3 = memberMap.keySet();
       Iterator<Integer> it3 = keys3.iterator();
       while (it3.hasNext()){
           Integer me = it3.next();
           System.out.println( me + "  " + memberMap.get(me).getName()+"  "+memberMap.get(me).getAge());
       }

    Map<Member,Integer> memberMap2 = new HashMap<Member, Integer>();

       Member m1 = new Member("홍길동",20);
       Member m2 = new Member("이순신",25);
       Member m3 = new Member("장미연",23);

      memberMap2.put(m1,100);
      memberMap2.put(m2,85);
      memberMap2.put(m3,97);
      memberMap2.put(m1,90);
      memberMap2.put(m1,85);

      Set<Member> ks = memberMap2.keySet();
      Iterator<Member> it4 = ks.iterator();
      while (it4.hasNext()){
      Member me1 = it4.next();
      System.out.println(me1.getName() + " " + me1.getAge() + " " +memberMap2.get(me1));

      }
    Map<String,Boolean> map10 = new Hashtable<String, Boolean>();
      map10.put("ab", true);
        map10.put("abc", false);
        map10.put("abd", false);
        map10.put("abe", true);



    }
}