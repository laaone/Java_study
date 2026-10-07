package 이중클래스;

public class A {

    int oa = 10;
    static  int soa = 20;
    void am() {

        oa = 20;
        soa = 30;
        sm();
    }
    static  void  sm() {
        soa = 30;


    }
    void cm(){
            int cmm = 20;

            class D{
                int dd = 20;
                static int sdd = 30;
                void dm(){
                    dd = 30;
                  //  cmm = 20;
                    oa=20;
                    soa=30;
                    am();
                    sm();

                }
                static void sdm(){
                //    cmm = 30;

                   // dd=30;
                   // cmm=20;
                    soa=30;
                    sm();
                  //  am();
                }


                }
                D d =new D();
                d.dm();
                D.sdm();
            }




        class B{

            int ib = 20;
            static int sib = 30;
            void ibm() {
                //A
        //        oa = 30;
        //        soa = 40;
        //        am();
        //        sm();
                //B
                ib=30;
                sib=40;
                sibm();

            }
            static void sibm(){
           // ib=
            soa=40;
            sm();
            sib = 40;
            sibm();

            }
        }
//정적 내부클래스
    static class C{
        int ic =10;
        static int sic =20;
        void icm(){
            ic = 20;
            sic = 30;
            soa = 30;
         //   am();
            sm();
            sicm();
        }
         static void sicm(){

        // ic = 20;
         sic = 30;
      //   oa = 20;
            soa = 30;
            sm();
            sicm();


        }

   }

}

