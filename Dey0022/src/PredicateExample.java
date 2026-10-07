import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {


    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남자", 90),
            new Student("김순희", "여자", 90),
            new Student("감자바", "남자", 95),
            new Student("박한나", "여자", 92)
    );

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }

        }

        return (double) sum / count;


    }

    public static List<String> printName(Predicate<Student> predicate){
        List< String> s92 = new ArrayList<String>();
        for ( Student student : list){
            if ( predicate.test(student)){
                System.out.println( student.getScore() + student.getName() );
                s92.add( student.getName());


            }
        }
      return s92;
    };
}

