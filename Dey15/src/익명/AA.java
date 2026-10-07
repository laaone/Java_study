package 익명;

public class AA extends A{

    @Override
   public void pam() {
        super.pam();

        System.out.println("이름있는 자식클래스");
    }

    @Override
    void spam() {
        super.spam();
    }
}
