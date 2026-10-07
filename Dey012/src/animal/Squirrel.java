package animal;

public class Squirrel extends Animal
{
    private int count = 2;

    public Squirrel() {
    }

    public Squirrel(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    protected void sornd(){
        System.out.println("찍찍찍");

    }@Override
    protected void eat(){
        setKind( "다람쥐");
        setCount(5);
        System.out.println( getKind()+getCount()+"마리가 간식을 먹습니다.");
}



}
