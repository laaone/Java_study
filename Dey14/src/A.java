public class A {
   private int af =10;
   public static int  sf=20;
   public void am(){
       af = af + 20;
       sf = sf + 30;
       A.sm();

   }
   public static void sm(){
//      af = af + 20;
      sf = sf + 30;
//      am();


   }

  public   A(){
        System.out.println("A 객체가 생성됨");

    }
    class B {
        B() {   System.out.println("B 객체가 생성됨");}
        int b;
        void bm(){
            b = 10;
            af = 20;
            A.sf =30;
            am();
            A.sm();
        }
        static void sbm(){
//            b=10;
//             af =20;
            A.sf =30;
        //    am();
            A.sm();
        }
    }

    static class C{
     C() { System.out.println("C 객체가 생성됨");}
     int c;
     static int sc;
     void cm(){
         c = 10;
         C.sc =10;
         C.scm();
     }
     static void scm(){
      //   c = 10;
         C.sc =10;
         //C.scm();
     //    af = 10;
         A.sf =10;
      //   am();
         A.sm();

     }

    }
    void amd(){
       int i = 10;
//       static int si = 20;
        class D{
            D() { System.out.println( "D 객체가 생성됨");}
            int d =i;
            void dm(){}
        }
       D d1 = new D();
        d1.d = 50;
        d1.dm();
    }
}
