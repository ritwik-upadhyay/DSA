import java.util.*;
public class Three_Sum {
    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        Arrays.sort(a);
        int n = a.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(i>0 && a[i]==a[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left<right) {
                int sum = 0;
                sum+=a[i] + a[left] + a[right];
                if(sum == 0) {
                    list.add(Arrays.asList(a[i],a[left],a[right]));
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        System.out.println(list);
    }
}