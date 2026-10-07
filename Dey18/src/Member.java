public class Member {

    String name;
    String hakbun;

    public Member() {
    }

    public Member(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    @Override
    public int hashCode() {
        return hakbun.hashCode();
    }

    public boolean equals(Object obj){

        if (obj instanceof Member){
            Member m =(Member) obj;
            return this.hakbun.equals(m.hakbun);


        }
         return false;

    }

}


