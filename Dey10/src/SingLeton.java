import javax.swing.plaf.SliderUI;

public class SingLeton {
    private static SingLeton singLeton = new SingLeton();
    private  SingLeton(){}
    public  static SingLeton getInstance(){
        return singLeton;

    }


}
