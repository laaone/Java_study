public class ComPuter {

    int sum1( int[] values){
        int sum=0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum=0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int i1, int i2, int i3){
      //  System.out.println("메소드 오버로딩 매개변수");
        return i1 + i2 + i3;
    }
    int sum2(int i1, int i2, int i3, int i4,int i5){
        return i1 + i2 + i3+ i4 + i5;

    }
private String color;
private String name;
private  String tel;
void setColor(String color){ this.color = color;}

    void  m(){
        double a = Calculator.p1 * 10 * 10;
        Calculator.plus(10, 20);
        Calculator.minus(10, 20);
        color = "빨강";
        name = "홍길동";
        setColor("노랑");

    }
  static  void sm(){

  }





}
