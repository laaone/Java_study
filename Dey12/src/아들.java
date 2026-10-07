import member.부모;

public class 아들  extends 부모 {

    private String 취미 = "자전거";

    public void  부모필드사용 (){
        super.자동차 = "벤츠";
        super.냉장고 = "LG";
        super.에어컨 = "인공지능";
        System.out.println( super.get자동차());
        System.out.println(super.get냉장고());
        System.out.println(super.get에어컨());
        System.out.println(super.get재산());
        System.out.println(this.get취미());




    }




    public 아들() {
        super("소나타","삼성냉장고","삼성에어컨",20);
        System.out.println("아들클래스 기본생성자");
    }

    public 아들(String 취미) {
        this.취미 = 취미;
    }

    public String get취미() {
        return 취미;
    }

    public void set취미(String 취미) {
        this.취미 = 취미;
    }










}//extends
