package 익명;

public class AB {

    A a = new A() {//자식클래스 설계
        int sm =20;
        void smm(){};

        // };

        @Override
        void pam() {
           System.out.println("익명 자식 클래스의 메소드"+ sm);
        }

        @Override
        void spam() {

        }
    };
    public void abm(){
        a.pam();
    }
}