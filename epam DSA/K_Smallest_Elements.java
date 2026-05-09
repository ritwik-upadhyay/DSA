import java.util.PriorityQueue;
public class K_Smallest_Elements {
    public static int[] kSmallest(int[] a,int k) {
        
        //checking for invalid value of k
        if(k<=0 || k>a.length) {
            return new int[0];
        }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        //Adding array elements to priority queue
        for(int i : a) {
            minHeap.offer(i);
        }
        int[] r = new int[k];//Making a result array to store k smallest elements 
        for(int i=0;i<k;i++) {
            r[i] = minHeap.poll();//Polling k smallest elements from minheap
        }
        
        return r;
        
        
    }
    public static void main(String[] args) {
        int[] a = {7,10,4,3,20,15};//Taking a sample array
        int k = 3;//Sample K value
        int[] r = kSmallest(a,k);
        if(r.length==0) {
            System.out.println("No elements found.");//incase k value invalid
        }
        else {
            //Printing result
        System.out.println("The K Smallest elements are:-");
        System.out.print("[");
        for(int i=0;i<r.length;i++) {
            if(i==k-1) {
                System.out.print(r[i]+"]");
            }
            else {
                System.out.print(r[i]+",");
            }
        }
        System.out.println();
        }
    }
}