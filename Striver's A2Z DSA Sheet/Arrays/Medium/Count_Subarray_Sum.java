import java.util.*;
public class Count_Subarray_Sum {
    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        int count = 0;
        int k = 6;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        for(int i : a) {
            prefixSum += i;
            int remove = prefixSum-k;
            if(map.containsKey(remove)) {
                count += map.get(remove);
            }
             map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        System.out.println(count);
    }
}