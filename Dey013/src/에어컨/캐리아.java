package 에어컨;

public class 캐리아 implements 에어컨인터페이스 {
    @Override
    public void namePrint() {
        System.out.println("캐리아에어컨");
    }

    @Override
    public void pricePrint() {
        System.out.println( "40만원");
    }
    private int volume;

    public 캐리아() {
    }

    public 캐리아(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
