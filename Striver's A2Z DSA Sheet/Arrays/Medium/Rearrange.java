public class Rearrange {
    public static void main(String[] args) {
        int[] a = {1,2,-4,-5};
        int n = a.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<n;i++) {
            if(a[i]<0) {
                ans[neg] = a[i];
                neg+=2;
            }
            else {
                ans[pos] = a[i];
                pos+=2;
            }
        }
        for(int j : ans) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}