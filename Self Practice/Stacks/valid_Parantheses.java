import java.util.Stack;
import java.util.Scanner;
public class valid_Parantheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a set of parentheses");
            String s = sc.nextLine();
            for(char ch : s.toCharArray()) {
                if(ch=='('||ch=='{'||ch=='[') {
                    stack.push(ch);
                }
                else {
                    if(stack.isEmpty()) {
                        System.out.println("NO");
                        return;
                    }
            
            char top = stack.pop();
            if((ch==')' && top!='(')||
               (ch=='}' && top!='{')|| 
               (ch==']' && top!='[')) {
                   System.out.println("NO");
                   return;
               }
               
                }
   }
   if(stack.isEmpty()) {
            System.out.println("YES");
   }
   else {
            System.out.println("NO");
   }
   sc.close();
        }
}
}