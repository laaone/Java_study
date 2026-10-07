//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
   Book book = new Book();
   Book book2 = new Book("자바","한빛미디어",10);
   Book book3 = new Book("리엑트");
   Book book4 = new Book("스프링","남가람");

  System.out.println(book2.getBookName());
  System.out.println(book2.getPublisher());
  System.out.println(book2.getCount());
  System.out.println(book3.getBookName());
  System.out.println(book4.getPublisher());
  book4.setPublisher("html");
  book4.setBookName("크라운");
  System.out.println(book4.getPublisher());
  System.out.println(book4.getBookName());
  book2.setCount(10);
  System.out.println(book2.getCount());







    }
}