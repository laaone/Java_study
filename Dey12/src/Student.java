public class Student extends Person {

    public String school = "한국대학교";
    public void study(){
        System.out.println( "학생이 공부합니다.");
    }
    @Override
    void  cn(){
        System.out.println( "Student클래스" );
    }
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }
}
