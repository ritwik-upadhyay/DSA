import java.util.*;
public class Bitwise_XOR {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int prefixXOR = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n : a) {
            prefixXOR ^= n;
            int target = prefixXOR ^ k;
            if(map.containsKey(target)) {
                count += map.get(target);
            }
            map.put(prefixXOR,map.getOrDefault(prefixXOR,0)+1);
        }
        System.out.println(count);
    }
}