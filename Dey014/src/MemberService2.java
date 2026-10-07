public class MemberService2 {

    // 콜백을 위한 인터페이스
    interface Callback {
        void onComplete(String name);
    }

    // 회원가입 처리
    public void join(String name, Callback callback) {

        System.out.println("회원가입 처리 중...");

        // 실제로는 DB 저장 등의 작업
        System.out.println(name + " 회원가입 완료!");

        // 작업이 끝나면 콜백 호출
        callback.onComplete(name);
    }
}
