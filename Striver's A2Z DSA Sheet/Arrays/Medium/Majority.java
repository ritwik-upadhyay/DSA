public class Majority {
    public static void main(String[] args) {
        int[] a = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int n = a.length;
        int cnt = 0;
        int el = 0;
        for(int i=0;i<n;i++) {
            if(cnt==0) {
                cnt = 1;
                el = a[i];
            }
            else if(el==a[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++) {
            if(a[i]==el) {
                cnt1++;
            }
        }
        if(cnt1>(n/2)) {
            System.out.println(el);
        }
        else {
            System.out.println(-1);
        }
    }
}