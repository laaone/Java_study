package Member;


public class Calculator {

    private static Calculator calculator = new Calculator();

    private Calculator(){

    }
    public static  Calculator getInstance(){
        return  calculator;

    }
   public int 수강료(int 개월) {
        return  개월 * 100000;
   }





}//Calculator
