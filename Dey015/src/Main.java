import 예외.매니저;

import java.util.Locale;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
     try{
        매니저 ma = new 매니저();
        ma.m();

      }catch(NullPointerException e){
        System.out.println("문자열 오류임");
       }
    }
}//
//        try {
//
//            매니저 ma = new 매니저();
//            ma.m();
//

//            String data = "null";
//
//            System.out.println(data.toString());
//            String[] a = new String[3];
//            a[0] = "b";
//            a[1] = "c";
//            a[2] = "d";
//            for (int i = 0; i < 3; i++) { //i=0 1 2
//                a[i] = "a" + i;
//            }
//            String data1 = "100";
//            String data2 = "100";
//            int value1 = Integer.parseInt(data1);
//            int value2 = Integer.parseInt(data2);
//
//            Dog dog = new Dog();
//            changeDog(dog);
//
//            Cat cat = new Cat();
//            changeDog(cat);
//
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage() + "이 부분은 문자열 오류");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage() + "이 부분은 배역의 인덱스 오류");
//        }catch (NumberFormatException e){
//        System.out.println(e.getMessage() + "이 부분은 숫자형식 오류");
//        }catch (ClassCastException e){
//            System.out.println(e.getMessage() + "이 부분은 클래스 자료형 오류");
//        }catch (Exception e){
//            System.out.println(e.getMessage() + "위에 예외가 아닌 예외오류");
//        }
//
//        finally {
//            System.out.println("이 부분은 정상이거나 예의상관없이 모두수행");
//        }
//
//
//    }
//    public static void changeDog(Animal animal){
//        Dog dog = (Dog)animal;
//    }
//}
//
//class Animal{ }
//class Dog extends Animal{}
//class Cat extends Animal{}