package member;

public  class 부모2 {
    private String 집="아파트";
    private  int 주식=100;
   public void 계산( ){
       int 재산 = 주식 * 30000;
     System.out.println(재산);
   }
public void 출력(){
       System.out.println(집+ " " + 주식 );
}
public  void 세금(){
       System.out.println( 주식 * 30000 * 0.33);
}
    public 부모2() {
    }

    public String get집() {
        return 집;
    }

    public void set집(String 집) {
        this.집 = 집;
    }

    public int get주식() {
        return 주식;
    }

    protected void set주식(int 주식) {
        this.주식 = 주식;
    }

    protected 부모2(String 집, int 주식) {
        this.집 = 집;
        this.주식 = 주식;
    }
}
