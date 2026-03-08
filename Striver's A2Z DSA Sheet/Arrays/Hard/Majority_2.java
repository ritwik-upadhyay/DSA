import java.util.*;
public class Majority_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 1, 3, 2};
        int n = a.length;
        List<Integer> l = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(cnt1==0 && el2!=a[i]) {
                cnt1++;
                el1 = a[i];
            }
            else if(cnt2==0 && el1!=a[i]) {
                cnt2++;
                el2 = a[i];
            }
            else if(el1==a[i]) {
                cnt1++;
            }
            else if(el2==a[i]) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        int mini = (n/3) + 1;
        for(int i=0;i<n;i++) {
            if(a[i]==el1) cnt1++;
            if(a[i]==el2) cnt2++;
        }
        if(cnt1 >= mini) l.add(el1);
        if(cnt2 >= mini && el1!=el2) l.add(el2);
        
        System.out.println(l);
    }
}