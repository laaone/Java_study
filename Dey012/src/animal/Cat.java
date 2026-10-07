package animal;

public class Cat extends Animal {

    private String color= "노랑";

    public Cat(String kind) {
        super(kind);
    }

    public Cat(String kind, String color) {
        super(kind);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Cat() {
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    protected void sound(){
        System.out.println("야옹");
    }
    @Override
    protected void eat(){
        setKind("고먕이");
        setKind("검정");
        System.out.println( getColor()+ getKind()+ "이가 츄르를 먹습니다.");
    }




}//C
