package member;

public class Audio implements RemoteControl{


    private int volume;

    public Audio() {
    }

    public Audio(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void turmOn() {
        System.out.println("오디오 켭니다.");
    }

    @Override
    public void turmOff() {
        System.out.println("오디오 끕니다.");
    }



    @Override
    public void setVolume(int volume) {

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
}
