package 익명;

public class 익명 {

    부모 PP = new 부모(){
        @Override
        void p() {
            System.out.println("익명자식");
        }
    };
 자식 ss = new 자식(){
     @Override
     void s() {
         super.s();
         System.out.println("익명자식 자식");
     }
     @Override
     void p() {
         super.p();
         System.out.println("익명자식 자식");

     }
 };
   부모인 ii = new 부모인(){
       @Override
       public void i() {

       }

       @Override
       public void j() {

       }
   };
   리모콘 r = new 리모콘(){
       

       @Override
       public void turnOn() {

       }

       @Override
       public void tutnOff() {

       }
   };

}
