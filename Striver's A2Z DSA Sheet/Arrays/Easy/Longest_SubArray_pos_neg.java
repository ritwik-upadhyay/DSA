import java.util.*;
public class Longest_SubArray_pos_neg {
    public static void main(String[] args) {
       int[] a = {1, -1, 5, -2, 3};
       int k = 3;
       int n  = a.length;
       int sum = 0;
       int maxLen = 0;
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<n;i++) {
           sum += a[i];
           
           if(sum == k) {
               maxLen = i+1;
           }
           
           int rem = sum-k;
           if(map.containsKey(rem)) {
               int len = i - map.get(rem);
               maxLen = Math.max(maxLen, len);
           }
           
           if(!map.containsKey(sum)) {
               map.put(sum,i);
           }
    }
    System.out.println(maxLen);
    }
}