package Member;

public class Member {

 private String name;
 private String tel;

    public Member() {
    }

    public Member(String name, String tel, int monyh) {
        this.name = name;
        this.tel = tel;
        this.monyh = monyh;
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

    public int getMonyh() {
        return monyh;
    }

    public void setMonyh(int monyh) {
        this.monyh = monyh;
    }

    private int monyh;

 public static final String 학원명 = "패스트캠";






}//Member
