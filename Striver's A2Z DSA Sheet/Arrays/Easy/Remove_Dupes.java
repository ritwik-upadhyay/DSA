public class Remove_Dupes {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3};
        int slow = 0;
        int n = a.length;
        for(int fast=1;fast<n;fast++) {
            if(a[slow]!=a[fast]) {
                slow++;
                a[slow] = a[fast];
            }
        }
        int k = slow + 1;
        for(int i=0;i<k;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(k);
    }
}