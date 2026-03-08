import java.util.*;
public class next_Greater {
    public static void main(String[] args) {
        int[] a = {4, 5, 2, 10};
        int[] b = new int[4];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<a.length;i++) {
            
            while(!stack.isEmpty() && a[i]>a[stack.peek()]) {
                b[stack.pop()] = a[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            b[stack.pop()] = -1;
        }
        System.out.println(Arrays.toString(b));
    }
}