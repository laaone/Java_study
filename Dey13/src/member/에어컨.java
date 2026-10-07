package member;

public class 에어컨 implements RemoteControl{

    private int volume;

    public 에어컨() {
    }

    public 에어컨(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void turmOn() {
        System.out.println("에어컨 켭니다.");

    }

    @Override
    public void turmOff() {
     System.out.println("에어컨 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if( volume > 30 ) {
            this.volume = 30;
        }else if(volume < 10 ){
            this.volume = 10;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 온도는 " + this.volume);
    }


    @Override
    public void som() {
    }
  }

