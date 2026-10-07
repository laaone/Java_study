//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Anonymous2 anony2 = new Anonymous2();
        anony2.field.turnOn();
        anony2.method1();
        anony2.method2(
         new RemoteControl(){

             @Override
             public void turnOn() {
             System.out.println("SmartTV를 켭니다.");

             }

             @Override
             public void turnOff() {
            System.out.println("SmartTV를 끕니다.");
             }
         }


        );






    Anonymous anony = new Anonymous();
    anony.field.wake();
    anony.method1();
    anony.method2(
            new Person(){
                void study(){
                    System.out.println("공부합니다.");
                }

                @Override
                void wake() {
                    System.out.println("8시에 일어납니다.");
                    study();

                }
            }



    );


    }
}