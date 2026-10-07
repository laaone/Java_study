public class Member implements Comparable{

    String name;
    int number;

    public Member() {
    }

    public Member(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        Member m = (Member)o;
        return number - m.getNumber();//숫자인 경우
    }
//    //트리셋의 기준이 되는코드
//    @Override
//    public int compareTo(Object o) {
//        Member m = (Member) o;
//        return name.compareTo(m.getName());//문자인 경우 비교d
//    }
}
