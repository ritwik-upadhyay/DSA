import java.util.Stack;
public class Stack_ops {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(4);
        s.push(3);
        s.push(7);
        s.push(9);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.search(4));
    }
}