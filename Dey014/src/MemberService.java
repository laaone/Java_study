public class MemberService {

    // 중첩 인터페이스
    interface MemberListener {
        void onMemberJoin(String name);
    }

    // 회원가입 처리
    public void join(String name, MemberListener listener) {

        System.out.println(name + " 회원가입 처리 중...");

        // 회원가입 완료
        System.out.println("회원가입 완료!");

        // 가입 완료 후 알림
        listener.onMemberJoin(name);
    }
}



