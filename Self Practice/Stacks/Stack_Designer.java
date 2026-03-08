import java.util.*;
public class Stack_Designer {

    public static Stack<Integer> push(int arr[]) {
        // Your code here
        Stack<Integer> s = new Stack<>();
        for(int a : arr) {
            s.push(a);
        }
        return s;
    }

    public static void pop(Stack<Integer> s) {

        
        // Your code here
        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}