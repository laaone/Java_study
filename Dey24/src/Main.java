import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {

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
                List<Integer> ns = nums.stream().distinct().toList();
                System.out.println(ns);

//"I","She","He","is","am" 컬렉션 넣고
                //스트림 만들고 출력

                List<String> strs = List.of("I","She","He","is","am");
                strs.stream().forEach( n->System.out.println(n) );
                strs.stream().forEach( System.out::print );

                //"She"만 필터링
                System.out.println();
                strs.stream().filter(n->n.equals("She")).forEach(System.out::println);
//Employee에서 나이가 30살이 이상인 사람의 이름과 나이출력
                employees.stream()
                        .filter(n->n.age()>=30)
                        .forEach(n-> System.out.println(n.name() + n.age()));

                //map 1:1 vs flatMap 1:n
                List<String> nameList = Arrays.asList("TanaKa","Suzuki"," Takashi");

                nameList.stream().map(m->m.length()).forEach(System.out::println);

                nameList.stream().flatMap(f-> Stream.of(f,f.length())).forEach(System.out::println);

                employees.stream()
                        .filter(n->n.age()>=30)
                        .flatMap(e-> Stream.of(e.name(),e.age()))
                        .forEach(System.out::println);
                System.out.println(employees.stream().map(e->e.name()).toList());
                employees.stream().map(Employee::name).forEach(System.out::println);

                nums.stream().map(n-> "No." + n ).forEach(System.out::println);

                List<List<String>> teams = List.of(
                        List.of("김민수","이서연"),
                        List.of("박지훈"),
                        List.of("정하늘","한도윤"));

                teams.stream().forEach(System.out::println);
                teams.stream().flatMap(List::stream)
                        .forEach(System.out::println);

                Stream.of("hello,world","java,stream")
                        .flatMap(s -> Arrays.stream(s.split(",")))
                        .forEach(System.out::println);

                nums = List.of(3, 8, 1, 6, 3, 10, 5, 8, 2, 7);
                nameList = Arrays.asList("TanaKa","Suzuki","Takashi");
                employees = List.of(
                        new Employee("김민수", "개발",   5200, 31),
                        new Employee("이서연", "개발",   6100, 35),
                        new Employee("박지훈", "디자인", 4300, 28),
                        new Employee("최유진", "디자인", 4800, 33),
                        new Employee("정하늘", "마케팅", 4100, 26),
                        new Employee("한도윤", "마케팅", 4600, 30),
                        new Employee("오지아", "개발",   7000, 41)
                );
                //오름차순 정렬
                nums.stream().sorted().forEach(System.out::println);
                nameList.stream().sorted().forEach(System.out::println);
                //내림차순 정렬
                nameList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

                employees.stream().sorted(Comparator.comparing(Employee::name)).forEach(System.out::println);
                employees.stream().sorted(Comparator.comparing(Employee::name).reversed()).forEach(System.out::println);
                System.out.println("-------------------------------");
                employees.stream().sorted(Comparator.comparing(Employee::dept)).forEach(System.out::println);
                employees.stream().sorted(Comparator.comparing(Employee::dept).reversed()).forEach(System.out::println);
                System.out.println("-------------------------------");
                //부서명 정렬하고 만약 부서가 동일하면 급여가 많은사람순으로
                employees.stream()
                        .sorted(Comparator.comparing(Employee::dept).reversed()
                                .thenComparingInt(Employee::salary).reversed() )
                        .forEach(System.out::println);
//부서순, 이름순 나이순 오름차순으로 정렬
                System.out.println("-------------------------------");
                employees.stream()
                        .sorted(Comparator.comparing(Employee::dept)
                                .thenComparing(Employee::name)
                                .thenComparingInt(Employee::age))
                        .forEach(System.out::println);
                System.out.println("-------------------------------");
                nums = List.of(3, 8, 1, 6, 3, 10, 5, 8, 2, 7);
                //anyMatch() 1개라도 true이면 true, allMatch()모두 참이면, noneMatch 모두 거짓이면 참
                boolean result = nums.stream().anyMatch(n-> n >= 15);
                System.out.println(result);

                Optional<Integer> oo = nums.parallelStream().findAny();
                System.out.println(oo);
                Optional<String> ff = nameList.parallelStream().filter(n->n.length() > 5 ).findFirst();
                System.out.println(ff);
                Optional<String> ff1 = nameList.parallelStream().filter(n->n.length() > 8 ).findAny();
                System.out.println(ff1+"~~~~");

                String ff2 = nameList.parallelStream().filter(n->n.length() > 8 ).findAny().orElse("없음");
                System.out.println(ff2+"@@@");

                Optional<Employee> top = employees.stream()
                        .max(Comparator.comparingInt(Employee::salary));
                System.out.println(top);
                String name = top.map(Employee::name).orElse("없음");
                System.out.println(name);
                System.out.println("-------------------------------");
                employees.stream().filter(n->n.salary() >= 8000 )
                        .max( Comparator.comparing( Employee::salary))
                        .ifPresent( System.out::println);


                Optional<Employee> none = employees.stream()
                        .filter(e -> e.salary() > 10000)
                        .findFirst();

                none.isPresent();           // 결과: false
                none.orElse(null);          // 결과: null
//       none.get();                 // NoSuchElementException

                System.out.println( nums.stream().mapToInt(n->n).sum());
                System.out.println( nums.stream().mapToInt(n-> n+10).summaryStatistics());
//스트림  컬렉션(리스트)
                List<String> 게시글번호 = IntStream.range(1,101).mapToObj(n-> "게시글" + n ).toList();
                System.out.println( 게시글번호);
                List<Long> 박싱 = LongStream.range(1,11).boxed().toList();
                System.out.println(박싱);
// 스트림  컬렉션set
                LongStream.range(1,11).boxed().collect(Collectors.toSet());
//리스트----스트림----Set
                nums = List.of(3, 8, 1, 6, 3, 10, 5, 8, 2, 7);
                Set<Integer> listToSet = nums.stream().collect(Collectors.toSet());
                Iterator<Integer> it = listToSet.iterator();
                while (it.hasNext()){
                    int n = it.next();
                    System.out.print(n+ "  ");
                }
                //스트림
                HashMap<Integer,String> map1 = new HashMap<>();
                map1.put(1,"홍길동");
                System.out.println( map1.get(1));

                Map map2= employees.stream().collect(
                        Collectors.toMap(Employee::name,Employee::salary));
                System.out.println(map2);
                System.out.println(map2.get("최유진"));



            }
        }
        List<Integer> nums = List.of(3, 8, 1, 6, 3, 10, 5, 8, 2, 7);

        List<Employee> employees = List.of(
                new Employee("김민수", "개발",   5200, 31),
                new Employee("이서연", "개발",   6100, 35),
                new Employee("박지훈", "디자인", 4300, 28),
                new Employee("최유진", "디자인", 4800, 33),
                new Employee("정하늘", "마케팅", 4100, 26),
                new Employee("한도윤", "마케팅", 4600, 30),
                new Employee("오지아", "개발",   7000, 41)
//                new Employee("김민수", "개발",   5200, 31),
//                new Employee("이서연", "개발",   6100, 35),
//                new Employee("박지훈", "디자인", 4300, 28),
//                new Employee("최유진", "디자인", 4800, 33),
//                new Employee("정하늘", "총무", 4100, 26),
//                new Employee("한도윤", "영업", 4600, 30),
//                new Employee("오지아", "인공지능",   7000, 41)

        );
        List<String> nameList = Arrays.asList("TanaKa", "Suzuki", "Takashi");

