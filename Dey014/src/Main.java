//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.join("이순신", new MemberService.MemberListener() {
            @Override
            public void onMemberJoin(String name) {
             System.out.println(name + "님에게 가입 축하 메시지를 보냅니다.");
            }
        });

        MemberService2 service2 = new MemberService2();
        service.join("세탁기", new MemberService.MemberListener() {
            @Override
            public void onMemberJoin(String name) {
                System.out.println( name + "완료되었어요");
            }
        });


    }
}//