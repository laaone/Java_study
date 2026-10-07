package 에어컨;

public class 엘지 implements 에어컨인터페이스{
    @Override
    public void namePrint() {
        System.out.println("엘지에어컨");
    }

    @Override
    public void pricePrint() {
        System.out.println( "50만원");
    }
    private int volume;

    public 엘지() {
    }

    public 엘지(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
