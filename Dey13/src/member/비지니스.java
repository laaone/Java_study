package member;

public class 비지니스 {
    //다형성
    RemoteControl tv = new Television();

    Audio audio = new Audio();
    public void run(RemoteControl r){
        r.turmOn();
        r.turmOff();

        if (r instanceof Television){
         Television tr = (Television) r;
         r.setVolume( tr.getVolume());
        }else if (r instanceof Audio){
          Audio ar = (Audio) r;
          r.setVolume(ar.getVolume());

        }else if (r instanceof 에어컨){
            에어컨 aar = (에어컨) r;
            r.setVolume(aar.getVolume());
        }
      }
}
