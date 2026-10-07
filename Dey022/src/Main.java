//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        In i1 = new In() {
            @Override
            public void m() {
                System.out.println("익명 구현 객체");

            }
        };//익명구현객체

        i1.m();
        In i2 = () -> System.out.println("람다식");
        i2.m();


        In2 ii1 = new In2() {
            @Override
            public int sum() {
                return 100;
            }
        };//익명형 구현객체
        In2 ii2 = () -> 300;
        System.out.println(ii1.sum());
        System.out.println(ii2.sum());

        In3 i3 = (a, b) -> {
            int sum = a + b;
            System.out.println(sum);
        };
        i3.add(10, 20);
        In3 i4 = (a, b) -> {
            int mul = a * b;
            System.out.println(mul);
        };
        i4.add(5, 4);

        In4 ii4 = (a, b, c) -> {
            if (c.equals("+")) return a + b;
            else if (c.equals("-")) return a - b;
            else if (c.equals("*")) return a * b;
            else if (c.equals("/")) return a / b;
            else return 0;
        };
        System.out.println(ii4.cal(10, 20, "+"));
        System.out.println(ii4.cal(10, 20, "-"));
        System.out.println(ii4.cal(10, 20, "*"));
        System.out.println(ii4.cal(20, 10, "/"));


        In4 ii5 = (a, b, c) -> {
            int r = (a + b) / 2;
            int answer = 0;
            if (r >= 90) answer = 1;
            else if (r >= 80) answer = 2;
            else if (r >= 70) answer = 3;
            else if (r >= 60) answer = 4;
            else answer = 5;
            System.out.println(c + " " + a + " " + b + " " + answer);
            return 0;
        };
        ii5.cal(100, 100, "홍길동");
        ii5.cal(60, 70, "이순신");
        ii5.cal(70, 72, "동장군");

        In4 ii6 = (a, b, c) -> {
        System.out.println( c + " " + a + " " + b + " " + a*b );
           return 0;
        };

        ii6.cal(100, 2, "세탁기");
        ii6.cal(200, 5, "냉장고");
    }


    }
