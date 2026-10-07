package 예외;

public class A {
    void a1()throws NullPointerException,NumberFormatException{
       a2();
    }
    void a2()throws NullPointerException,NumberFormatException{
        a3();
        String data1 = "100";
        String data2 = "a100";
        int v1 = Integer.parseInt(data1);
        int v2 = Integer.parseInt(data2);
    }
    void a3()throws NullPointerException{
       String data = "null";
       System.out.println(data.toString());
    }
}
