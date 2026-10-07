import animal.*;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Bussiness bussiness = new Bussiness();
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal animal2 = new Cat();//다형성
        Animal animal3 = new Dog();

//    Cat cat2 = (Cat) new Cat();


        Cat cat3 = (Cat) animal2;//부모 클래스:큰자료형

//        Scanner s = new Scanner(System.in);
//
//        boolean run = true;
//        while (run) {
//            System.out.println("1. 동물 | 2.고양이| 3. 강아지 |4. 종료 ");
//            int menu = s.nextInt();
//            switch (menu) {
//
//                case 1: bussiness.run(new Animal());break;
//                case 2: bussiness.run(new Cat());break;
//                case 3: bussiness.run(new Dog());break;
////
//                case 4: run = false;break;
//            }
        Scanner h = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("1. 동물 | 2.고양이| 3. 강아지 |4.다람쥐 |5.종료 ");
            int menu = h.nextInt();
            switch (menu) {

                case 1:
                    bussiness.run(new Animal());
                    break;
                case 2:
                    bussiness.run(new Cat());
                    break;
                case 3:
                    bussiness.run(new Dog());
                    break;
                case 4:
                    bussiness.run(new Squirrel());
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
//       bussiness .run( dog);
//


    }



} // Main