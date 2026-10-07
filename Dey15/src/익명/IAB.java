package 익명;//익명자식클래스

public class IAB {

    I i = new I() {//부모뒤에 숨은자식
        @Override
        public void im() {
          System.out.println("익명 구현객체");
        }

        @Override
        public void imm() {

        }
    };
    public void m(){
        i.im();
    }

}
