package member;

public interface RemoteControl {
    //상수
    public static final int MAX = 10;
    public  int MIN = 0;

    public abstract void turmOn();
    public abstract void turmOff();
    public abstract void setVolume( int volume);

    public void som();




}
