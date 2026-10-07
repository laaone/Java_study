package member;

public class 부모 {

 protected String 자동차 ="테슬라";
 protected String 냉장고 = "삼성";
 protected String 에어컨 = "삼성";
 protected  int 재산 = 10;


    public String get자동차() {
        return 자동차;
    }

    public void set자동차(String 자동차) {
        this.자동차 = 자동차;
    }

    public String get냉장고() {
        return 냉장고;
    }

    public void set냉장고(String 냉장고) {
        this.냉장고 = 냉장고;
    }

    public String get에어컨() {
        return 에어컨;
    }

    public void set에어컨(String 에어컨) {
        this.에어컨 = 에어컨;
    }

    public int get재산() {
        return 재산;
    }

    public void set재산(int 재산) {
        this.재산 = 재산;
    }

    public 부모() {
        this("소나타","삼성냉장고","삼성에어컨",20);

       System.out.println("부모클래스 기본생성자");

    }

    public 부모(String 자동차, String 냉장고, String 에어컨, int 재산) {
        this.자동차 = 자동차;
        this.냉장고 = 냉장고;
        this.에어컨 = 에어컨;
        this.재산 = 재산;
    }
}
