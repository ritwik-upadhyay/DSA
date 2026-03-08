import java.util.*;
public class Longest_Zero_Sum_Subarray {
    public static void main(String[] args) {
        int[] a = {9, -3, 3, -1, 6, -5};
        int n = a.length;
        int sum = 0;
        int maxi = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            sum += a[i];
            if(sum == 0) {
                maxi = i+1;
            }
            else {
                if(map.containsKey(sum)) {
                    maxi = Math.max(maxi,i-map.get(sum));
                }
                else {
                    map.put(sum,i);
                }
            }
        }
        System.out.println(maxi);
    }
}
