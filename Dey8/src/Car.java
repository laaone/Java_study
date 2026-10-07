import java.security.PublicKey;

public class Car {

    String kind = "그랜져";
    int price = 7000;
    String colou = "검정";

    public String printAll() {
        return colou;
    }


    public Car() {
        System.out.println("기본 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임");
    }

    public Car(String kind) {
        System.out.println("명시적 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임");
    }
    public Car(int kind) {
        System.out.println("명시적 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임"+ kind);
    }
    public Car(String kind , int price)  {
        System.out.println("명시적 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임"+ kind + price);
    }
    public Car(String kind , int price,String color)  {
        System.out.println("명시적 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임"+ kind + price + color);
    }
    public Car(String kind , String color, int price)  {
        System.out.println("명시적 생성자 용도: new할때 자동실행되고 필드 초기화로 쓰임"+ kind + color + price);
    }

}