//        nums.stream().limit(5).forEach( System.out::println );
//        nums.stream().skip(2).limit(5).forEach(System.out::println);

//                nums.stream()
//                .filter(n -> n > 5)
//                .peek(n -> System.out.println("통과: " + n))
//                .toList();
   System.out.println(
        nums.stream().peek(n -> System.out.println("통과2: " + n))
                     .reduce(100, (a, b) -> a - b));//100-배열합
System.out.println(
   IntStream.rangeClosed(1,100).reduce(5000,(a,b)->a-b));
String join =
    employees.stream().map(n->n.name())
            .peek(n->System.out.println("통과" + n))
            .collect(Collectors.joining("-" , "<" ,">" ));
System.out.println(join);
//{35세 31세}
        String join1 =
               employees.stream().mapToInt(n->n.age())
                        .mapToObj(n->String.valueOf(n))
                        .collect(Collectors.joining("세 " , "[" , "세]"));
        System.out.println(join1);
        //부서명알기 중복 데이터는 하나만 출력 Set

        Set<String> deptSet =
        employees.stream()
                .map(n->n.dept())
                .collect(Collectors.toSet());
        System.out.println( deptSet);
        System.out.println( deptSet.stream().sorted().toList());

//Map json
Map<String, String> map3 =
employees.stream()
        .collect(Collectors.toMap(n->n.name(),n->n.dept()));
