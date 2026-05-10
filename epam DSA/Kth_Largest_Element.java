import java.util.PriorityQueue;//importing priority queue collection framework
public class Kth_Largest_Element {
    public static int kthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
        throw new IllegalArgumentException("Array must not be null or empty");
    }
    if (k < 1 || k > nums.length) {
        throw new IllegalArgumentException("k must be between 1 and nums.length");
    }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums) {
            minHeap.offer(num);
            //fixing size of minheap to store k largest elements
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();//top of heap = smallest among k largest elements
        
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int result = kthLargest(nums,k);
        System.out.println("The Kth Largest element with K being " + k + " is "+ result);
    }
}