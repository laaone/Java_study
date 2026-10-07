package 에어컨;

public class 삼성 implements 에어컨인터페이스{

    @Override
    public void namePrint() {
       System.out.println("삼성에어컨");
    }

    @Override
    public void pricePrint() {
      System.out.println( "100만원");
    }
    private int volume;

    public 삼성() {
    }

    public 삼성(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }






}
