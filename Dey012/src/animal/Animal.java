package animal;

public class Animal {

    private String kind="간식";

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Animal() {
    }

    void sound(){
        System.out.println("동물");
    }

    protected void eat(){
        System.out.println( kind + "먹습니다.");
    }
}//animal

