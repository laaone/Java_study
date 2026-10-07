import java.util.Scanner;

public class Member {
    private String name;
    private String id;
    private String password;

    public Member() {
    }

    private int age;

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printTitle() {
       //전체화면 출력할때 제목부분

        System.out.printf(" %s    %s    %s    %s \n ", "이름", "아이디", "패스워드", "나이");

        System.out.println("-------------------------------------------------------");
    }

    public void printAll() {
        //전체화면 출력
        System.out.printf(" %s   %s   %s    %d \n ", name, id, password, age);
    }




    public String nameInput() {
        Scanner scanner = new Scanner(System.in); // 2. Scanner 객체 생성

        System.out.print("이름을 입력하세요: ");
        String inputStr = scanner.nextLine(); // 3. 문자열 입력받기

        return inputStr;

    }
} //end clss


