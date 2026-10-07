public class Person {
    private String name = "홍길동";
    private int age = 20;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    void introduce(){
        System.out.println( name + "  " + age );
    }
    void  cn(){
    System.out.println( "Person클래스" );
    }

}
