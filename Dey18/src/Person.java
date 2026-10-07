import java.util.Objects;

public class Person {

    String neme;
    int age;

    public  Person(){

    }

    public Person(String neme, int age) {
        this.neme = neme;
        this.age = age;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(neme, person.neme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neme, age);
    }
}
