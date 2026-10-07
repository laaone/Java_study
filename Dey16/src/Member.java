public class Member {
    public String id;

    public int age;
    public Member(String id){
        this.id =id;
    }
    public Member(int age){
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member ){
            Member member = (Member) obj;
            if (id.equals(member.id)  ){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode();

}

    @Override
    public String toString() {
        return "Member클래스입니다.";
    }
}