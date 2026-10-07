package 에어컨;

public class 매니저 {
    public void play(에어컨인터페이스 p ){
        p.namePrint();
        p.pricePrint();
      if ((p instanceof 삼성)){
          삼성 s = (삼성) p;
         System.out.println("할인률" + s.getVolume() + "%");

      }else if ((p instanceof 엘지)){
            엘지 sa = (엘지) p;
            System.out.println("할인률" + sa.getVolume() + "%");

        }else if ((p instanceof 캐리아)){
          캐리아 saa = (캐리아) p;
          System.out.println("할인률" + saa.getVolume() + "%");

      }


    }

}
