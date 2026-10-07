import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Member> memberSet = new HashSet<Member>();



        Member m1 = new Member("김명수", "123");
        Member m2 = new Member("김명식", "124");
        Member m3 = new Member("김명동", "125");
        Member m4 = new Member("김명수", "123");
        Member m5 = new Member("김명수", "123");
        memberSet.add( m1);
        memberSet.add(m2);
        memberSet.add(m3);
        memberSet.add(m4);
        memberSet.add(m5);

        System.out.println( memberSet.size());
    //모든 자료 출력하기
       Iterator<Member> it =memberSet.iterator();
       while (it.hasNext()) {
       Member m = it.next();
       System.out.println( m.getName()+ ""+m.getTel());
       }
    memberSet.remove(m1);
       it = memberSet.iterator();
        while (it.hasNext()) {
            Member m = it.next();
            System.out.println( m.getName()+ ""+m.getTel());
        }
        //김명식이 있나요?
        memberSet.remove(m1);
        it = memberSet.iterator();
        while (it.hasNext()) {
            Member m = it.next();
           System.out.println( m.getName().equals("김명식"));

            }

     //
        it = memberSet.iterator();
        Member sm = null;
        while (it.hasNext()) {
            Member m = it.next();
            if ( m.getName().equals("김명식") ){ sm =m;}
        }
       System.out.println( memberSet.contains(sm)+ "%%%%");


        memberSet.clear();
        it = memberSet.iterator();
        while (it.hasNext()) {
            Member m = it.next();
            System.out.println( m.getName()+ ""+m.getTel()+"$$$");
        }


        }

    }


}