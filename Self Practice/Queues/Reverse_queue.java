package Queues;
import java.util.*;
public class Reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=4;i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        while(!queue.isEmpty()) {
            stack.push(queue.poll());
            
        }
        while(!stack.isEmpty())
        queue.offer(stack.pop());
        System.out.println(queue);
}
}