import java.util.*;
public class Longest_Subsequence {
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        int n = a.length;
        int longest = 0;
        int cnt = 0;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++) {
            st.add(a[i]);
        }
        for(int it : st) {
            if(!st.contains(it-1)) {
                cnt = 1;
                int x = it;
                while(st.contains(x+1)) {
                    x = x+1;
                    cnt += 1;
                }
            }
            longest = Math.max(longest,cnt);
        }
        System.out.println(longest);
    }
}