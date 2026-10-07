public class Book {

 private String bookName ;
 private  String publisher;
 private int count;

//생성자 오버로딩: 매개변수가
    public Book(String bookName, String publisher, int count) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.count = count;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(String publisher, String bookName) {
        this.publisher = publisher;
        this.bookName = bookName;
    }

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
