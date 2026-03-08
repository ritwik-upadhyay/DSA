import java.util.Stack;
public class String_Reverse {
    public static void main(String[] args) {
        String s = "Taylor Swift";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            stack.push(s.charAt(i));
        }
        String w = "";
        for(int i=0;i<s.length();i++) {
            w = w + stack.pop();
        }
        System.out.println(w);
    }
}