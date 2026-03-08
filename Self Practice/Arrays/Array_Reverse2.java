
public class Array_Reverse2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int l = 0;
        int r = a.length - 1;
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        while(l<r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}