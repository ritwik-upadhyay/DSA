import java.util.*;
public class Four_Sum {
    public static void main(String[] args) {
        int[] a = {1,0,-1,0,-2,2};
        int target = 0;
        Arrays.sort(a);
        int n = a.length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(i>0 && a[i]==a[i-1]) continue;
            for(int j=i+1;j<n;j++) {
                if(j>i+1 && a[j]==a[j-1]) continue;
                int left = j+1;
                int right = n-1;
                while(left<right) {
                    long sum = (long) a[i] + a[j] + a[left] + a[right];
                    if(sum == target) {
                        list.add(Arrays.asList(a[i],a[j],a[left],a[right]));
                        left++;
                        right--;
                        
                        while(left<right && a[left] == a[left+1]) left++;
                        while(left<right && a[right] == a[right-1]) right--;
                    }
                    else if(sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        System.out.println(list);
    }
}