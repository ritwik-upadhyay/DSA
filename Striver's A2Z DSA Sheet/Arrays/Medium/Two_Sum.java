import java.util.*;
public class Two_Sum {
    public static void main(String[] args) {
        int[] a = {2,5,1,6,8};
        int target = 14;
        int n = a.length;
        int[] b = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        int flag = 0;
        for(int i=0;i<n;i++) {
            int complement = target - a[i];
            if(map.containsKey(complement)) {
                b[0] = map.get(complement);
                b[1] = i;
                flag++;
                break;
            }
            map.put(a[i],i);
        }
        if(flag==0) {
            b[0] = -1;
            b[1] = -1;
        }
        System.out.println(b[0] + "," + b[1]);
    }
}