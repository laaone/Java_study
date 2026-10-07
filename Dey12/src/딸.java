import member.부모;

public class 딸 extends 부모 {
     private String 가방 = "샤넬";

    public void 딸이사용할수있는것(){
        System.out.println(get가방());
        System.out.println(get자동차());
        System.out.println(get냉장고());
        System.out.println(get에어컨());
        System.out.println(get재산());

        System.out.println("딸클래스 기본생성자");
    }

    public 딸() {
    }

    public 딸(String 가방) {
        this.가방 = 가방;
    }

    public String get가방() {
        return 가방;
    }

    public void set가방(String 가방) {
        this.가방 = 가방;
    }
}
