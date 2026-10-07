import java.util.Objects;

public class Member {

    String name;

    public Member() {
    }

    String tel;

    public Member(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Member member)) return false;
        return Objects.equals(name, member.name) && Objects.equals(tel, member.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tel);
    }
}
