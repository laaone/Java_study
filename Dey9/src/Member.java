import java.util.Scanner;

public class Member {

    private String name;
    private String id;
    private String password;
    private int age;


    public void printTitle() {
        System.out.printf(" %s    %s    %s    %s \n ", "이름", "아이디", "패스워드", "나이");

        System.out.println("-------------------------------------------------------");
    }

    public void printAll() {
        System.out.printf(" %s   %s   %s    %d \n ", name, id, password, age);
    }
    public String nameInput(){
        Scanner scanner = new Scanner(System.in); // 2. Scanner 객체 생성

        System.out.print("이름을 입력하세요: ");
        String inputStr = scanner.nextLine(); // 3. 문자열 입력받기

        return inputStr;

    }
    public Member n(Member[] ma, String nameInput){
        Member okna=null;
        for (int i=0;i< ma.length;i++){
            if (ma[i].name.equals(nameInput)){
                okna=ma[i];
                break;
            }
        }return  okna;
    }

    //아이디 키보드로 입력 받는 메소드작성하기
    public String idInput() {
        Scanner scanner = new Scanner(System.in); // 2. Scanner 객체 생성

        System.out.print("아이디를 입력하세요: ");
        String inputStr = scanner.nextLine(); // 3. 문자열 입력받기

        return inputStr;

    }
    //비
    public String passwordInput(String t) {
        Scanner scanner = new Scanner(System.in); // 2. Scanner 객체 생성

        System.out.print(t);
        String inputStr = scanner.nextLine(); // 3. 문자열 입력받기

        return inputStr;

    }


    public Member idSearch(Member[] ma, String idFind) {
        Member okMa = null;
        for (int i = 0; i < ma.length; i++) {
            if (ma[i].id.equals(idFind)) {
                okMa = ma[i];
                break;
            }
        }
          return okMa;
    }


//아이디 검객하는 메소드 작성

    //이름출력 get
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

    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    public Member() {
    }
}