System.out.println(map3.get("김민수"));
        System.out.println(map3);

        Map<String, Integer> map4 =
                employees.stream()
                        .collect(Collectors.toMap(n->n.name(),n->n.age()));
        System.out.println(map4.get("김민수"));
        System.out.println(map4);

        Map<Integer, String> map5 =
                employees.stream()
                         .collect(Collectors.toMap(n->n.age(),n->n.name()));
        System.out.println(map5.get(31));
        System.out.println(map5);

     Map<String,List<Employee>> 부서별 =
     employees.stream().collect(Collectors.groupingBy(n->n.dept()) );

        System.out.println(부서별.get("디자인").get(1).name() + " " + 부서별.get("디자인").get(1).age());
        System.out.println("----------");
        System.out.println(부서별.get("마케팅").get(0).name() + " " + 부서별.get("마케팅").get(1).name());
        System.out.println(부서별.get("개발"));

        Map<String, Long> 부서별인원수 =
    employees.stream().collect(Collectors.groupingBy(Employee::dept,Collectors.counting()));
    System.out.println(부서별인원수.get("디자인"));

    Map<String,Integer> 부서별연봉합 =
    employees.stream()
            .collect(Collectors.groupingBy(n->n.dept(),Collectors.summingInt(Employee::salary) ));
    System.out.println( 부서별연봉합.get("마케팅"));

        Map<String,Double> 부서별연봉평균 =
                employees.stream()
                        .collect(Collectors.groupingBy(n->n.dept(),Collectors.averagingInt(Employee::salary) ));
        System.out.println( 부서별연봉평균.get("마케팅"));

        Map<String,Optional<Integer>> 부서별연봉최고금액 =
                employees.stream()
                        .collect(Collectors.groupingBy(n->n.dept(),Collectors.mapping(Employee::salary,Collectors.maxBy(Integer::compare)) ));
        System.out.println( 부서별연봉최고금액);
        System.out.println( 부서별연봉최고금액.get("개발").orElse(0));
        System.out.println( 부서별연봉최고금액.get("디자인").orElse(0));

//        Collectors.mapping( 입혁자료,결과자료)
//        Collectors.mapping(Employee::salary,Collectors.maxBy(Integer::compare))
//                연봉임력해서 정수 (연봉 최대값으로 결과 나오게)

        Map<String,List<String>> 부서별명단 =
                employees.stream()
                        .collect(Collectors.groupingBy(n->n.dept(),
                                Collectors.mapping(Employee::name,Collectors.toList() ) ));


        System.out.println( 부서별명단);
        System.out.println( 부서별명단.get("개발"));
        System.out.println( 부서별명단.get("디자인"));

//  partitioningBy() 도
        Map<Boolean, List<String>> 연봉오천이상 =
        employees.stream().collect(Collectors.partitioningBy( e->e.salary() >5000,
                Collectors.mapping( Employee::name,Collectors.toList() )));
        System.out.println(연봉오천이상);
        System.out.println( 연봉오천이상.get(true ));
        System.out.println( 연봉오천이상.get(false ));

//        나이 35이상인 사람만 그룹핑, 아닌 사람끼리 그룹핑하기

        Map<Boolean,List<String>> 나이35이상 =
                employees.stream().collect(Collectors.partitioningBy( e->e.age() >=35,
                        Collectors.mapping( Employee::name,Collectors.toList() )));
        System.out.println(나이35이상);
        System.out.println( 나이35이상.get(true ));
        System.out.println( 나이35이상.get(false ));











    }
}