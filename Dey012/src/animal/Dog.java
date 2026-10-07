package animal;

public class Dog extends Animal {

   private String name = "강아지";

    public Dog(String kind) {
        super(kind);
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected void sound(){
      System.out.println("멍멍");
    }

    @Override
    protected void eat(){
        setKind("강아지");
        setName("로드");
        System.out.println( getName()+ getKind()+ "가 간식을 먹습니다.");
    }
}//D
