import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Stack<Coin> stack = new Stack<Coin>();
        stack.push(new Coin(100));
        stack.push(new Coin(50));
        stack.push(new Coin(80));
        stack.push(new Coin(100));

        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());
        System.out.println(stack.pop().getValue());

        Queue<Coin> queue = new LinkedList<Coin>();
        queue.offer(new Coin(100));
        queue.offer(new Coin(90));
        queue.offer(new Coin(85));
        queue.offer(new Coin(99));
        
        System.out.println( queue.poll().getValue() );
        System.out.println( queue.poll().getValue() );
        System.out.println( queue.poll().getValue() );
        System.out.println( queue.poll().getValue() );


    }
}