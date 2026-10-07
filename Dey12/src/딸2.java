import member.부모2;

public class 딸2 extends 부모2 {

  private String 옷 = "원피스";

    public 딸2(String 옷) {
        super("아파트",100);
        this.옷 = 옷;


    }

    protected String get옷() {
        return 옷;
    }

    protected void set옷(String 옷) {
        this.옷 = 옷;
    }

    public 딸2() {


        super();
    }
}
