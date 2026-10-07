import member.부모2;

public class 아들2 extends 부모2 {


    protected void printAll(){

    }
    int cal(){
        return 0;}
    public String ss(){
        return null;
    }

    private static double se(){
          return 0.0;
        }


    public 아들2() {
        this(  "삼성폰");

    }

    protected String get핸드폰() {
        return 핸드폰;
    }

    protected void set핸드폰(String 핸드폰) {
        this.핸드폰 = 핸드폰;
    }

    public 아들2(String 핸드폰) {
        this.핸드폰 = 핸드폰;
    }

    private String  핸드폰 = "아이폰";

    @Override

    public void 계산( ){
        int 재산 = get주식() * 50000;
        System.out.println(재산);
    }
 @Override
    public void 출력(){
        System.out.println(get집() + " " + get주식()+" "+ get핸드폰());
 }
 @Override
 public void 세금() {
     System.out.println(get주식() * 50000 * 1.5);
 }


}
