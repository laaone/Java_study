import java.util.concurrent.Callable;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Car.class;
        Class c1 = Class.forName("Car");
        Car c2 = new Car();
        Class c3 = c2.getClass();
        System.out.println(c3);



        Class clazz = Car.class;
        String dogPath = clazz.getResource("dog.jpg").getPath();
        String catPath = clazz.getResource("cat.jpg").getPath();
        System.out.println(dogPath);




//        System.out.println();
//
//        new Callable<Object>() {
//            public Object call() throws Exception {


            }
        }
//        System.out.println();



//        long time1 = System.nanoTime();
//        int sum = 0;
//
//        for (int i=1; i<1000000; i++){
//            sum += i;
//
//        }
//        long time2 = System.nanoTime();
//
//        System.out.println(" 햡계 : " + sum);
//        System.out.println(" 걸린 시간 " + (time2-time1)/100000000. + "초");
////            if (i== 5){
//
////                System.exit(0);//종료버튼 개념
////            }
////        }
////      System.out.println("마무리 코드");

