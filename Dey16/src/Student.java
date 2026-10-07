import java.util.Objects;

public class Student {

String name;
String hakbun;
public  Student(String name,String hakbun){
    this.name = name;
    this.hakbun = hakbun;
}

    @Override
    public int hashCode() {
        return hakbun.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Student){
           Student student = (Student) obj;
           if (hakbun.equals(student.hakbun)){
               return true;
           }
       }
       return false;
    }

    @Override
    public String toString() {
        return name + "   " + hakbun;
    }
}
