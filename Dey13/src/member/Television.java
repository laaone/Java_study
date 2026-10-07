package member;

public class Television implements RemoteControl {
    //구현클래스(자식클래스)

    private int volume;

    public Television() {
    }

    public Television(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void turmOn() {
        System.out.println("TV 켭니다.");


    }

    @Override
    public void turmOff() {
        System.out.println("TV 끕니다.");
    }

    @Override
    public void setVolume(int volume ) {
        if( volume > MAX ) {
            this.volume = RemoteControl.MAX;
        }else if(volume < MIN ){
            this.volume = RemoteControl.MIN;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 볼륨은 " + this.volume);
    }

    @Override
    public void som() {

    }
}//end



