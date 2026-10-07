import 에어컨.매니저;
import 에어컨.삼성;
import 에어컨.엘지;
import 에어컨.캐리아;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    Main main = new Main();
    main.title();
    main.menu();

    }
    public void title(){
        System.out.println("  에어컨 카달로그  ");
        System.out.println();
        System.out.println("1. 삼성 |2. 엘지 |3.캐리아 |4. 종료");
    }
  public void menu(){
      Scanner s = new Scanner(System.in);
      boolean run = true;
      매니저 man = new 매니저();

      while( run ){
          int m = s.nextInt();
          switch (m){
              case 1: man.play( new 삼성(10)); break;
              case 2: man.play( new 엘지(15)); break;
              case 3: man.play( new 캐리아(25)); break;
              case 4: run=false; break;
          }



      }



  }

}