package Queues;
import java.util.*;
public class binary {
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++) {
            s = q.poll();
            System.out.print(s + " ");
            
            q.offer(s + "0");
            q.offer(s + "1");
        }
        
    }
}