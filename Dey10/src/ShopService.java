public class ShopService {

private static ShopService shopService = new  ShopService();

private  ShopService(){

}
    public static ShopService getInstance() {
        return shopService;

    }
     void m(int c){
        int r = c * 100000;
        System.out.println("메소드"+r);
    }



}


