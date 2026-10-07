import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(3, 8, 1, 6, 3, 10, 5, 8, 2, 7);

        List<Employee> employees = List.of(
                new Employee("김민수", "개발",   5200, 31),
                new Employee("이서연", "개발",   6100, 35),
                new Employee("박지훈", "디자인", 4300, 28),
                new Employee("최유진", "디자인", 4800, 33),
                new Employee("정하늘", "마케팅", 4100, 26),
                new Employee("한도윤", "마케팅", 4600, 30),
                new Employee("오지아", "개발",   7000, 41)
        );

        //개발자가 몇명?
       long 개발인원수 = employees.stream().filter(e->e.dept().equals("개발")).count();
       System.out.println( 개발인원수);
       //디자인 몇명?
       long 디자인인원수 = employees.stream().filter(e->e.dept().equals("디자인")).count();
       System.out.println(디자인인원수);

     double 개발급여평균 = employees.stream().filter(m->m.dept().equals("개발")).map(m->m.salary())
             .mapToInt(m->m).average().getAsDouble();
     System.out.println(개발급여평균);

     double 나이평균 = employees.stream().filter(m->m.dept().equals("개발")).map(m->m.age())
                     .mapToInt(m->m).average().getAsDouble();
     System.out.println("------------");
     System.out.println(나이평균);

     Employee 마케팅최대급여자 =
     employees.stream().filter(m->m.dept().equals("마케팅"))
                     .max( Comparator.comparingInt(e->e.salary()))
                             .orElse(null);
     System.out.println(마케팅최대급여자.name() + " " + 마케팅최대급여자.dept() + " " + 마케팅최대급여자.salary());


System.out.println( nums.stream().filter(n->n%2==0).toList());
//System.out.println(employees.stream()
////나이가 짝수인 사람의 나이만 출력
//   .filter(n->n.age()% 2 ==0)
//        .map(n->n.age())
//                .toList());
//
        long count = nums.stream()          // 1) 생성
                .filter(n -> n > 5)             // 2) 중간 연산
                .map(n -> n * 2)                // 2) 중간 연산
                .count();                       // 3) 최종 연산
        // 결과: 5
   System.out.println("갯수" + count );
        int sum = nums.stream()          // 1) 생성
                .filter(n -> n > 5)             // 2) 중간 연산
                .map(n -> n * 2)                // 2) 중간 연산
                .mapToInt(n->n)
                .sum();
        System.out.println("합계:"+ sum);

       Stream<String> s1 = List.of("a","b","c").stream();
       String[] arr = {"a","b","c"};//배열
       Stream<String> s2 = Arrays.stream(arr);


           double[] darr=  {1.1,2.2};
           //이배열을 stream 으로 만들기
           DoubleStream ss2 = Arrays.stream(darr);

          Stream<String> s3 = Stream.of("a","b","c");

        // 숫자 범위 (기본형 스트림)
        IntStream s4 = IntStream.range(0, 5);        // 0, 1, 2, 3, 4
        IntStream s5 = IntStream.rangeClosed(1, 5);  // 1, 2, 3, 4, 5
       // 문자열의 문자
        IntStream s6 = "hello".chars();

        // 파일의 모든 줄 읽기
        // Stream은 사용 후 자동으로 닫아야 하므로 try-with-resources 사용
        try (Stream<String> lines = Files.lines(Path.of("data.txt"))) {

            lines.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
            e.printStackTrace();
        }
System.out.println(
        Stream.iterate(1, n -> n +1).limit(10).toList());     // 결과: [1, 2, 4, 8, 16]
        Stream.generate(() -> "hi").limit(3).toList();       // 결과: [hi, hi, hi]


        List<List<String>> teams = List.of(
                List.of("김민수","이서연"),
                List.of("박지훈"),
                List.of("정하늘","한도윤"));

        System.out.println(teams.stream().flatMap(List::stream).toList());


        System.out.println( Stream.of("hello world","java stream")
                .flatMap(s-> Arrays.stream(s.split("  ")))
                .toList());




    }
}//