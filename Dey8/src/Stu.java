public class Stu {

    private  String name;
    private int age;
    public Stu(String name) {
        System.out.println(name);
    }

     public Stu(int age) {
            System.out.println(age );
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Stu(String name , int age ) {
        this.name = name;
       this.age = age;
            System.out.println("홍길동" + age);
        }
         public Stu( int age, String name ) {
        this.age = age;
        this.name = name;
            System.out.println( age + "홍길동");
        }

    public Stu(  ) {
        System.out.println( );
    }




    }

