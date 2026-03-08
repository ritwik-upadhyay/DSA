import java.util.*;
public class Leader {
    public static void main(String[] args) {
        int[] a = {10, 22, 12, 3, 0, 6};
        int n = a.length;
        int max = a[n-1];
        List<Integer> list = new ArrayList<>();
        if(n==0) System.out.println(list);
        list.add(max);
        for(int i=n-2;i>=0;i--) {
            if(a[i]>max) {
                max = a[i];
            }
            if(!list.contains(max)) {
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}