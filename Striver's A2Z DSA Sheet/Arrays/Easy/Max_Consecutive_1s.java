public class Max_Consecutive_1s {
    public static void main(String[] args) {
        int[] a = {1,1,0,0,0,1,1,1,1,1,0,1,0,1,1,0,0};
        int n = a.length;
        int cnt = 0;
        int maxi = 0;
        for(int i=0;i<n;i++) {
            if(a[i]==1) {
                cnt++;
            }
            else {
                cnt = 0;
            }
            maxi = Math.max(maxi,cnt);
        }
        System.out.println(maxi);
    }
}